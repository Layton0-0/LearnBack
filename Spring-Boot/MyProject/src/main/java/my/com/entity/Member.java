package my.com.entity;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;
@Data
@Entity
@DynamicInsert  // insert를 할때 Entity 속성 중 null인 속성은 제외하고 쿼리 생성
@DynamicUpdate    //update 쿼리 생성 할때  entity속성 중에 변경된 적이 없는 속성은 제외하고 쿼리 생성 
public class Member {
	 @Id
	 private String userId;
	 private String password;
	 private String email;
	 private String grade;
	 private String tell;
	 
	 @Column(columnDefinition = "datetime default now()")// DDL 할때 컬롬 속성 지정 
	 private LocalDate regDate; //가입날짜
	 
	 @Column(columnDefinition = "int  default  0")
	 private Boolean isLeave; // 탈퇴 유무
	 
	 @Column(columnDefinition = "datetime default now()")
	   private LocalDate rentableDate;
}










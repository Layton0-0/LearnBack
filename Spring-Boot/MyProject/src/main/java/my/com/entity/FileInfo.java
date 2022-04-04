package my.com.entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


import lombok.Data;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class FileInfo {
	
	@Id
	@GeneratedValue
	private Long flIdx;
	private String originFileName;
	private String renameFileName;
	private String savePath;
	
	@Column(columnDefinition = "datetime default now()")
	private LocalDate regDate;
	
	@Column(columnDefinition = "int default 0")
	private Boolean isDel;	

}

package my.com.a.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MemberDto {

	private String id;
	private String pwd;
	private String name;
	private String email;
	private int auth;
	
}

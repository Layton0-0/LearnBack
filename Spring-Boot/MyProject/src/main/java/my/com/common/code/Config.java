package my.com.common.code;

public enum Config {
	
	
	DOMAIN("http://localhost:9090"),
	COMPANY_EMAIL("test@gmail.com"),
	SMTP_AUTHENTICATION_ID("test@gmail.com"),
	SMTP_AUTHENTICATION_PASSWORD("1234"),
	UPLOAD_PATH("C:\\MYCODE\\upload\\");

	public final String DESC;
	
	Config(String desc) {
		this.DESC = desc;
	}

	
	
}

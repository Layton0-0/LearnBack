package my.com.common.code;

public enum ErrorCode {
	DATABASE_ACCESS_ERROR("데이터베이스와 통신 중 에러가 발생"), 
	VALIDATOR_FAIL_ERROR("부적절한 양식의 데이터."),
	MAIL_SEND_FAIL_ERROR("이메일 발송 중 에러."), 
	HTTP_CONNECT_ERROR("HTTP 통신 중 에러."),
	AUTHENTICATION_FAILED_ERROR("유효하지 않은 인증."), 
	UNAUTHORIZED_PAGE_ERROR("접근 권한이 없는 페이지."),
	FAILED_FILE_UPLOAD_ERROR("파일업로드에 실패."), 
	REDIRECT("");
	

	public final String MESSAGE;
	public String URL;

	private ErrorCode(String msg) {
		this.MESSAGE = msg;
		this.URL = "/";
	}

	private ErrorCode(String msg, String url) {
		this.MESSAGE = msg;
		this.URL = url;
	}

	public ErrorCode setURL(String uRL) {
		URL = uRL;
		return this;
	}
}

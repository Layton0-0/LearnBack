package validate;

import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

//spring 에서 제공해주는 유효성 검사 클래스를 implements 하자 
@Service("fileValidator")
public class FileValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return false;
	}
	@Override
	public void validate(Object uploadFile, Errors errors) {
		UploadFile file = (UploadFile) uploadFile;		
		if (file != null) {
			if (file.getFile().getSize() == 0) {
				errors.rejectValue("file", "uploadForm", "야! 파일이 내용이 없잖아");
			}
		}		
	}	
}




package my.com.common.util.file;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.UUID;

import org.springframework.web.multipart.MultipartFile;

import my.com.common.code.Config;
import my.com.common.code.ErrorCode;
import my.com.common.exception.HandlableException;
import my.com.entity.FileInfo;



public class FileUtil {
	
	public FileInfo fileUpload(MultipartFile file) {
		
		FileInfo fileDTO = null;
		
		try {
			String uploadPath = createUploadPath(createSubPath()); // 지정된 경로로 디렉토리 형성
			fileDTO = createFileDTO(file);
			File dest = new File(uploadPath + fileDTO.getRenameFileName());
			file.transferTo(dest);
			System.out.println(dest);
		} catch (IllegalStateException | IOException e) {
			throw new HandlableException(ErrorCode.FAILED_FILE_UPLOAD_ERROR	,e);
		}
		
		return fileDTO;
	}
	
	private String createSubPath() {
		//2. 파일 업로드 날짜 기준으로 저장될 파일 경로 생성
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DAY_OF_MONTH);
		
		return year + "/" + month + "/" + date + "/";
	}
	
	private String createUploadPath(String subPath) {
		String uploadPath = Config.UPLOAD_PATH.DESC + subPath;
		
		File dir = new File(uploadPath);
		if(!dir.exists()) {
			dir.mkdirs();
		}
		return uploadPath;
	}
	
	private FileInfo createFileDTO(MultipartFile filePart) {
		String originFileName = filePart.getOriginalFilename(); //4. File_INFO 테이블에 저장할 FileDTO 생성
		String renameFileName = UUID.randomUUID().toString(); //1. 서버에 저장될 유니크한 파일이름 생성
		
		if(originFileName.contains(".")) {
			renameFileName = renameFileName + originFileName.substring(originFileName.lastIndexOf("."));
		}

		String savePath = createSubPath();
		
		FileInfo fileDTO = new FileInfo();		// 업로드 한 후 생성된 파일 이름을 DB에 저장할 수 있도록 entity에게 전달.	
		fileDTO.setOriginFileName(originFileName);
		fileDTO.setRenameFileName(renameFileName);
		fileDTO.setSavePath(savePath);
		
		return fileDTO;
	}
	
	public void removeFile(String path) {
		File file = new File(path);
		file.delete();
	}
	
	
	
	
	
	
	

}

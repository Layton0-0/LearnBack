package controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import validate.FileValidator;
import validate.UploadFile;
@Controller
public class UploadController {	
	
	@Autowired
	private FileValidator  fileValidator;   //유효성 검사
	
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/formview", method=RequestMethod.GET)  
    public String getUploadForm(@ModelAttribute  UploadFile uploadFile){		
         return "upload/uploadForm";  
    }  
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/upload", method=RequestMethod.POST)
public ModelAndView fileUpload( @ModelAttribute("uploadFile")
UploadFile uploadFile,                           BindingResult result){
				
		//유효성 검사
		fileValidator.validate(uploadFile, result);//폼에서 지정한 객체를 검사한다.  
		if(result.hasErrors()){ // 지정된 객체 내용에 오류가 있다면  
			return new ModelAndView("upload/uploadForm");// 다시 폼으로  요청된다.  
		}
		MultipartFile file=uploadFile.getFile(); //클라이언트가 올린  폼태그의  path ="file" 를 리턴받는다.	
		String filename=file.getOriginalFilename();//  원본이름을 리턴 받는다.  
		
		// uploadFile.jsp에서 사용할 객체  : 클라이언트가 올린 파일의 정보를 출력할페이지-----
		UploadFile fileobj=new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());
		//-------------------------------------------------------		
	  
		InputStream inputStream=null;
		OutputStream outputStream=null;		
		try{
			inputStream=file.getInputStream();				
			File newFile=new File("C:\\Users\\yesha\\Desktop\\코딩 공부\\멀캠\\Back\\LearnBack\\Spring-Boot\\TestFileUp\\WebContent\\storage" 
			   + "/" + filename);									
			if(! newFile.exists()){
				newFile.createNewFile();    
			}
			outputStream = new FileOutputStream(newFile); // 서버에 저장할 파일에 저장 객체를 생성  
			
			int read=0; //파일의 내용을 한자 씩 읽어서 리턴 할 변수 
			byte[] b=new byte[(int)file.getSize()]; // 파일의 크기만큼의 바이트 크기 			
			while((read = inputStream.read(b)) != -1){  //  파일 처음부터 마지막 까지 읽어서
				outputStream.write(b, 0, read); // 저장할 객체에 byte[]로 출력 한다.  
			}			
		}catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
				inputStream.close();
				outputStream.close();
			}catch(IOException e){}
		}
		
		return new ModelAndView("upload/uploadFile", "fileobj", fileobj);		
	}
	
	
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/download")
	@ResponseBody        // 중요!!!  -- 특정형태로 변환
	public byte[] fileDown(HttpServletRequest request, HttpServletResponse response, 
			                      @RequestParam String filename) throws IOException{
			
		/*String path=WebUtils.getRealPath(request.getSession().getServletContext(),
				     "/storage");			
		File file=new File(path + "/" + filename);
		*/
		File file=new File("C:\\Users\\yesha\\Desktop\\코딩 공부\\멀캠\\Back\\LearnBack\\Spring-Boot\\TestFileUp\\WebContent\\storage" 
				   + "/" + filename);	
		
				
		byte[] bytes=FileCopyUtils.copyToByteArray(file);		
		String fn=new String(file.getName().getBytes(), "8859_1");		
		response.setHeader("Content-Disposition", "attachment; filename=\"" + fn + "\"");
		response.setContentLength(bytes.length);
		response.setContentType("image/jpeg");		
		return bytes;
	}
}
/* @ResponseBody  
 *   HTTP요청의 본문 body부분이 그대로 전달된다
 *  @ResponseBody가 메서드 레벨에 부여되면 메서드가 리턴하는 오브젝트 뷰를 통해 
 *  결과를 만들어 내는 모델로 사용하는 대신, 메세지 컨버터를 통해 바로 HTTP응답의
 *  메세지 본문으로 변환된다.
 *  
 *  즉 , 요청한 형태에 맞춰서 메시지 변환기를 통해 결과값을 반환한다. 
*   이는 ContentNegotiatingViewResolver와는 동작방식이 좀 다르다. 
*   ContentNegotiatingViewResolver는 등록되어 있는 ViewResolver중에서 Controller 메소드의 
*   리턴값을 통해 등록된 ViewResolver 중에서 적합한 형태로 처리해서 반환한다. 
*   하지만, @ResponseBody는 @RequestBody가 선택한 형식으로 결과값을 변환하여 반환한다.
*   
*   ex) 컨트롤러 메서드에 @ResponseBody쓰여지면 메서드에서 View를 통하지 않고
*   HTTP의 Response  Body에 직접쓰여짐, 객체가 특정형태로 변함
*   (문자열, json, xml, 파일등)
*    
*/










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
	private FileValidator  fileValidator;   //��ȿ�� �˻�
	
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/formview", method=RequestMethod.GET)  
    public String getUploadForm(@ModelAttribute  UploadFile uploadFile){		
         return "upload/uploadForm";  
    }  
	//----------------------------------------------------------------------------------------------
	@RequestMapping(value="/upload", method=RequestMethod.POST)
public ModelAndView fileUpload( @ModelAttribute("uploadFile")
UploadFile uploadFile,                           BindingResult result){
				
		//��ȿ�� �˻�
		fileValidator.validate(uploadFile, result);//������ ������ ��ü�� �˻��Ѵ�.  
		if(result.hasErrors()){ // ������ ��ü ���뿡 ������ �ִٸ�  
			return new ModelAndView("upload/uploadForm");// �ٽ� ������  ��û�ȴ�.  
		}
		MultipartFile file=uploadFile.getFile(); //Ŭ���̾�Ʈ�� �ø�  ���±���  path ="file" �� ���Ϲ޴´�.	
		String filename=file.getOriginalFilename();//  �����̸��� ���� �޴´�.  
		
		// uploadFile.jsp���� ����� ��ü  : Ŭ���̾�Ʈ�� �ø� ������ ������ �����������-----
		UploadFile fileobj=new UploadFile();
		fileobj.setFilename(filename);
		fileobj.setDesc(uploadFile.getDesc());
		//-------------------------------------------------------		
	  
		InputStream inputStream=null;
		OutputStream outputStream=null;		
		try{
			inputStream=file.getInputStream();				
			File newFile=new File("C:\\Users\\yesha\\Desktop\\�ڵ� ����\\��ķ\\Back\\LearnBack\\Spring-Boot\\TestFileUp\\WebContent\\storage" 
			   + "/" + filename);									
			if(! newFile.exists()){
				newFile.createNewFile();    
			}
			outputStream = new FileOutputStream(newFile); // ������ ������ ���Ͽ� ���� ��ü�� ����  
			
			int read=0; //������ ������ ���� �� �о ���� �� ���� 
			byte[] b=new byte[(int)file.getSize()]; // ������ ũ�⸸ŭ�� ����Ʈ ũ�� 			
			while((read = inputStream.read(b)) != -1){  //  ���� ó������ ������ ���� �о
				outputStream.write(b, 0, read); // ������ ��ü�� byte[]�� ��� �Ѵ�.  
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
	@ResponseBody        // �߿�!!!  -- Ư�����·� ��ȯ
	public byte[] fileDown(HttpServletRequest request, HttpServletResponse response, 
			                      @RequestParam String filename) throws IOException{
			
		/*String path=WebUtils.getRealPath(request.getSession().getServletContext(),
				     "/storage");			
		File file=new File(path + "/" + filename);
		*/
		File file=new File("C:\\Users\\yesha\\Desktop\\�ڵ� ����\\��ķ\\Back\\LearnBack\\Spring-Boot\\TestFileUp\\WebContent\\storage" 
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
 *   HTTP��û�� ���� body�κ��� �״�� ���޵ȴ�
 *  @ResponseBody�� �޼��� ������ �ο��Ǹ� �޼��尡 �����ϴ� ������Ʈ �並 ���� 
 *  ����� ����� ���� �𵨷� ����ϴ� ���, �޼��� �����͸� ���� �ٷ� HTTP������
 *  �޼��� �������� ��ȯ�ȴ�.
 *  
 *  �� , ��û�� ���¿� ���缭 �޽��� ��ȯ�⸦ ���� ������� ��ȯ�Ѵ�. 
*   �̴� ContentNegotiatingViewResolver�ʹ� ���۹���� �� �ٸ���. 
*   ContentNegotiatingViewResolver�� ��ϵǾ� �ִ� ViewResolver�߿��� Controller �޼ҵ��� 
*   ���ϰ��� ���� ��ϵ� ViewResolver �߿��� ������ ���·� ó���ؼ� ��ȯ�Ѵ�. 
*   ������, @ResponseBody�� @RequestBody�� ������ �������� ������� ��ȯ�Ͽ� ��ȯ�Ѵ�.
*   
*   ex) ��Ʈ�ѷ� �޼��忡 @ResponseBody�������� �޼��忡�� View�� ������ �ʰ�
*   HTTP�� Response  Body�� ����������, ��ü�� Ư�����·� ����
*   (���ڿ�, json, xml, ���ϵ�)
*    
*/










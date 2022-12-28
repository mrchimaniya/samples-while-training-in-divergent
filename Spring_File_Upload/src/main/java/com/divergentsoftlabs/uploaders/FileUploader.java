package com.divergentsoftlabs.uploaders;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletContext;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@Component
public class FileUploader {
	
	public FileUploader() throws IOException 
	{
		//this is must if you are using new classpathresouce object
	}
	
  public final String UPLOAD_DIR=new ClassPathResource("static/image/").getFile().getAbsolutePath();
  
  
  public boolean uploadFile(MultipartFile file)
  { System.out.println(UPLOAD_DIR);
	boolean f=false;
	try {
		
    //Traditional Approach
	/*	  InputStream is=file.getInputStream(); byte[] b=new byte[is.available()];
		  is.read(b);
		  
		  FileOutputStream fos=new
		  FileOutputStream(UPLOAD_DIR+file.getOriginalFilename()); fos.write(b);
		  fos.flush();
		  fos.close();;
		  */
		
	Files.copy(file.getInputStream(),Path.of(UPLOAD_DIR+file.getOriginalFilename()),StandardCopyOption.REPLACE_EXISTING);
	f=true;
	} catch (Exception e) {
	     e.printStackTrace();
	}
	return f;

	  
  }
  
}

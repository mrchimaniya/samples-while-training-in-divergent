package com.divergentsoftlabs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.divergentsoftlabs.uploaders.FileUploader;

@RestController
public class FileUploadController {
    
	@Autowired
	private FileUploader fileUploader;
	
	@PostMapping("/upload")
	public ResponseEntity<String> upload(@RequestParam("file")MultipartFile file)
	{   
        
          //  System.out.println(file.getContentType());
		/* System.out.println(file.getSize()); System.out.println(file.getName());
		 * System.out.println(file.getOriginalFilename());
		 * System.out.println(file.getClass());
		 */
		if(file.isEmpty())
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Request Doesn't Contains Any File");
		/*
		 * if(!file.getContentType().equals("image/jpg") ||
		 * !file.getContentType().equals("image/png") ) return
		 * ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).
		 * body("Only jpg & png File Is Accepted");
		 */
		
		//file upload code
		boolean f = fileUploader.uploadFile(file);
		//System.out.println().toUriString());
		if(f)
			return ResponseEntity.ok( ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString() );
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something Went Wrong");
		
		
		
	}
	
}

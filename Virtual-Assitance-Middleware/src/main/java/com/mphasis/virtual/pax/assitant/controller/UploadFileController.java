package com.mphasis.virtual.pax.assitant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mphasis.virtual.pax.assitant.service.S3ServicesImpl;

 
@Controller
public class UploadFileController {
	
	@Autowired
	S3ServicesImpl s3Services;
	
	@RequestMapping("/api/file/upload")
    public String uploadMultipartFile(Model model,@RequestParam("keyname") String keyName, @RequestParam("uploadfile") MultipartFile file) {
		s3Services.uploadFile(keyName, file);
		model.addAttribute("Upload Successfully. -> KeyName = " + keyName);
		
		return "uploadStatus";
    }
    
//    @GetMapping("/uploadStatus")
//    public String uploadStatus() {
//        return "uploadStatus";
//    }
    
    @RequestMapping("/")
    public String UploadPage(Model model) {
       return "upload";
    }
}
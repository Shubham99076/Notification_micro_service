package com.mymail.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class MailService {
	
	 @Autowired
	    private JavaMailSender mailSender;
	 
	 
	 
	 
	 public void sendEmail(String emailId,String message1) {
	        // use mailSender here...
		 
		 String from = "mails.shubham9907@gmail.com";
				  
		 SimpleMailMessage message = new SimpleMailMessage();
		  
		 message.setFrom(from);
		 message.setTo(emailId);
		 message.setSubject("User Registration Successfully");
		 message.setText(message1);
		  
		 mailSender.send(message);
		 
	    } 


}

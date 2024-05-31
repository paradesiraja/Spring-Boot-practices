package com.nt.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import jakarta.mail.internet.MimeMessage;


@Service("purchaseorder")
public class PurchaseOrderImpl implements IPurchaseOrder {

	@Autowired
	private JavaMailSenderImpl sender;
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String purchase(String[] items, double[] prices, String[] emails)throws Exception {
		//calculate the bill amount
		double billamt=0.0;
		for(double p:prices)
			billamt=billamt+p;
		String msg=Arrays.toString(items)+"with prices "+Arrays.toString(prices)+"are purchased with billAmt"+billamt;
		//send mail
		String status=sendMail(msg,emails);
		return msg+"------->"+status;
		
	}
	private String sendMail(String msg,String[]emails) throws Exception {
		MimeMessage message=sender.createMimeMessage();//Empty mail message
		MimeMessageHelper helper=new MimeMessageHelper(message,true);
		
		helper.setFrom(fromEmail);
		helper.setCc(emails);
		helper.setSubject("open to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("pan.jpeg", new ClassPathResource("pan.jpeg"));
		sender.send(message);
		
		return "mail sent";
		
	}
	

}

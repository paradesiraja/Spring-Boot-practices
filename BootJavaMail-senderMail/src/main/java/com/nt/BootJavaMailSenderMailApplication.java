package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.service.IPurchaseOrder;

@SpringBootApplication
public class BootJavaMailSenderMailApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=	SpringApplication.run(BootJavaMailSenderMailApplication.class, args);
		
		//get service class 
		IPurchaseOrder order=ctx.getBean("purchaseorder",IPurchaseOrder.class);
		//invoke method
		try {
			String msg=order.purchase(new String[] {"short","towser","pant"},new double[] {5000.0,6000.0,7000.0},new String[] {"rajashekhar6a@gmail.com","rajashekhar7a@gmail.com","raaa6a@gmail.com"});
			System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	

}

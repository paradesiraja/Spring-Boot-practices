package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("stud")
@ConfigurationProperties(prefix = "stud.nit")
@Data
public class Student {
	private Integer sno;
	private String sname;
	private String saddrs;
	

}

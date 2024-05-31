package com.nt.document;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;


@Document
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Player {

	
	@Id
	private Integer pid;
	
	private String pname;
	
	private String paddr;
	
	private Set<Sport> sports;
	
	private Map<String,Medol> medals;

	@Override
	public String toString() {
		return "Player [pid=" + pid + ", pname=" + pname + ", paddr=" + paddr + "]";
	}
	
}

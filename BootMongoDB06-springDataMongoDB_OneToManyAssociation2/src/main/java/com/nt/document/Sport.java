package com.nt.document;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Document
@Setter
@Getter
//@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
public class Sport {

	
	@Id
	private Integer sid;
	
	private String sname;
	
	private String[] kitItems;

	@Override
	public String toString() {
		return "Sport [sid=" + sid + ", sname=" + sname + ", kitItems=" + Arrays.toString(kitItems) + "]";
	}


}

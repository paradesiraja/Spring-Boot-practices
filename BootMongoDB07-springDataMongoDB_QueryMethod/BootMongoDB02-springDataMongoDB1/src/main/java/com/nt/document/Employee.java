package com.nt.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document(collection ="Employee_Info")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @Id
	private Integer eno;
	@NonNull
	private String ename;
	@NonNull
	private String eadd;
	@NonNull
	private Double salary;
	@NonNull
	private Boolean isVaccinated;
}

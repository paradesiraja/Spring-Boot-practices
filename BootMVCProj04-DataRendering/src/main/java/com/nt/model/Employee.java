package com.nt.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {

	private Integer eno;
	private String ename;
	private Double salary;
	private Boolean isVaccinated;
}

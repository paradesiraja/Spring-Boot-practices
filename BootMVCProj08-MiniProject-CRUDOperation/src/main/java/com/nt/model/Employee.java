package com.nt.model;

import java.io.Serializable;
import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;


@Entity(name = "EMP")
@Data
public class Employee implements Serializable{
@Id
@SequenceGenerator(name = "gen1",sequenceName = "emp_id_seq",initialValue = 1,allocationSize = 10000)
@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
@Column(name = "EMPNO")
private Integer eno;

@Column(length = 20)
private String ename;

@Column(length = 20)
private String job;

private Float sal;
}

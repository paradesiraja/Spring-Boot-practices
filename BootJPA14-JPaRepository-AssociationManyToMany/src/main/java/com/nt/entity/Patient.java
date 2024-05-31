package com.nt.entity;

import java.io.Serializable;

import java.util.List;



import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="JPA_MTM_PATIENT")
@Setter
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Patient implements Serializable {

	@Id
	@SequenceGenerator(name = "gen1",sequenceName = "PID_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer pid;
	@Column(length = 20)
	@NonNull
	private  String pname;
	@NonNull
	private  Integer age;
	@Column(length = 20)
	@NonNull
	private  String problem;
	@ManyToMany(targetEntity = Doctor.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name = "JPA_MTM_DOCTORS_PATIENTS",joinColumns = @JoinColumn(name="Patient_id",referencedColumnName = "pid"),
	inverseJoinColumns = @JoinColumn(name="doctor_id",referencedColumnName = "did"))
	private List<Doctor> doctor;
	
	
	public Patient(String Pname,Integer age,String problem){
		this.pname =Pname;
		this.age =age;
		this.problem =problem;
		
	}


	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", pname=" + pname + ", age=" + age + ", problem=" + problem + "]";
	}
	
}

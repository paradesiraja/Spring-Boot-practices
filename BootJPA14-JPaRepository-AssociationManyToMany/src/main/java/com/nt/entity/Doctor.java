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
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="JPA_MTM_DOCTOR")
@Setter
@Getter
@RequiredArgsConstructor
public class Doctor implements Serializable {
   public Doctor(String dname,String Specialization){
	this.dname = dname;
	this.Specialization =Specialization;
	
	
    }
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer did;
	@Column(length = 20)
	@NonNull
	private  String dname;
	@Column(length = 20)
	@NonNull
	private   String Specialization;
	@ManyToMany(targetEntity = Patient.class,cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinTable(name ="JPA_MTM_DOCTORS_PATIENTS",joinColumns = @JoinColumn(name="doctor_id",referencedColumnName ="did"),
	inverseJoinColumns = @JoinColumn(name="Patient_id",referencedColumnName = "pid"))
	private List<Patient> patient;
	
	
		@Override
		public String toString() {
			return "Doctor [did=" + did + ", dname=" + dname + ", Specialization=" + Specialization + "]";

	}





}

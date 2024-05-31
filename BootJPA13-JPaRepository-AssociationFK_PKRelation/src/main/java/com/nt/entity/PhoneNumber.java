package com.nt.entity;

import java.io.Serializable;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name="JPA_PHONE_NUMBER")
@Setter
@Getter
@AllArgsConstructor
public class PhoneNumber implements Serializable{

	@Id
	@SequenceGenerator(name = "gen1",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Integer regNo;
	@NonNull
	private Long mobileNo;
	@Column(length = 20)
	@NonNull
	private String provider;
	@Column(length = 20)
	@NonNull
	private String numberType;
	
	@ManyToOne(targetEntity = Persion.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSION_ID",referencedColumnName = "PID")
	private Persion persion;
	
	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", mobileNo=" + mobileNo + ", provider=" + provider + ", numberType="
				+ numberType + "]";
	}
	public PhoneNumber() {
		System.out.println("PhoneNumber:0-param constructer");
	}
	
	
}

package com.nt.entity;

import java.io.Serializable;
import java.util.Set;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="JPA_OTM_PERSION")
@Setter
@Getter
//@RequiredArgsConstructor
@AllArgsConstructor
public class Persion implements Serializable{
	
	@Id
	@GeneratedValue
	private Integer pid;
	@Column(length=20)
	@NonNull
	private String name;
	@Column(length=20)
	@NonNull
	private String addrs;
	@OneToMany(targetEntity =PhoneNumber.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSION_ID",referencedColumnName = "PID")
	private Set<PhoneNumber> contactDetails;
	
	@Override
	public String toString() {
		return "Persion [pid=" + pid + ", name=" + name + ", addrs=" + addrs + "]";
	}

	public Persion() {
		System.out.println("Persion:0-param constructor");
	}
}

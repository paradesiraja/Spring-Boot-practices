package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
public class Customer {

	@Id
	@Column(name = "CID")
	//@SequenceGenerator(name = "gen1",sequenceName = "CUSTID_SEQ",initialValue = 1,allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer cno;
	@Column(name="CNAME",length = 20)
	private String cname;
	@Column(name = "CADD",length = 20)
	private String caddrs;
	@Column(name="BILLAMT")
	private Float billAmt;
}

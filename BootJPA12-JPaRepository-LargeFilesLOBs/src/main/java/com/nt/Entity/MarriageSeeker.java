package com.nt.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
//@NoArgsConstructor
@RequiredArgsConstructor
@Table

public class MarriageSeeker implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	@NonNull
	@Column(length = 20)
	private String name;
	@NonNull
	@Column(length = 20)
	private String addrs;
	@Lob
	@NonNull
	private byte[]photo;
	@NonNull
	private LocalDateTime dob;
	@NonNull
	@Lob
	private char[] biodata;
	@NonNull
	private Boolean indian;
}

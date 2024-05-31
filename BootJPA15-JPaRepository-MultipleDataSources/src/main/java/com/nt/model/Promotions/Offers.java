package com.nt.model.Promotions;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "MDS_OFFERS")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Offers implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer offerId;
	@Column(length = 30)
	@NonNull
	private String offerName;
	@Column(length = 30)
	@NonNull
	private String offerCode;
	@NonNull
	private Double dicountPercentage;
	@NonNull
	private LocalDateTime experyDate;
	
}

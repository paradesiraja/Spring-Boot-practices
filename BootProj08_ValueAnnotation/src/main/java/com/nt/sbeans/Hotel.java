package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {

	@Value("12345")
	private Integer hotelId;
	@Value("${hotel.name}")
	private String hotelName;
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	@Value("${hotel.contactno}")
	private String MobileNo;
	@Value("${customer.name}")
	private String custName;
	@Value("#{menuup.dosaprice+menuup.idlyPrice}")
	private Float billAmount;
	@Value("${os.name}")
	private String osName;
	@Value("${user.name}")
	private String windowUser;
	@Value("${Path}")
	private String pathData;
	@Value("${menu.discount}")
	private float discount;
	private double finalBillAmount;
	
	
	public double CalculateAmount( double minAmount) {
		if(billAmount>=minAmount) {
		 finalBillAmount=billAmount-(billAmount*discount/100.0f);
		}
		else {
			finalBillAmount=billAmount;
		}
		return finalBillAmount;
	
	}
	
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", MobileNo="
				+ MobileNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
				+ ", windowUser=" + windowUser + ", pathData=" + pathData + ", discount=" + discount
				+ ", finalBillAmount=" + finalBillAmount + "]";
	}
}

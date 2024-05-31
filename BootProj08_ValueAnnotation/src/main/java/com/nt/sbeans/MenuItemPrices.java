package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Component("menuup")
@Getter
public class MenuItemPrices {

	@Value("${menu.dosprice}")
	private Float dosaprice;
	@Value("${menu.idlyprice}")
	private Float idlyPrice;
	@Value("${menu.pohorata}")
	private Float pohorataPrice;
	@Value("${menu.vadapav}")
	private Float vadapavPrice;
}

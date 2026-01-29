package com.ktdsuniversity.edu.implement;
/**
 * Before
 * TV
 * SamsungSmartTV
 * 	    SamsungTV(TV + SamsungSmartTV)
 * LgSmartTV
 * 	    LgTV(TV + LgSmartTV)
 * 
 * 
 * After
 * TV
 * 	  SamsungSmartTV
 * 	       samsungTV
 * 	  LgSmartTV
 *         LgTV
 */
public interface SamsungSmartTV extends TV{
	
	
	void runNetflix();
	
	void runMenu();
	
	void runCoupangPlay();
	
	






}

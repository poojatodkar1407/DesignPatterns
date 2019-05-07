package com.bridgeit.proxypattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Proxy Design pattern.
 * Description : used when we want to provide controlled access of functionality.
 */
public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverHost) {
	
        System.out.println("Connecting to "+ serverHost); 
	}

	
}

package com.bridgeit.proxypattern;
/**
 * Created By:Pooja Todkar.
 * Date :04/05/2019.
 * Purpose :implementation of Proxy Design pattern.
 * Description : used when we want to provide controlled access of functionality.
 */
public class TestMain {
	public static void main (String[] args) 
    { 
        Internet internet = new ProxyInternet(); 
        try
        { 
            internet.connectTo("facebook.com"); 
            internet.connectTo("ijk.com"); 
        } 
        catch (Exception e) 
        { 
            System.out.println(e.getMessage()); 
        } 
    } 
}

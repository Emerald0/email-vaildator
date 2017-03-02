package com.example.email.validator;

import java.net.*;
import java.util.Scanner;
import java.io.*;
/**
 * Email
 *
 */
public class App 
{
    public static void main( String[] args)
    {
    	String emailAddr="";
    	
    	System.out.println("Enter you Email address: ");
    	Scanner email = new Scanner(System.in);
    	emailAddr=email.nextLine();
    	
    	if(validation(emailAddr)&&volidationLength(emailAddr)){
    		System.out.println("Your email is "+emailAddr);
    	}

    	
    	System.out.println(volidationLength(emailAddr));
    
    
    }



public static boolean validation(String email){
	if(!email.contains("@")){
		System.out.println("There is no @ symbole in that email address.");
		return false;
	}
	if(!email.contains(".")){
		System.out.println("There is no '.' symbole in that email.");
		return false;
	}
	if(email.indexOf("@")>1){
		return false;
	}
	
	return true; 
	
}

public static boolean volidationLength(String email){
	if(email.length()<8)
	{
		System.out.println("The length of the eamail has to be more than 8.");
		return false;
	}
	return true;
}


public static class checkDomain {
	  // Returns the IP address of an URL
	  // i.e. http://www.facebook.com -> 123.456.789.10
	  public static String getIp( String hostname ) throws IOException {
	    try {
	      InetAddress ipaddress = InetAddress.getByName(hostname);
	      System.out.println("IP address: " + ipaddress.getHostAddress());
	      return ipaddress.getHostAddress();
	    }
	    catch ( UnknownHostException e ){
	      System.out.println("Could not find IP address for: " + hostname);
	      throw new IOException("Could not find IP address for: " + hostname);
	    }
	  }
	}

}






















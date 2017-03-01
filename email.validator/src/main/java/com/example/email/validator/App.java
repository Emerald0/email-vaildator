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
    public static void main( String[] args )
    {
    	String emailAdd="";
    	
    	System.out.println("Enter you Email address: ");
    	Scanner email = new Scanner(System.in);
    	String email1=email.nextLine();
    	
    	if(validation(email1)){
    		System.out.println("Your email is "+email1);
    	}
    	
    	else{
    		System.out.println("This is not a valid address.");
    	}

    
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


}






















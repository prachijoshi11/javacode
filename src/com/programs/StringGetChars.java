package com.programs;

public class StringGetChars {
public static void main(String[] args) {
	String s1 = new String("hello javatpoint how r u");  
	
	char[]carr= new char[10];
	
	

try{  
   s1.getChars(6, 16, carr, 0);  
   System.out.println(carr);  
}catch(Exception ex){System.out.println(ex);}  
}}  
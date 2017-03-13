package com.thinkInJava.Thread.ch1;

public class Main {
	public static void main(String[] args) {
		double i=1;
	     int k = 1;
	     for(k=1;0.33 < i;k++){  
	       double y=((100-99*i)/101+99*i)/100;
	       System.out.println(i);
	       i = y;
	     }
	     System.out.println(k);
	}
}

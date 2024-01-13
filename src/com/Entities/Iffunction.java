package com.Entities;
import java.util.Scanner;
public class Iffunction {
	 public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the First number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();
            if(num1>num2) {
	        System.out.println(num1+"is greater than"+num2);
	       
            }
            else if(num2>num1) {
	        System.out.println(num2+"is greater than"+num1);
            }
            else{
    	        System.out.println(num1+"is equal to"+num2);
    	       
                }
	    }
}

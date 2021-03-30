package com.senati.eti;
import java.util.Scanner;
public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese edad: ");
	     int edad = sc.nextInt();
	     
	     if(edad>=18)
	    	 System.out.println("Mayor de edad");
	     else
	    	 System.out.println("Menor de edad");
	}

}

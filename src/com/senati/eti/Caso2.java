package com.senati.eti;
import java.util.Scanner;
public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese numero: ");
	     int n = sc.nextInt();
	     
	     String mensaje = "Numero es par";
	     
	     if (n % 2 !=0)
	    	 mensaje = "Numero es impar";
         
	     System.out.println("Resultados");
	     System.out.println("=============="); 
       	 System.out.println("Aprobados: " + mensaje);
	}

}

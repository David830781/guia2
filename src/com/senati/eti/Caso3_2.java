package com.senati.eti;
import java.util.Scanner;
public class Caso3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese primer numero: ");
	    int n1 = sc.nextInt();
	        
	    System.out.print("Ingrese segundo numero: ");
        int n2 = sc.nextInt();
        
        System.out.print("Ingrese segundo numero: ");
        int n3 = sc.nextInt();
        
        if (n1 > n2)
        	System.out.println("Primer numero es mayor");
        else
        	System.out.println("Segundo numero es mayor");
        
        String estado = "";
        
        if (n1 == n2 && n1 == n3)
            estado ="Los tres numeros son iguales";
        else if (n1 > n2 && n1 > n3)
        	estado = "El primer numero "+ n1 +" es mayor";
        else if (n1 > n2 && n1 > n3)
        	estado = "El segundo numero "+ n2 +" es mayor";
        else if (n1 > n2 && n1 > n3)
        	estado = "El tercer numero "+ n3 +" es mayor";
        
        	
        	
	}

}

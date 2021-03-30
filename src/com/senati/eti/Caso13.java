package com.senati.eti;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		String op="";
		
		System.out.println("Ingrese primer numero: ");
		float n1 = sc.nextFloat();
		
		System.out.println("Ingrese segundo numero: ");
		float n2 = sc.nextFloat();
		
		System.out.println("Operacion [1-6]: ");
		int nop = sc.nextInt();
		
		
		float pr=0;
		
		
		switch (nop) {
		case 1:
			op= "Suma";
			pr=n1+n2;
			break;
		case 2:
			op = "Resta";
			pr=n1-n2;
			break;
		case 3:
			op = "Multiplicacion";
			pr=n1*n2;
			break;
		case 4:
			if(n2 == 0) {  
				op="Division Imposible";
			    pr=0;
			}   
			else {
				op="Division";
				pr=n1/n2;
			}
			break;
			
		case 5:
			if(n2 == 0){
			
				op="No es posible hallar el resto";
			    pr=0;
			}
			else {	
			    op = "Resto entero";
			    pr=n1%n2;
			}
			    break;
		case 6:
			op = "Promedio";
			pr= (n1+n2)/2;
			break;
		default:
			op = "Operacion invalida";
			pr=0;
			break;
		
		}
		System.out.println("\n====== Resultados ==========");
		System.out.println("Numero 1: "+ n1);
		System.out.println("Numero 2: "+ n2);
		System.out.println("Operacion: "+ op);
		System.out.println("Resultado: "+ pr);
	}
}

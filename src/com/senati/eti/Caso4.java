package com.senati.eti;
import  java.util.Scanner ;
public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Caso 4: Lea dos n�meros y muestre un mensaje si son iguales o cu�l es el menor de ambos.
		//variables
		int num1 , num2 ;
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		System.out.println("ingrese el numero 1: ");
		num1=sc.nextInt();
		System.out.println("ingresa el numero 2: ");
		num2=sc.nextInt();
		//resolviendo
				if (num1==num2) {
					System.out.println("son iguales..");
				}
				else if (num1<num2) {
					System.out.println("el menor es "+num1);
				}
				else {
					System.out.println("el menor es: "+num2);
				}
	}

	}



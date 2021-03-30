package com.senati.eti;

import java.util.Scanner;

public class Caso4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Caso 4: Lea 4  numeros y muestre un mensaje si son iguales o cual es el menor de ambos.
				//variables
				int num1 , num2 , num3 , num4 ;
				//entrada de datos
				Scanner sc=new Scanner(System.in);
				System.out.println("ingrese el numero 1: ");
				num1=sc.nextInt();
				System.out.println("ingresa el numero 2: ");
				num2=sc.nextInt();
				System.out.println("ingrese el numero 3: ");
				num3=sc.nextInt();
				System.out.println("ingresa el numero 4: ");
				num4=sc.nextInt();
				//resolviendo
						if (num1==num2 && num1 == num3 && num1 == num4) {
							System.out.println("son iguales..");
						}
						else if (num1<num2 && num1<num3  && num1<num4) {
							System.out.println("el menor es "+num1);
						}
						else if (num2<num1 && num2<num3  && num2<num4) {
							System.out.println("el menor es "+num2);
						}
						else if (num3<num1 && num3<num2  && num3<num4) {
							System.out.println("el menor es "+num3);
						}
						else {
							System.out.println("el menor es "+num4);
						}
						
	}

}

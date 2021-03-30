package com.senati.eti;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double imp=0;
		System.out.println("Ingrese sueldo: ");
		int sld = sc.nextInt();
		
		if(sld>2800) {
			imp=sld*0.05;
		}
		else {
			imp=sld*0.02;
		}
		
		System.out.println("Impuesto Calculado: "+imp);
	}

}

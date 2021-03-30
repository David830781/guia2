package com.senati.eti;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double imp=0;
		float sld=0;
		System.out.println("Ingrese sueldo: ");
		sld = sc.nextFloat();
		
		if(sld < 1500) {
			imp=sld*0.03;
		}
		else if(sld>1500 && sld<3000) {
			imp=sld*0.08;
		}
		else if(sld>3000) {
			imp=sld*0.012;
		}
		System.out.println("Impuesto Calculado: "+imp);
	}
	}



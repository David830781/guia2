package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("·0.00");
		
		
		System.out.println("Empleado: ");
		String nombre = sc.nextLine();
		
		System.out.println("Nivel [1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.println("Ingrese sueldo: ");
		int sld = sc.nextInt();
		
		float inc = 0;
		
		switch (nivel) {
		case 1:
			inc = 0.045f;
			break;
		case 2:
			inc = 0.06f;
			break;
		case 3:
			inc = 0.085f;
			break;
		case 4:
			inc = 0.11f;
			break;
		default:
			inc = 0;
			break;
			
		}
		float psld=sld*inc;
		float nsld=sld+psld;
		
		
		System.out.println("\n====== Resultados ==========");
		System.out.println("Empleado: "+nombre);
		System.out.println("Nivel: "+ nivel);
		System.out.println("Sueldo: "+ sld);
		System.out.println("Incremento: "+ inc +"%");
		System.out.println("Nuevo sueldo: "+ df.format(nsld));
		
	}

}

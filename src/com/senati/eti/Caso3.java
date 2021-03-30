package com.senati.eti;
import java.util.Scanner;
//imports
public class Caso3 {

	public static void main(String[] args) {
		// Escaneres
		Scanner sc = new Scanner(System.in);
		//Solicitamos los 4 numeros 
		System.out.print("Ingrese primer numero: ");
	    int n1 = sc.nextInt();
	        
	    System.out.print("Ingrese segundo numero: ");
        int n2 = sc.nextInt();
        
        System.out.print("Ingrese tercer numero: ");
        int n3 = sc.nextInt();
        
        System.out.print("Ingrese Cuarto numero: ");
        int n4 = sc.nextInt();
        
        //En caso de que los 4 numeros o 2 de ellos sean iguales
        if (n1>=0) {
			if (n1==n2 || n1 ==n3  ) {
				System.out.println("el numero "+n1+" se repite ");
			}
			else if (n2==n1 || n2 ==n3 ||n2==n4) {
				System.out.println("el numero "+n2+" se repite ");
			}
			else if (n3==n1 || n3 ==n2 ||n3==n4) {
				System.out.println("el numero "+n3+" se repite ");
			}
			else if (n4 ==n1 ||n4==n2 ||n4==n3) {
				System.out.println("el numero "+n4+" se repite ");
			}
			
        //En caso de que uno de los 4 sean mayores
        
   else if (n1 > n2 && n1>n3) {
        	System.out.println("El mayor es: " + n1);
        }
        else if (n2 > n1 && n2>n3){
        	System.out.println("El mayor es: " + n2);
        }
        else if(n3 > n1 && n3>n2){
        	System.out.println("El mayor es: " + n3);
        }
        else {
        	System.out.println("El mayor es: " + n4);
        }
        }
	}
	}


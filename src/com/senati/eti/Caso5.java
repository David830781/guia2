package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Caso 5: Lea un precio y una cantidad, luego calcule descuento del 10% del total (precio * cantidad) 
				//si la cantidad es superior a 8, caso contrario ser� 0, adem�s calcule el neto.
				//variables principales
				float precio,desc=0,neto=0;
				int cant;
				
				//entrada de datos
				Scanner sc = new Scanner(System.in);
				System.out.println("ingresa el precio: ");
				precio=sc.nextFloat();
				System.out.println("ingresa la cantidad: ");
				cant=sc.nextInt();
				//resolvemos
				//total
				float total=precio*cant;
				//condicionales (descuento 10% = 0.10)
				if (cant>8) {
					desc =(float)(total*0.10);
				}
				else {
					desc=(total*0);
				}
				//neto
				neto=total-desc;
				System.out.println("el total es: "+total);
				System.out.println("el descuento es: "+desc);
				System.out.println("el precio neto es: "+neto);
			}

	}



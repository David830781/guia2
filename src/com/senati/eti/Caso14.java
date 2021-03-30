package com.senati.eti;
import java.util.Scanner;
public class Caso14 {

	public static void main(String[] args) {
		       String alumno, carrera,turno;

				double desc=0,monto=0,tpa,dolar;
				//entrada de datos 
				Scanner sc=new Scanner(System.in);
				System.out.println("ingresa tu nombre: ");
				alumno=sc.nextLine();
				System.out.println("ingresa tu carrera[DS/RC/DG]: ");
				carrera=sc.nextLine();
				System.out.println("ingresa tu turno[M/T/N]: ");
				turno=sc.nextLine();
				//calcular if /switch
				carrera=carrera.toUpperCase();
				
				switch (carrera) {
				case "DS":
					monto=1500;
					break;
				case "RG":
					monto=1400;
					break;
				case "DG"  :
					monto=1300;
					break;
				default:
					monto=0;
					break;
					}
				
				turno=turno.toUpperCase();
				switch (turno) {
				case "M":
					desc=(monto*0.1);
					break;
				case "T":
					desc=(monto*0.2);
					break;
				case "N":
					desc=(monto*0.15);
					break;
				default:
					desc=monto;
					break;
					
				}
				
				
				
				//monto total
				tpa=(monto-desc);
				//cambio en dolares
				dolar=tpa*3.33;
				
				//salida de datos
				System.out.println("alumno: "+alumno);
				System.out.println("carrera: "+carrera);
				System.out.println("turno: "+turno);
				System.out.println("el monto por carrera: "+monto);
				System.out.println("el descuento: "+desc);
				System.out.println("el monto total: "+tpa);
				System.out.println("el monto en dolares: "+dolar);
				
	}	
			}


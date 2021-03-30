package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		String clnt,prd,md,pr,fmdp;
		double imp=0;
		pr="";
		fmdp="";
		System.out.println("Nombre del cliente: ");
		clnt=sc.nextLine();
		
		System.out.println("Ingrese tipo de producto [TB,LT,MN,IM]: ");
		prd=sc.nextLine();
		
		
		System.out.println("Ingrese Forma de pago [C1,C2]: ");
		md=sc.nextLine();
		
		System.out.println("Ingrese cantidad: ");
		int cnt=sc.nextInt();
		
		
		
		prd=prd.toUpperCase();
		int precio=0;
		
		switch (prd) {
		case "TB":
			precio=350;
			pr="Tablet";
			break;
		case "LT":
			precio=2300;
		    pr="Laptop";
			break;
		case "MN"  :
			precio=850;
			pr="Monitor";
			break;
		case "IM"  :
			precio=680;
			pr="Impresora";
			break;
		default:
			precio=0;
			break;
			}
		imp=precio*cnt;
		double tpa=0;
		double desc=0;
		
		
		md=md.toUpperCase();
		switch (md) {
		case "C1":
			desc=(imp*0.05);
			tpa=(imp-desc);
			fmdp="CONTADO";
			break;
		case "C2":
			desc=(imp*0.12);
			tpa=(imp-desc);
			fmdp="CREDITO";
			break;
		default:
			desc=0;
			tpa=(imp-desc);
			break;
			
			
		}
		
		
		System.out.println("\nCliente: "+clnt);
		System.out.println("Producto: "+pr);
		System.out.println("Precio: "+precio);
		System.out.println("Cantidad: "+cnt);
		System.out.println("Importe: "+imp);
		System.out.println("Forma de pago: "+fmdp);
		System.out.println("Descuento: "+desc);
		System.out.println("Total a pagar: "+tpa);
	}

}

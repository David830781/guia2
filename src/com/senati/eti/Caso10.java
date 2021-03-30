package com.senati.eti;
import java.text.DecimalFormat;
import java.util.Scanner;
//Aplico los respectivos imports
public class Caso10 {

	public static void main(String[] args) {
		// defino las variables de los escaners
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		//Defino el bn y descuento como decimales
		//y nombre como texto
		double bn=0,dsc=0;
		String nombre = "";
		
		//Solicitamos datos al usuario
		System.out.println("Trabajador: ");
		nombre = sc.next();
		
		System.out.println("Horas trabajadas: ");
		float hrs = sc.nextFloat();
		
		System.out.println("Tarifa por horas: ");
		float trf = sc.nextFloat();
		
		System.out.println("Numeros de minutos por tardanza: ");
		float trdns = sc.nextFloat();
		
		//Procedemos a las operaciones
		float imp = hrs*trf;
		
		//horas
		if(hrs>60)
		   bn=imp*0.13;
		else
			bn=imp*0.4;
		//min tarde
		if(trdns>15)
			   dsc=imp*0.3;
			else
				dsc=imp*0;
		//porcentaje de meta de las 70 horas
		int tlt = 70;
        float alc = (hrs*100)/tlt;
        
        
        //Mostramos la salida de los datos 
        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("\nTrabajador: " + nombre);
        System.out.println("Horas trabajadas: "+ hrs);
        System.out.println("Tarifa por horas: "+ trf);
        System.out.println("Importe: "+ imp);
        System.out.println("Bono: "+ df.format(bn));
        System.out.println("Descuento: "+ dsc);
        System.out.println("Meta alcanzada: "+ df.format(alc) +"%");
        
	}

}

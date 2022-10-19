package capitulo4;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		
		
		float precio_tarta;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Elija un sabor (manzana, fresa o chocolate): ");
		String entrada = s.nextLine();
		if(entrada=="manzana") {
			precio_tarta=18;
		}else if(entrada=="fresa"){
			precio_tarta=16;
		}else {
			System.out.println("¿Qué tipo de chocolate quiere? (negro o blanco): ");
			entrada=s.nextLine();
			if(entrada=="negro") {
				precio_tarta=14;
			}else {
				precio_tarta=15;
			}
			
		}
		
		boolean nata;
		System.out.println("¿Quiere nata? (si o no): ");
		entrada = s.nextLine();
		if("si"==entrada) {
			nata=true;
		}else {
			nata=false;
		}
		
		boolean nombre;
		System.out.println("¿Quiere ponerle un nombre? (si o no): ");
		entrada = s.nextLine();
		if("si"==entrada) {
			nombre=true;
		}else {
			nombre=false;
		}
		
		

			
		if(precio_tarta==18) {
			System.out.println("Tarta de manzana: "+precio_tarta+".00$");
		}else if(precio_tarta==16) {
			System.out.println("Tarta de fresa: "+precio_tarta+".00$");
		}else if(precio_tarta==14) {
			System.out.println("Tarta de chocolate negro: "+precio_tarta+".00$");
		}else {
			System.out.println("Tarta de chocolate blanco:"+precio_tarta+".00$");
		}
		if(nata) {
			System.out.println("Con nata: 2.50$");
			precio_tarta+=2.50;
		}
		if(nombre) {
			System.out.println("Con nombre: 2.75$");
			precio_tarta+=2.75;
		}
		
		System.out.println("Total: "+precio_tarta+"$");
		
		
		
	}
	
	
}

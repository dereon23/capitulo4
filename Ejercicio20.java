package capitulo4;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número positivo de hasta 5 cifras: ");
		int numero = Integer.parseInt(s.nextLine());
		
		if(numero/10000>0) {
			if(numero/10000==(numero%10) && (numero/1000)%10==(numero/10)%10) {
				System.out.println("Es capicúo");
			}
			else {
				System.out.println("No es capicúo");
			}
			
		}else if(numero/1000>0) {
			if(numero/1000==numero%10 && (numero/100)%10==(numero/10)%10) {
				System.out.println("Es capicúo");
			}
			else {
				System.out.println("No es capicúo");
			}
			
		}else if(numero/100>0) {
			if(numero/100==numero%10) {
				System.out.println("Es capicúo");
			}
			else {
				System.out.println("No es capicúo");
			}
			
		}else if(numero/10>0) {
			if(numero/10==numero%10) {
				System.out.println("Es capicúo");
			}
			else {
				System.out.println("No es capicúo");
			}
		}else {
			System.out.println("Es capicúo");
		}
		
		s.close();
		
	}
	
}

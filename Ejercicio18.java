package capitulo4;

import java.util.Scanner;

public class Ejercicio18 {


		public static void main(String[] args) {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("Introduzca un número positivo de hasta 5 cifras: ");
			int numero = Integer.parseInt(s.nextLine());
			
			if(numero/10000>0) {
				System.out.println("El primer dígito es "+numero/10000);
			}else if(numero/1000>0) {
				System.out.println("El primer dígito es "+numero/1000);
			}else if(numero/100>0) {
				System.out.println("El primer dígito es "+numero/100);
			}else if(numero/10>0) {
				System.out.println("El primer dígito es "+numero/10);
			}else {
				System.out.println("El primer dígito es "+numero);
			}
			
			s.close();
			
			
		}
	
}

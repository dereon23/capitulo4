package capitulo4;
import java.util.*;

public class Ejercicio21 {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Nota del primer control: ");
		String entrada = s.nextLine();
		int examen1 = Integer.parseInt(entrada);

		
		System.out.println("Nota del segundo control: ");
		entrada = s.nextLine();
		int examen2 = Integer.parseInt(entrada);
		
		float media = (float)((examen1+examen2)/2);
		
		if(media>5) {
			System.out.println("Tu nota de Programación es "+media);
		}else {
			
			System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
			entrada = s.nextLine();
			switch(entrada) {
				case "apto":{
					System.out.println("Tu nota de Programación es 5");
					break;
					
				}
				case "no apto":{
					System.out.println("Tu nota de Programación es "+media);
					break;
					
				}
				default:{
					System.out.println("Hay que introducir apto o no apto");
					
				}
			}
		}
		
		s.close();
	}

}

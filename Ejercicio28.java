package capitulo4;
import java.util.*;

public class Ejercicio28 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		boolean no_error=true;
		
		System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
		String entrada1 = s.nextLine();
		switch(entrada1) {
			case "piedra":{
				break;
			}
			case "papel":{
				break;
			}
			case "tijera":{
				break;
			}
			default:{
				no_error=false;
			}
		}
		
		System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
		String entrada2 = s.nextLine();
		switch(entrada2) {
		case "piedra":{
			break;
		}
		case "papel":{
			break;
		}
		case "tijera":{
			break;
		}
		default:{
			no_error=false;
		}
	}
		
		if(no_error) {
			if(entrada1==entrada2) {
				System.out.println("empate");
			}
			else if(entrada1=="piedra") {
				if(entrada2=="papel") {
					System.out.println("Gana el Jugador 2");
				}else {
					System.out.println("Gana el Jugador 1");
				}
			}else if(entrada1=="papel") {
				if(entrada2=="piedra") {
					System.out.println("Gana el Jugador 1");
				}else {
					System.out.println("Gana el Jugador 2");
				}
			}else {
				if(entrada2=="piedra") {
					System.out.println("Gana el Jugador 2");
				}else {
					System.out.println("Gana el Jugador 1");
				}
			}
		}else {
			System.out.println("Corrija las entradas");
		}
		
		
	}

}

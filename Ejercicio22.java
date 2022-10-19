package capitulo4;
import java.util.Scanner;

public class Ejercicio22 {
	
	public static void main(String[] args) {
		
		System.out.println("¿Qué día de la semana es?: ");
		Scanner s = new Scanner(System.in);
		String entrada = s.nextLine();
		int tiempo_restante=0;
		
		switch(entrada) {
			case "Lunes": 
			{
				tiempo_restante = 3*24+15;
				break;
			}
			case "Martes":
			{
				tiempo_restante = 2*24+15;
				break;
			}
			case "Miércoles": {
				tiempo_restante = 24+15;
				break;
			}
			case "Jueves":
			{
				tiempo_restante = 15;
				break;
			}
			default:{}
		}
		
		System.out.println("¿Qué hora sin minutos y formato 24 es?: ");
		entrada = s.nextLine();
		tiempo_restante = (tiempo_restante+24-(Integer.parseInt(entrada)))*60;
		System.out.println("Tiempo restante para el fin de semana: "+tiempo_restante+" minutos");
		
		
		
		
				
		
	}

}

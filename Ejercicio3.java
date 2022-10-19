package capitulo4;

public class Ejercicio3 {
	
public static void main(String[] args) {
		
		System.out.print("Introduzca el día de la semana en número(1 al 7): ");
		String dia_numero = System.console().readLine();
		int dia_semana = Integer.parseInt(dia_numero);
		
		
		String dia_escrito;
		switch (dia_semana) {
			case 1:
				 dia_escrito= "Lunes";
				System.out.println(dia_escrito);
			break;
			
			case 2:
				dia_escrito = "Martes";
				System.out.println(dia_escrito);

			break;
			
			case 3:
				 dia_escrito= "Miércoles";
				System.out.println(dia_escrito);

			break;
			
			case 4:
				 dia_escrito= "Jueves";
				System.out.println(dia_escrito);

			break;
			
			case 5:
				 dia_escrito= "Viernes";
				System.out.println(dia_escrito);
				
			break;
			
			case 6:
				 dia_escrito= "Sábado";
				System.out.println(dia_escrito);
				
			break;
			
			case 7:
				 dia_escrito= "Domingo";
				System.out.println(dia_escrito);
				
			break;
			
			default:
				System.out.println("Hay que introducir un número del 1 al 7");
		}
		
	}

}

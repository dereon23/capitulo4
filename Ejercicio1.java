package capitulo4;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca el día de la semana en minúscula: ");
		String dia_semanal = System.console().readLine();
		
		String asignatura_primera_hora;
		
		
		switch (dia_semanal) {
			case "lunes":
				asignatura_primera_hora = "Programación";
				System.out.println(asignatura_primera_hora);
			break;
			
			case "martes":
				asignatura_primera_hora = "Sistemas Informáticos";
				System.out.println(asignatura_primera_hora);

			break;
			
			case "miércoles":
				asignatura_primera_hora = "Entornos de Desarrollo";
				System.out.println(asignatura_primera_hora);

			break;
			
			case "jueves":
				asignatura_primera_hora = "Programación";
				System.out.println(asignatura_primera_hora);

			break;
			
			case "vierness":
				asignatura_primera_hora = "Formación y Orientación Laboral";
				System.out.println(asignatura_primera_hora);
			break;
			
			default:
				System.out.println("Hay que introducir un día laboral en minúsculas");
		}
		
	}


}

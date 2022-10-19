package capitulo4;

public class Ejercicio11 {
	
public static void main(String[] args) {
		

		
		System.out.println("Por favor, introduzca la hora en formato 24 sin minutos: ");
		String entrada = System.console().readLine();
		int hora = Integer.parseInt(entrada);
		
		System.out.println("Ahora introduzca los minutos: ");
		entrada = System.console().readLine();
		int minutos = Integer.parseInt(entrada);
		
		final int tiempo_total = 24*60*60;
		int tiempo_restante = tiempo_total - hora*60*60 - minutos*60;
		
		System.out.println("Quedan " + tiempo_restante + " segundos para medianoche");
		

		
	}

}

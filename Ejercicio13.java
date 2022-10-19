package capitulo4;

public class Ejercicio13 {

	public static void main(String[] args) {
		

		
		System.out.println("Por favor, introduzca un número: ");
		String entrada = System.console().readLine();
		int numero1 = Integer.parseInt(entrada);
		
		System.out.println("Ahora otro número: ");
		entrada = System.console().readLine();
		int numero2 = Integer.parseInt(entrada);
		
		System.out.println("Ahora otro número más: ");
		entrada = System.console().readLine();
		int numero3 = Integer.parseInt(entrada);
		
		int repuesto;
		if(numero1 < numero2) {
			repuesto = numero1;
			numero1 = numero2;
			numero2 = repuesto;
		}else if(numero2 < numero3) {
			repuesto = numero2;
			numero2 = numero3;
			numero3 = repuesto;
		}else if(numero1 < numero2){
			repuesto = numero1;
			numero1 = numero2;
			numero2 = repuesto;
		}
		
		System.out.println("El orden es: "+numero1+", "+numero2+", "+numero3);
		
	}
	
}

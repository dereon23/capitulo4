package capitulo4;

public class Ejercicio2 {
	
	public static void main(String[] args) {
		
		System.out.print("Introduzca la hora en formato 24 sin minutos: ");
		String entrada = System.console().readLine();
		int hora = Integer.parseInt(entrada);
		
		if(hora>=6 || hora<=12) {
			System.out.println("Buenos días");
		}else if(hora>=13 || hora <=20) {
			System.out.println("Buenas tardes");
		}else{
			System.out.println("Buenas noches");
		}
		
	}

}

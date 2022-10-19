package capitulo4;
import java.lang.Math;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		
		System.out.println("Introduzca la altura desde la que cae el objeto: ");
		String altura_escrita = System.console().readLine();
		float altura_numero = Float.parseFloat(altura_escrita);
		
		float gravedad = (float)9.81;
		
		float t = (float)Math.sqrt(2*altura_numero/gravedad);
		System.out.println("tiempo: " + t + "s");
		

		
	}

}

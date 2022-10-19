package capitulo4;

public class Ejercicio9 {
	
	public static void main(String[] args) {
		
		System.out.println(
		"Este programa resuelve ecuaciones de primer grado del tipo ax^2 + bx + c = 0");
		
		System.out.println("Por favor, introduzca el valor de a: ");
		String entrada = System.console().readLine();
		float a_numero = Float.parseFloat(entrada);
		
		System.out.println("Ahora introduzca el valor de b: ");
		entrada = System.console().readLine();
		float b_numero = Float.parseFloat(entrada);
		
		System.out.println("Ahora introduzca el valor de c: ");
		entrada = System.console().readLine();
		float c_numero = Float.parseFloat(entrada);
		
		float x1 = (float)((-b_numero+ Math.sqrt(b_numero*b_numero-4*a_numero*c_numero))
				/2);
		float x2 = (float)((-b_numero- Math.sqrt(b_numero*b_numero-4*a_numero*c_numero))
				/2);
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		

		
	}

}

package capitulo4;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		
		System.out.println(
		"Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
		
		System.out.println("Por favor, introduzca el valor de a: ");
		String a_escrito = System.console().readLine();
		int a_numero = Integer.parseInt(a_escrito);
		
		System.out.println("Ahora introduzca el valor de b: ");
		String b_escrito = System.console().readLine();
		int b_numero = Integer.parseInt(b_escrito);
		
		float x = (float)((-b_numero)/a_numero);
		System.out.println("x = " + x);
		

		
	}

}

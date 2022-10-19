package capitulo4;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca la primera nota: ");
		String nota_escrita = System.console().readLine();
		float nota1 = Float.parseFloat(nota_escrita);
		
		System.out.println("Introduzca la segunda nota: ");
		nota_escrita = System.console().readLine();
		float nota2 = Float.parseFloat(nota_escrita);
		
		System.out.println("Introduzca la tercera nota: ");
		nota_escrita = System.console().readLine();
		float nota3 = Float.parseFloat(nota_escrita);
		
		float media = (nota1+nota2+nota3)/3;
		System.out.println("media: " + media);
		
		if(media<5) {
			System.out.println("Insuficiente");
		}else if(media<7) {
			System.out.println("Suficiente");
		}else if(media<9) {
			System.out.println("Bien");
		}else {
			System.out.println("Sobresaliente");
		}
		

		
	}
	
}

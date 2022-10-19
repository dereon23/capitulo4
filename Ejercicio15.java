package capitulo4;

public class Ejercicio15 {
	
public static void main(String[] args) {
		
		System.out.print("Introduzca el símbolo con en el que quiere la pirámide: ");
		String simbolo = System.console().readLine();
		
		System.out.print("Introduzca la orientación de la pirámide"+ 
		"(arriba, abajo, izquierda, derecha): ");
		String orientacion = System.console().readLine();
		
		switch (orientacion) {
			case "arriba":
				System.out.println("  "+simbolo);
				System.out.println(" "+simbolo+simbolo+simbolo);
				System.out.println(simbolo+simbolo+simbolo+simbolo+simbolo);
			break;
			
			case "abajo":
				System.out.println((simbolo+simbolo+simbolo+simbolo+simbolo));
				System.out.println(" "+simbolo+simbolo+simbolo);
				System.out.println("  "+simbolo);			
				break;
			
			case "izquierda":
				System.out.println("  "+simbolo);	
				System.out.println(" "+simbolo+simbolo);				
				System.out.println(simbolo+simbolo+simbolo);
				System.out.println(" "+simbolo+simbolo);				
				System.out.println("  "+simbolo);	
			break;
			
			case "derecha":
				System.out.println(simbolo);	
				System.out.println(simbolo+simbolo);				
				System.out.println(simbolo+simbolo+simbolo);
				System.out.println(simbolo+simbolo);				
				System.out.println(simbolo);	
			break;
			
			default:
				System.out.println("Hay que introducir una de las orientaciones permitidas");
		}
		
	}

}

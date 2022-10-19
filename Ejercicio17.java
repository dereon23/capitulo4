package capitulo4;
import java.util.*;

public class Ejercicio17 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Introduzca un número entero: ");
		int numero = Integer.parseInt(s.nextLine());
		
		System.out.println("El último dígito es "+numero%10);
		s.close();
		
		
	}
	
}

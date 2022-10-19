package capitulo4;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		float sueldo_base=0;
		int dietas;
		float IRPF;
		
		
		System.out.println("1 - Programador junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de proyecto");
		System.out.println("Introduzca el cargo del empleado (1 - 3): ");
		String entrada = s.nextLine();
		
		switch(entrada) {
			case "1":{
				sueldo_base = 950;
				break;
			}
			case "2":{
				sueldo_base = 1200;
				break;
			}
			case "3":{
				sueldo_base = 1600;
				break;
			}
			default:{}
		}
		
		
		System.out.println("¿Cuántos días ha estado de viaje visitando clientes?");
		entrada = s.nextLine();
		dietas = Integer.parseInt(entrada);
		
		
		
		
		System.out.println("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		entrada = s.nextLine();
		if(entrada=="1") {
			IRPF = 25;
		}else {
			IRPF = 20;
		}
		
		
		System.out.println("Sueldo base           "+sueldo_base);
		System.out.println("Dietas( "+dietas+" viajes)  "+dietas*30);
		System.out.println("-----------------------");
		System.out.println("Sueldo bruto          "+(sueldo_base+dietas*30));
		System.out.println("Retención IRPF("+IRPF+")  "+((sueldo_base+dietas*30)*IRPF/100));
		System.out.println("----------------------");
		System.out.println("Sueldo neto      "+((sueldo_base+dietas*30)-
				(sueldo_base+dietas*30)*IRPF/100));
		
	}
	
}

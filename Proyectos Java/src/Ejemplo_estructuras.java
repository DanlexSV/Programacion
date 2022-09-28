import java.util.Scanner;

public class Ejemplo_estructuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short posicion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la posicion del atleta");
		posicion = sc.nextShort();
		
		switch(posicion) {
		case 1: System.out.print("ORO");break;
		case 2: System.out.print("PLATA");break;
		case 3: System.out.print("BRONCE");break;
		default: System.out.print("SIN PREMIO");break;
		}

	}
}

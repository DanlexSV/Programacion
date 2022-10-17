import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dorsal, tiempo;
		int jugadores = 0, contador = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int contador1 = 1; contador1 <= 15; contador1++) {
			System.out.println("Escribe el numero de tu dorsal");
			dorsal = sc.nextInt();
			if (dorsal > 0) {
				jugadores += dorsal;
				contador++;
			}
			System.out.println("Escribe el tiempo en el que has llegado");
			tiempo = sc.nextInt();
			if (tiempo >= 60 && tiempo <= 90){
				if (contador1 <= 10) {
					System.out.println("Corredor número " + dorsal + " ha tardado " + tiempo + "sg y está entre los 10 primeros");
				}
				else {
					System.out.println("Corredor número " + dorsal + " ha tardado " + tiempo + "sg, pero no esta entre los 10 primero");
				}
			}
			else if (tiempo < 60 || tiempo > 90) {
				System.out.println("Corredor número " + dorsal + " ha tardado " + tiempo + "sg");
			}
		}
	}
}

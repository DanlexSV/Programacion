import java.util.Scanner;

public class Ejercicio5_pag27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de A");
		A = sc.nextDouble();
		
		if (A > 0) {
			System.out.print("Es un número positivo");
			
		} else if (A < 0) {
			System.out.print("Es un número negativo");
			
		} else if (A == 0) {
			System.out.print("Has escrito cero");
		}

	}
}

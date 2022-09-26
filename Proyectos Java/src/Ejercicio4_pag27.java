import java.util.Scanner;

public class Ejercicio4_pag27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, Resto;
		int num1 = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de A");
		A = sc.nextDouble();
		
		Resto = A % 2;
		
		if (Resto == 0) {
			System.out.print("Es número par");
		} else if (Resto != 0) {
			System.out.print("Es un número impar");
		}

	}
}

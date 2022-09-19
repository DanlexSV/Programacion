import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, suma;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número a: ");
		a = sc.nextInt();
		System.out.println("Escriba el numero b: ");
		b = sc.nextInt();

		suma = a + b;

		System.out.println("El resultado es; " + suma);

	}

}

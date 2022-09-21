import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long a, b, Suma, Resta, Multiplicación;
		double División, Resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el número a: ");
		a = sc.nextInt();
		System.out.println("Escriba el numero b: ");
		b = sc.nextInt();

		Suma = a + b;
		Resta = a - b;
		Multiplicación = a * b;
		División = a / b;
		Resto = a % b;
		
		System.out.println("La suma es: " + Suma);
		System.out.println("La resta es: " + Resta);		
		System.out.println("La multiplicacion es: " + Multiplicación);
		System.out.println("La división es: " + División);
		System.out.println("El resto es: " + Resto);
				
	}

}
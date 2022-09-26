import java.util.Scanner;

public class Ejercicio1_pag26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double A, B, Resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de A");
		A = sc.nextInt();
		System.out.println("Escriba el valor de B");
		B = sc.nextInt();
		
		Resto = A % B;
		
		if (Resto == 0) {
			System.out.print("A es divisible por B");
			
		} else if (Resto != 0) {
			System.out.print("A no es divisible por B");
		}

	}
}

import java.util.Scanner;

public class T3_Ejercicio1_p3_pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int num1;
		int resto;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un valor numérico");
		num1 = sc.nextInt();
		
		for (int num2 = 1; num1 >= num2;) {
			resto = num1 % num2;
			if (resto == 0) {
				System.out.println(num2 + " es un número divisor");num2++;
			} else if (resto != 0) {
				System.out.println(num2 + " no es número divisor");num2++;
			}
		}
	}
}
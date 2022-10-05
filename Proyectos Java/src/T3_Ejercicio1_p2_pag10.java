import java.util.Scanner;

public class T3_Ejercicio1_p2_pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, resto;
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un valor numérico");
		num1 = sc.nextInt();
		
		do {
			resto = num1 % num2;
			if (resto == 0) {
				System.out.println(num2 + " es un número divisor");num2++;
			} else if (resto != 0) {
				System.out.println(num2 + " no es número divisor");num2++;
			}			
		} while (num1 >= num2);
	}
}
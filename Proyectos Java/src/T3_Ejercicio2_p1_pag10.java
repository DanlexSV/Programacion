import java.util.Scanner;

public class T3_Ejercicio2_p1_pag10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, resto;
		int num2 = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un valor numérico");
		num1 = sc.nextInt();
		boolean primo = true;
		
		while (num2 <= num1) {
			resto = num1 % num2;
			if (resto == 0) {
				if (num2 != 1 && num2 != num1) {
					primo = false;
				}				
			}
			num2++;
		}
		System.out.println("El número " + num1 + " es primo: " + primo);
	}
}

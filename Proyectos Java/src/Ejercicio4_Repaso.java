import java.util.Scanner;

public class Ejercicio4_Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escriba un valor numérico");
			a = sc.nextInt();
			if (a > 0) {
				b = a++;
				
			}
		} while (b < 10);
	}

}

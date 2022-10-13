import java.util.Scanner;

public class Ejercicio5_For_Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, media;
		int cont = 0;
		int acum = 0;
		Scanner sc = new Scanner(System.in);
		
		for (int b = 1; b < 10; b++) {
			System.out.println("Escriba un valor numérico");
			a = sc.nextDouble();
			if (a > 0) {
				acum += a;
				cont++;
			}
		}
		if (cont > 0) {
			media = acum / cont;
			System.out.println("La media es: " + media);
		} else {
			System.out.println("No ha escrito ningún número positivo");
		}
	}
}

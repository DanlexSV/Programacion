import java.util.Scanner;

public class Ejercicio4_Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, media;
		int cont = 0;
		int b = 1;
		int acumulador = 0;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Escriba un valor numérico");
			a = sc.nextDouble();
			if (a > 0) {
				acumulador += a;
				cont++;
			}
			b++;
		} while (b < 10);
		
		if (cont > 0) {
			media = acumulador / cont;
			System.out.println("La media es: " + media);
		} else {
			System.out.println("No ha escrito ningún número positivo");
		}
	}
}

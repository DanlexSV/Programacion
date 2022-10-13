import java.util.Scanner;

public class Ejercicio5_While_Repaso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, media;
		int cont = 0;
		int b = 1;
		int acum = 0;
		Scanner sc = new Scanner(System.in);
		
		while (b < 10) {
			System.out.println("Escriba un valor numérico");
			a = sc.nextDouble();
			if (a > 0) {
				acum += a;
				cont++;
			}
			b++;
		}
		if (cont > 0) {
			media = acum / cont;
			System.out.println("La media es: " + media);
		} else {
			System.out.println("No ha escrito ningún número positivo");
		}
	}
}

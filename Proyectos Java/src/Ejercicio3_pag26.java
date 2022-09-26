import java.util.Scanner;

public class Ejercicio3_pag26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double exam1, exam2, exam3, exam4;
		Scanner sc = new Scanner(System.in);
		System.out.println("La nota del Examen 1 es");
		exam1 = sc.nextDouble();
		System.out.println("La nota del Examen 2 es");
		exam2 = sc.nextDouble();
		System.out.println("La nota del Examen 3 es");
		exam3 = sc.nextDouble();
		System.out.println("La nota del Examen 4 es");
		exam4 = sc.nextDouble();
		
		double suma, promedio;
		int num1 = 4;
		suma = exam1 + exam2 + exam3 + exam4;
		promedio = suma / num1;
		
		if ((promedio >= 0) && (promedio <= 4)) {
			System.out.print("Has suspendido");
			
		} else if ((promedio >= 5) && (promedio <= 6)) {
			System.out.print("Tienes un suficiente");
			
		} else if ((promedio >= 7) && (promedio <= 8)) {
			System.out.print("Tienes un notable");
			
		} else if ((promedio > 8) && (promedio <= 10)) {
			System.out.print("Tienes un sobresaliente");
		}

	}
}

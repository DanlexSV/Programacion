import java.util.Scanner;

public class Ejercicio2_pag26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double exam1, exam2, exam3;
		Scanner sc = new Scanner(System.in);
		System.out.println("La nota del Examen 1 es");
		exam1 = sc.nextDouble();
		System.out.println("La nota del Examen 2 es");
		exam2 = sc.nextDouble();
		System.out.println("La nota del Examen 3 es");
		exam3 = sc.nextDouble();
		
		double suma, promedio;
		int num1 = 3;
		suma = exam1 + exam2 + exam3;
		promedio = suma / num1;
		
		if (promedio >= 5) {
			System.out.print("El alumno ha aprobado");
			
		} else if (promedio < 5) {
			System.out.print("El alumno ha suspendido");
		}

	}
}

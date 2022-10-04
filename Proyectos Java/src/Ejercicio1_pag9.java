import java.util.Scanner;

public class Ejercicio1_pag9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, op;
		String operacion;
		Scanner sc = new Scanner(System.in);
		Scanner tx = new Scanner(System.in);
		System.out.println("Escriba el valor de a");
		a = sc.nextDouble();
		System.out.println("Escriba el valor de b");
		b = sc.nextDouble();
		System.out.println("Escriba la operacion que desea ejecutar");
		operacion = tx.nextLine();
		operacion = operacion.toLowerCase();
		
		switch(operacion) {
		case "sumar": op = a + b;
			System.out.println("La suma es: " + op);break;
		case "restar": op = a - b;
			System.out.println("La resta es: " + op);break;
		case "multiplicar":
			if (a == 0 || b == 0) {
				System.out.println("La multiplicacion es igual a 0");break;
			} else if (a != 0 && b != 0){
				op = a * b;
				System.out.println("La multiplicacion es: " + op);break;
			}
		case "dividir":
			if (b == 0) {
				System.out.println("No se puede dividir entre 0");break;
			} else if (b != 0) {
				op = a / b;
				System.out.println("La division es: " + op);break;
			}
		default: 	
		}
	}
}

import java.util.Scanner;

public class area_triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b, h, multiplicacion, division;
		int num1 = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de la base: ");
		b = sc.nextInt();
		System.out.println("Escriba el valor de la altura: ");
		h = sc.nextInt();
		
		multiplicacion = b * h;
		division = multiplicacion / num1;
		
		System.out.println("El area del triangulo es: " + division);
	
	}

}

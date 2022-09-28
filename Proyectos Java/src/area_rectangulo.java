import java.util.Scanner;

public class area_rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double b, h, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de la base: ");
		b = sc.nextInt();
		System.out.println("Escriba el valor de la altura: ");
		h = sc.nextInt();
		
		area = b * h;
		System.out.println("El area del rectangulo es: " + area);
		
	}
}

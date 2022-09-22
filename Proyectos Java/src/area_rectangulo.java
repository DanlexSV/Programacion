import java.util.Scanner;

public class area_rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b, h, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el valor de b: ");
		b = sc.nextInt();
		System.out.println("Escriba el valor de h: ");
		h = sc.nextInt();
		
		area = b * h;
		
		System.out.println("El area del rectangulo es: " + area);
		
	}

}

import java.util.Scanner;

public class T3_Ejercicio3_pag11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,resto;
		int b = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un valor numérico");
		a = sc.nextInt();
		
		while(a >= 1) {
			resto = a % b;
			if (resto == 0) {
				System.out.println(a + " es par");a--;
			} else if (resto != 0) {
				System.out.println(a + " no es par");a--;
			}
		}
	}
}

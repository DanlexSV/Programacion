import java.util.Scanner;

public class Ejercicio2_pag30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba un numero entero");
		numb = sc.nextInt();
		
		switch(numb) {
		case 1: System.out.print("I");break;
		case 5: System.out.print("V");break;
		case 10: System.out.print("X");break;
		case 50: System.out.print("L");break;
		case 100: System.out.print("C");break;
		case 500: System.out.print("D");break;
		case 1000: System.out.print("M");break;
		default: System.out.print("ERROR");break;
		}

	}
}

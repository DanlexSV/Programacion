import java.util.Random;
import java.util.Scanner;

public class Ejercicio2_Repaso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int temperatura[] = new int[7];
		Random r = new Random();
		
		for (int i = 0; i < 7; i++) {
			temperatura[i] = r.nextInt(40);
		}
		
		String dia;
		System.out.println("Escribe una dia de la semana");
		dia = sc.nextLine();
		dia = dia.toLowerCase();
		
		switch (dia) {
		case "lunes": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[0] + "ºC"); break;
		case "martes": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[1] + "ºC"); break;
		case "miercoles": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[2] + "ºC"); break;
		case "jueves": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[3] + "ºC"); break;
		case "viernes": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[4] + "ºC"); break;
		case "sabado": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[5] + "ºC"); break;
		case "domingo": System.out.println("La temperatura del dia " + dia + " es de " + temperatura[6] + "ºC"); break;
		default: System.out.println("Dia de la semana no existe");
		}
	}

}

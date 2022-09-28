import java.util.Scanner;

public class Ejercicio1_pag30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el numero del día de la semana");
		dia = sc.nextInt();
		
		switch(dia) {
		case 1: System.out.print("Lunes");break;
		case 2: System.out.print("Martes");break;
		case 3: System.out.print("Miercoles");break;
		case 4: System.out.print("Jueves");break;
		case 5: System.out.print("Viernes");break;
		case 6: System.out.print("Sabado");break;
		case 7: System.out.print("Domingo");break;
		default: System.out.print("ERROR");break;
		}

	}
}

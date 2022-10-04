import java.util.Scanner;

public class Gestor_Fechas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int año, mes, dia;
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el año que empezo a trabajar en esta empresa");
		año = sc.nextInt();
		
		if (año >= 1970 && año <= 2022) {
			System.out.println("Escriba en NUMEROS el mes que empezo a trabajar en esta empresa");
			mes = sc.nextInt();
			
			if (mes >= 1 && mes <=12) {
				System.out.println("Escriba el dia que empezo a trabajar en esta empresa");
				dia = sc.nextInt();
				
				if (dia >=1 && dia <= 31) {
					System.out.println("Has empezado a trabajar en esta empresa el");
					System.out.println(dia + "/" + mes + "/" + año);
				} else if (dia < 1 || dia > 31) {
					System.out.println("dia fuera de rango para este mes");
				}
			} else if (mes < 1 || mes > 12) {
				System.out.println("mes fuera de rango");
			}
		} else if (año < 1970 || año > 2022) {
			System.out.println("año fuera de rango");
		}
	}
}

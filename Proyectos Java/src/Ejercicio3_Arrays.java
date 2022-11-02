import java.util.Scanner;

public class Ejercicio3_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner lt = new Scanner(System.in);
		
		String trabajador[];
		int cliente;
		System.out.println("Escriba la cantidad de clientes que tiene");
		cliente = sc.nextInt();
		trabajador = new String [cliente];
		
		for (int i = 0; i < cliente; i++) {
			System.out.println("Escriba el nombre del cliente" + i);
			trabajador[i] = lt.nextLine();
		}
	}

}

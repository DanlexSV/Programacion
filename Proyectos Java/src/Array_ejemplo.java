import java.util.Scanner;

public class Array_ejemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final short tamaño = 5;
		Scanner sc = new Scanner(System.in);
		short edad[] = new short [tamaño];
		
		for (int i = 0; i < tamaño; i++) {
			System.out.println("Escriba la edad:");
			edad[i] = sc.nextShort();
		}
	}

}

import java.util.Scanner;

public class EjercicioRepaso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int catg, precio1, preciof;
		Scanner sc = new Scanner (System.in);
		System.out.println("Escriba a la categoria que pertenece");
		catg = sc.nextInt();
		System.out.println("Escriba el valor del precio");
		precio1 = sc.nextInt();
		
		while (catg < 0 || catg >3) {
			System.out.println("Indique un numero VALIDO del 0 al 2");
			catg = sc.nextInt();
		}
		switch(catg) {
		case 0: preciof = precio1 - (precio1 * 15/100);
				System.out.print("El precio es " + preciof);break;
		case 1: preciof = precio1 - (precio1 * 20/100);
				System.out.print("El precio es " + preciof);break;
		case 2: preciof = precio1 - (precio1 * 25/100);
				System.out.print("El precio es " + preciof);break;
		}

	}
}

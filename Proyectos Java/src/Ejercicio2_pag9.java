import java.util.Scanner;

public class Ejercicio2_pag9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String menu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccione el menu que desee consultar");
		menu = sc.nextLine();
		
		switch (menu) {
		case "Menu1": System.out.println("Revuelto de champiñiones; Filete Pollo");
					  System.out.println("Precio: 8 Euros");break;
		case "Menu2": System.out.println("Sopa Castellana; Chuletillas");
					  System.out.println("Precio: 12 Euros");break;
		case "Menu3": System.out.println("Sopa de Mariscos; Bacalao");
					  System.out.println("Precio: 15 Euros");break;
		default: System.out.println("No existe ese menú");
		}
	}
}

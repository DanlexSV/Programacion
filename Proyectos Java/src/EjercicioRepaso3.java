import java.util.Scanner;

public class EjercicioRepaso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String orden, hamburguesa, ingredientes, tomate;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quiere perdir una comida");
		orden = sc.nextLine();

		if (orden.equals("si")) {
			System.out.println("Quiere una hamburguesa");
			hamburguesa = sc.nextLine();
			
			if (hamburguesa.equals("si")) {
				System.out.println("Quiere más ingredientes");
				ingredientes = sc.nextLine();
				
				if (ingredientes.equals("si")) {
					System.out.println("Quiere tomate");
					tomate = sc.nextLine();
					
					if (tomate.equals("si")) {
						System.out.println("Preparando su hamburguesa con tomate");
						
					} else if (tomate.equals("no")) {
						System.out.println("Quiere una hamburguesa sin tomate");
						System.out.println("Preparando su hamburguesa sin tomate");
					}					
				} else if (ingredientes.equals("no")) {
					System.out.println("Quiere hamburguesa sola");
					System.out.println("Preparando su hamburguesa sola");
				}				
			} else if (hamburguesa.equals("no")) {
				System.out.println("Sólo tenemos hamburguesas");
			}			
		} else if (orden.equals("no")) {
			System.out.println("No ha pedido nada");
		}
	}
}

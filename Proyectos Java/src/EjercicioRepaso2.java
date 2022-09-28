import java.util.Scanner;

public class EjercicioRepaso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nivel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Esriba su ultimo nivel de estudios");
		nivel = sc.nextLine();
		
		switch(nivel) {
		case "ESO": System.out.print("Puedes hacer Bachillerato o Ciclo de Grado Medio");break;
		case "Bachillerato": System.out.print("Puedes ir a la universidad "
				+ "o realizar ciclo de Grado Superio");break;
		case "Ciclo Medio": System.out.print("Puedes estudiar un ciclo de Grado Superior");break;
		case "Ciclo de Grado Superior": System.out.print("Puedes ir a la Universidad");break;
		case "Grado Universitario": System.out.print("Puedes hacer un Máster");break;
		default: System.out.println("No se ha encontrado ese nivel de estudios");
				 System.out.println("Escriba una de las siguientes carreras");
				 System.out.println("ESO, Bachillerato, Ciclo Medio, Ciclo de Grado Superior "
						 + "o Grado Universitario");break;
		}

	}
}

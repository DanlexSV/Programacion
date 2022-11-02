import java.util.Scanner;

public class Ejercicio3_Repaso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int numero, indice;
		String fecha;
		String astra[] = new String[9];
		astra[0] = "Eres introvertid@";
		astra[1] = "Te gusta competir";
		astra[2] = "Eres muy tranquil@";
		astra[3] = "Te gusta mucho comer";
		astra[4] = "Eres guay";
		astra[5] = "Te gustan las estrellas";
		astra[6] = "Hoy no ha sido un gran dia";
		astra[7] = "Debes estudiar mas";
		astra[8] = "Hoy sera tu dia de suerte";
		System.out.println("Escribe tu fecha de nacimiento");
		fecha = sc.nextLine();
		numero = Integer.parseInt("" + fecha.charAt(0)) +
				 Integer.parseInt("" + fecha.charAt(1)) +
				 Integer.parseInt("" + fecha.charAt(2)) +
				 Integer.parseInt("" + fecha.charAt(3));
		if (numero > 10) {
			indice = Integer.parseInt("" + String.valueOf(numero).charAt(0)) +
					 Integer.parseInt("" + String.valueOf(numero).charAt(1));
		} else if (numero == 10){
			indice = 1;
		} else {
			indice = numero;
		}
		

	}

}

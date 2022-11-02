
public class Ejercicio_Vocales_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char vocales[] = {'a', 'e', 'i', 'o', 'u'};
		int indice = 0;
		
		//for (int i = 0; i < vocales.length; i++) {
		//	System.out.println("Vocal: " + vocales[i]);
		//}
		
		//while (indice < vocales.length) {
		//	System.out.println("Vocal: " + vocales[indice]);
		//	indice++;
		//}
		
		do {
			System.out.println("Vocal: " + vocales[indice]);
			indice++;
		} while(indice < vocales.length);
	}

}

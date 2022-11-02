
public class Ejercicio1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tamaño[] = new int[28];
		//for (int i = 0; i < 27; i++) {
			//tamaño[i] = i;
		int indice = 0;
		while (indice <= 27) {
			tamaño[indice] = indice;
			System.out.println(tamaño[indice]);
			indice++;
		}
	}

}

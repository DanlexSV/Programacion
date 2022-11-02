
public class Ejercicio1_Repaso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arraya[] = {1,1,1};
		int arrayb[] = {1,1,1};
		boolean soniguales = true;
		
		for (int cont = 0; cont < arraya.length && soniguales; cont++) {
			if (arraya[cont] != arrayb[cont]) {
				soniguales = false;
			}
		}
		if (soniguales) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son diferentes");
		}
	}
}

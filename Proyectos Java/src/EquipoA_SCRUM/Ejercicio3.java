package EquipoA_SCRUM;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int acumalum = 0, acumasig = 0, acumeval = 0;
		double evaluacion1, evaluacion2, evaluacion3, NM;
		double NMasig;
		int numeroalum, examen;
		int contador1 = 0, contador2 = 0;
		int alumno = 1, asignatura = 1, evaluacion = 1;
		char materia;
		Scanner sc = new Scanner(System.in);
		
		while (alumno <= 20) {
			System.out.println("Escriba el numero del alumno");
			numeroalum = sc.nextInt();
			acumalum += numeroalum;
			alumno++;
			while(asignatura <= 6) {
				System.out.println("Escriba la incial de la asignatura");
				materia = sc.next().charAt(0);
				acumasig += materia;
				asignatura++;
				while(evaluacion <= 3) {
					System.out.println("Escriba la nota de la evaluacion");
					examen = sc.nextInt();
					acumeval += examen;
					evaluacion++;
				}
				NMasig = acumeval / 3;
				System.out.println("La nota promedio de NM" + materia + " " + NMasig);
				
			}
			
		}
		
	}
}

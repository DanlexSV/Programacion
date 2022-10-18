package EquipoA_SCRUM;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int acumalum = 0, acumasig = 0;
		double evaluacion1, evaluacion2, evaluacion3, NM;
		double NMmate, NMlengua, NMbio, NMhst, NMarte, NMingles;
		int numeroalum;
		int contador1 = 0, contador2 = 0;
		int alumno = 1, asignatura = 1;
		String materia;
		Scanner sc = new Scanner(System.in);
		Scanner lt = new Scanner(System.in);
		
		while (alumno <= 20) {
			System.out.println("Escriba el numero del alumno");
			numeroalum = sc.nextInt();
			acumalum += numeroalum;
			alumno++;
			while(asignatura <= 6) {
				System.out.println("Escriba el nombre de la asignatura");
				materia = lt.nextLine();
				materia = materia.toLowerCase();
				switch (materia) {
				case "matematicas":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMmate = (evaluacion1 + evaluacion2 + evaluacion3) / 3; 
					System.out.println("Escriba el nombre de la asignatura");
					materia = lt.nextLine();
					materia = materia.toLowerCase();
				case "lengua":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMlengua = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
					System.out.println("Escriba el nombre de la asignatura");
					materia = lt.nextLine();
					materia = materia.toLowerCase();
				case "biologia":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMbio = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
					System.out.println("Escriba el nombre de la asignatura");
					materia = lt.nextLine();
					materia = materia.toLowerCase();
				case "historia":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMhst = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
					System.out.println("Escriba el nombre de la asignatura");
					materia = lt.nextLine();
					materia = materia.toLowerCase();
				case "arte":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMarte = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
					System.out.println("Escriba el nombre de la asignatura");
					materia = lt.nextLine();
					materia = materia.toLowerCase();
				case "ingles":
					System.out.println("Escriba la nota de la 1era evaluación");
					evaluacion1 = sc.nextDouble();
					System.out.println("Escriba la nota de la 2da evaluación");
					evaluacion2 = sc.nextDouble();
					System.out.println("Escriba la nota de la 3era evaluación");
					evaluacion3 = sc.nextDouble();
					NMingles = (evaluacion1 + evaluacion2 + evaluacion3) / 3;
					break;
				}
				NM = (NMmate + NMlengua + NMbio + NMhst + NMarte + NMingles) / 6;
			}
		}
		
	}
}

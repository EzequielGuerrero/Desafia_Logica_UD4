package Desafia_Logica_4;

import java.util.Scanner;

public class Gestion {

	public static void main(String[] args) {

		// Instancio los objetos Piloto con los datos del ejercicio.

		Piloto piloto1 = new Piloto("Pete Maverick", 10000, "Capitán");

		Piloto piloto2 = new Piloto("Natasha Phoenix", 3000, "Teniente");

		Piloto piloto3 = new Piloto("Bradley Rooster", 3500, "Teniente");

		// Declaro las variables objeto para usarlas dentro del for.

		Piloto piloto4 = null;

		Piloto piloto5 = null;

		// Instancio un objeto de la clase Escaner para hacer las preguntas
		// correspondientes.

		Scanner scn = new Scanner(System.in);

		for (int i = 0; i < 2; i++) {

			System.out.println("Por favor crea otro pilotos mas");

			System.out.println("Introduce el nombre del piloto: ");

			String nombreP = scn.next();

			System.out.println("El numero de horas de vuelo");
			int numeroH = scn.nextInt();

			System.out.println("Y finalmente el Rango del piloto.");
			String rangoP = scn.next();

			// Usando las respuestas del usuario instancio un objeto más de la clase Piloto.

			if (i == 0) {

				piloto4 = new Piloto(nombreP, numeroH, rangoP);

			} else {

				piloto5 = new Piloto(nombreP, numeroH, rangoP);

			}

		}

		// Muestro la informacion que me pide el ejercicio.

		piloto1.mostrarInformacion();
		piloto3.mostrarInformacion();
		piloto4.mostrarInformacion();
		piloto5.mostrarInformacion();

		Combate avion1 = new Combate("Falcon2", 2, piloto1,true);
		Combate avion2 = new Combate("Pancer3", 4, piloto2,false);
		Entrenamiento avion3 = new Entrenamiento("F22", 1, piloto3,true);

		avion1.mostrarInformacion();
		avion2.mostrarInformacion();
		avion3.mostrarInformacion();
		
		Entrenamiento avion4=null;
		Entrenamiento avion5= null;
		
		for (int i = 0; i < 2; i++) {

			System.out.println("Por favor crea otro avion de Entrenamiento mas");

			System.out.println("Introduce el modelo del avion: ");

			String modelo = scn.next();

			System.out.println("El numero plazas del avion");
			int numeroP = scn.nextInt();

			System.out.println("Los pilotos de dichos aviones los asignara el sistema.");
			

			// Usando las respuestas del usuario instancio un objeto más de la clase Avion.

			if (i == 0) {

				avion4 = new Entrenamiento(modelo, numeroP,piloto5,true);

			} else {

				avion5 = new Entrenamiento(modelo,numeroP,piloto4,false);

			}

		}
		
		avion4.mostrarInformacion();
		avion5.mostrarInformacion();

	}

}

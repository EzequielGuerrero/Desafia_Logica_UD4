package Desafia_Logica_4;

public class Piloto {

	// Atributos / propiedades de clase.

	private int idPiloto = 0;
	private String nomPiloto;
	private int horasVueloPiloto;
	private String rangoPiloto;
	private static int contadorPilotos = 1;

	// Constructor sin parametros.

	public Piloto() {

		this.idPiloto = contadorPilotos++;

	}

	// Constructor con parametros para crear los objetos.

	public Piloto(String nomPiloto, int horasVueloPiloto, String rangoPiloto) {

		this.setNomPiloto(nomPiloto);

		this.setHorasVueloPiloto(horasVueloPiloto);

		this.setRangoPiloto(rangoPiloto);

		// Variable tipo contador para que vaya sumando los objetos que se crean de la
		// clase Avion.

		this.idPiloto = contadorPilotos++;

	}

	public void mostrarInformacion() {

		System.out.println("El piloto del cual se ha solicitado la informacion es: ");
		System.out.println("Piloto: " + getNomPiloto() + " con Rango: " + getRangoPiloto() + ", IDdentificador : "
				+ getIdPiloto());
		System.out.println("Con el numero de horas de vuelo: " + getHorasVueloPiloto());
		System.out.println("------------------------------------------------------------");

	}

	public int getIdPiloto() {
		return idPiloto;
	}

	public String getNomPiloto() {
		return nomPiloto;
	}

	public void setNomPiloto(String nomPiloto) {
		this.nomPiloto = nomPiloto;
	}

	public int getHorasVueloPiloto() {
		return horasVueloPiloto;
	}

	public void setHorasVueloPiloto(int horasVueloPiloto) {
		this.horasVueloPiloto = horasVueloPiloto;
	}

	public String getRangoPiloto() {
		return rangoPiloto;
	}

	public void setRangoPiloto(String rangoPiloto) {
		this.rangoPiloto = rangoPiloto;
	}

}

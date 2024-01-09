package Desafia_Logica_4;

public class Avion {

	private int idAvion = 0;
	private static int contadorAviones = 1;
	private String modAvion;
	private int capAvion;
	private Piloto piloto;

	public Avion() {

		this.idAvion = contadorAviones++;
	}

	public Avion(String modAvion, int capAvion, Piloto piloto) {

		this.setModAvion(modAvion);
		this.setCapAvion(capAvion);
		this.setPiloto(piloto);
		this.idAvion = contadorAviones++;

	}

	public void mostrarInformacion() {

		System.out.println(
				"El avion es el modelo: " + getModAvion() + " con capacidad  para: " + getCapAvion() + " personas.");
		piloto.mostrarInformacion();

	}

	public String getModAvion() {
		return modAvion;
	}

	public void setModAvion(String modAvion) {
		this.modAvion = modAvion;
	}

	public int getCapAvion() {
		return capAvion;
	}

	public void setCapAvion(int capAvion) {
		this.capAvion = capAvion;
	}

	public Piloto getPiloto() {
		return piloto;
	}

	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}

	public int getIdAvion() {
		return idAvion;
	}

}

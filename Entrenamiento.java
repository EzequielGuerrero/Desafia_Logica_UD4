package Desafia_Logica_4;

public class Entrenamiento extends Avion {

	private boolean dobleMando = false;

	public Entrenamiento(String modAvion, int capAvion, Piloto piloto, boolean dobleMando) {

		super(modAvion, capAvion, piloto);

		this.dobleMando = dobleMando;

	}

	public void mostrarInformacion() {

		tieneDobleMando(this.dobleMando);
		super.mostrarInformacion();

	}

	public boolean tieneDobleMando(boolean doblemando) {

		if (doblemando == true) {

			System.out.println("El avion tiene doble mando");

		}
		return doblemando;

	}

	public boolean isDobleMando() {
		return dobleMando;
	}

	public void setDobleMando(boolean dobleMando) {
		this.dobleMando = dobleMando;
	}

}

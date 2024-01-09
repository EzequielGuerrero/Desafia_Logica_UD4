package Desafia_Logica_4;

public class Combate extends Avion {

	private boolean furtivo = false;

	public Combate(String modAvion, int capAvion, Piloto piloto, boolean furtivo) {

		super(modAvion, capAvion, piloto);

		this.furtivo = furtivo;

	}

	public void mostrarInformacion() {

		esFurtivo(this.furtivo);
		super.mostrarInformacion();

	}

	public boolean esFurtivo(boolean furtivo) {

		if (furtivo == true) {

			System.out.println("El avion es furtivo");

		}
		return furtivo;
	}

	public boolean isFurtivo() {
		return furtivo;
	}

	public void setFurtivo(boolean furtivo) {
		this.furtivo = furtivo;
	}

}

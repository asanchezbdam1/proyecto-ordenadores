package ordenadores.modelo;

public class Fuente extends Articulo {
	private int potencia;

	public Fuente(int potencia, double precio) {
		super(precio);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\tPotencia: " + potencia + "\t" + super.toString();

	}
}

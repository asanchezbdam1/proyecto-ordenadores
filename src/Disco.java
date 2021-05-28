public class Disco extends Articulo {
	private int capacidad;
	private TipoDisco tipo;

	public Disco(int capacidad, TipoDisco tipo, double precio) {
		super(precio);
		this.capacidad = capacidad;
		this.tipo = tipo;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public TipoDisco getTipo() {
		return tipo;
	}

	public void setTipo(TipoDisco tipo) {
		this.tipo = tipo;
	}
}

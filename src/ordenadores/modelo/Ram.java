package ordenadores.modelo;
public class Ram extends Articulo {
	private int capacidad;
	private TipoRAM tipo;

	public Ram(int capacidad, TipoRAM tipo, double precio) {
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

	public TipoRAM getTipo() {
		return tipo;
	}

	public void setTipo(TipoRAM tipo) {
		this.tipo = tipo;
	}
}

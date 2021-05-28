public class Ram {
	private int capacidad;
	private TipoRAM tipo;

	public Ram(int capacidad, TipoRAM tipo) {
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

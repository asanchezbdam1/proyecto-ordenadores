package ordenadores.modelo;

public class Articulo {
	private double precio;

	public Articulo(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "(" + precio + "€)";
	}
}

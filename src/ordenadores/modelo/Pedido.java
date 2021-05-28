package ordenadores.modelo;
import java.time.LocalDateTime;

public class Pedido {
    private Ordenador ordenador;
    private int cantidad;
    private LocalDateTime fecha;
    private String usuario;
    
    public Pedido(String usuario) {
    	this.usuario = usuario;
    	setOrdenador(new Ordenador(usuario));
    	setCantidad(1);
    	setFecha(LocalDateTime.now());
    }

	public Ordenador getOrdenador() {
		return ordenador;
	}

	public void setOrdenador(Ordenador ordenador) {
		this.ordenador = ordenador;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}
	
	public String toString() {
		return ordenador.toString();
	}
	
	public double getPrecio() {
		return ordenador.getPrecio() * cantidad;
	}
	
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (this == o) {
			return true;
		}
		if (this.getClass() != o.getClass()) {
			return false;
		}
		if (this.hashCode() != o.hashCode()) {
			return false;
		}
		return true;
	}
	
	public int hashCode() {
		return this.usuario.hashCode() + this.fecha.hashCode();
	}

	public void incrementar() {
		cantidad++;
	}

	public void decrementar() {
		if (cantidad > 1) {
			cantidad--;
		}
	}
}

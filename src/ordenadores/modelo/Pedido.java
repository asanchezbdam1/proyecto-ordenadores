package ordenadores.modelo;
import java.time.LocalDateTime;

public class Pedido {
    private Ordenador ordenador;
    private int cantidad;
    private LocalDateTime fecha;
    
    public Pedido(String usuario) {
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
}

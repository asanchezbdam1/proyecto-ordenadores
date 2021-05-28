import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	private String idCliente;
	private List<Pedido> pedidos;

	public Pedidos() {
		this.pedidos = new ArrayList<>();
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
	}

	public void addPedidos(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void modificarPedido(Pedido pedido) {

	}

}

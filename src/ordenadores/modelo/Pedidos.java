package ordenadores.modelo;

import java.util.ArrayList;
import java.util.List;

public class Pedidos {
	private String idCliente;
	private List<Pedido> pedidos;

	public Pedidos() {
		idCliente = System.getProperty("user.name");
		this.pedidos = new ArrayList<>();
	}

	public String getIdCliente() {
		return idCliente;
	}

	public void addPedidos(Pedido pedido) {
		pedidos.add(pedido);
	}

	public void modificarPedido(Pedido pedido) {

	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}

}

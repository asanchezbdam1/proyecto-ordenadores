package ordenadores.interfaz;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ordenadores.modelo.Pedido;
import ordenadores.modelo.Pedidos;

public class PedidosGUI extends Application {
	private Pedidos pedidos;
	private Stage stage;
	@Override
	public void start(Stage stage) throws Exception {
		pedidos = new Pedidos();
		Scene scene = new Scene(crearGui(), 800, 600);
		this.stage = stage;
		stage.setScene(scene);
		stage.setTitle("- Pedidos de ordenadores -");
		stage.show();
	}
	
	private BorderPane crearGui() {
		BorderPane panel = new BorderPane();
		panel.setCenter(buscarPedidos());
		Button btn = new Button("Crear pedido");
		btn.setOnAction(event -> crearPedido());
		btn.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btn.setMinHeight(40);
		panel.setBottom(btn);
		return panel;
	}

	private VBox buscarPedidos() {
		VBox panel = new VBox();
		for (Pedido p : pedidos.getPedidos()) {
			Button but = new Button(p.getFecha().toString());
			but.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
			but.setOnAction(event -> modificarPedido(p));
			panel.getChildren().add(but);
		}
		return panel;
	}

	private void modificarPedido(Pedido p) {
		BorderPane panel = new BorderPane();
		HBox top = new HBox();
		top.setAlignment(Pos.CENTER);
		top.setMinHeight(40);
		Label lblCantidad = new Label("Nº de ordenadores: " + p.getCantidad());
		lblCantidad.setAlignment(Pos.CENTER);
		lblCantidad.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		Label lblPrecio = new Label(String.valueOf(p.getPrecio()) + "€");
		lblPrecio.setAlignment(Pos.CENTER);
		lblPrecio.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		HBox.setHgrow(lblCantidad, Priority.ALWAYS);
		HBox.setHgrow(lblPrecio, Priority.ALWAYS);
		top.getChildren().addAll(lblCantidad, lblPrecio);
		
		Button btnPedido = new Button(p.getOrdenador().toString());
		btnPedido.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		btnPedido.setOnAction(event -> modificarPedido(p));
		
		HBox bottom = new HBox();
		bottom.setMinHeight(40);
		
		Button btnMas = new Button("+");
		btnMas.setOnAction(event -> incrementar(p));
		btnMas.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		Button btnVolver = new Button("Volver");
		btnVolver.setOnAction(event -> volverPedidos());
		btnVolver.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		Button btnCancelar = new Button("Cancelar pedido");
		btnCancelar.setOnAction(event -> cancelarPedido(p));
		btnCancelar.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		Button btnMenos = new Button("-");
		btnMenos.setOnAction(event -> decrementar(p));
		btnMenos.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
		
		HBox.setHgrow(btnMas, Priority.ALWAYS);
		HBox.setHgrow(btnVolver, Priority.ALWAYS);
		HBox.setHgrow(btnCancelar, Priority.ALWAYS);
		HBox.setHgrow(btnMenos, Priority.ALWAYS);
		
		bottom.setAlignment(Pos.CENTER);
		bottom.getChildren().addAll(btnMas, btnVolver, btnCancelar, btnMenos);
		
		panel.setTop(top);
		panel.setCenter(btnPedido);
		panel.setBottom(bottom);
		stage.setScene(new Scene(panel, 800, 600));
		stage.show();
	}

	private void incrementar(Pedido p) {
		p.incrementar();
		modificarPedido(p);
	}

	private void decrementar(Pedido p) {
		p.decrementar();
		modificarPedido(p);
	}

	private void cancelarPedido(Pedido p) {
		pedidos.removePedido(p);
		volverPedidos();
	}

	private void volverPedidos() {
		stage.setScene(new Scene(crearGui(), 800, 600));
	}

	private void crearPedido() {
		Pedido p = new Pedido(pedidos.getIdCliente());
		pedidos.addPedido(p);
		modificarPedido(p);
	}

	public static void main(String[] args) {
		launch(args);
	}

}

package ordenadores.interfaz;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ordenadores.modelo.Pedido;
import ordenadores.modelo.Pedidos;

public class PedidosGUI extends Application {
	private Pedidos pedidos;
	@Override
	public void start(Stage stage) throws Exception {
		pedidos = new Pedidos();
		Scene scene = new Scene(crearGui(), 800, 600);
		stage.setScene(scene);
		stage.setTitle("- Ejemplo sencillo de aplicación JavaFX -");
		stage.show();
	}
	
	private BorderPane crearGui() {
		BorderPane panel = new BorderPane();
		panel.setCenter(buscarPedidos());
		panel.setBottom(crearPedido());
		return null;
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
		
	}

	private Node crearPedido() {
		
		return null;
	}

	public static void main(String[] args) {
		launch(args);
	}

}

import java.awt.Color;

public class Torre {
	private int altura;
	private int anchura;
	private int longitud;
	private Color color;
	private FormatoPlaca formatoPlaca;

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public FormatoPlaca getFormatoPlaca() {
		return formatoPlaca;
	}

	public void setFormatoPlaca(FormatoPlaca formatoPlaca) {
		this.formatoPlaca = formatoPlaca;
	}
}

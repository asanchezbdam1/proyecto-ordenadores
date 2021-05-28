package ordenadores.modelo;

public class Gpu extends Articulo {
	private String modelo;
	private int VRAM;

	public Gpu(String modelo, int vRAM, double precio) {
		super(precio);
		this.modelo = modelo;
		VRAM = vRAM;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getVRAM() {
		return VRAM;
	}

	public void setVRAM(int vRAM) {
		VRAM = vRAM;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "\tModelo: " + modelo + "\tVRAM: " + VRAM + "\t" + super.toString();

	}
}

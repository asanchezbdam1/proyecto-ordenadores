public class Gpu {
	private String modelo;
	private int VRAM;

	public Gpu(String modelo, int vRAM) {
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
}

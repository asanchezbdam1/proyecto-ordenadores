public class Cpu {
	private String modelo;
	private int frecuencia;
	private int nucleo;

	public Cpu(String modelo, int frecuencia, int nucleo) {

		this.modelo = modelo;
		this.frecuencia = frecuencia;
		this.nucleo = nucleo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	public int getNucleo() {
		return nucleo;
	}

	public void setNucleo(int nucleo) {
		this.nucleo = nucleo;
	}
}

public class PlacaBase extends Articulo {
	private int slotsRAM;
	private FormatoPlaca formato;
	private int slotsPCIe;
	private int socket;

	public PlacaBase(int slotsRAM, FormatoPlaca formato, int slotsPCIe, int socket, int maxRAM, double precio) {
		super(precio);
		this.slotsRAM = slotsRAM;
		this.formato = formato;
		this.slotsPCIe = slotsPCIe;
		this.socket = socket;
		this.maxRAM = maxRAM;
	}

	public int getSlotsRAM() {
		return slotsRAM;
	}

	public void setSlotsRAM(int slotsRAM) {
		this.slotsRAM = slotsRAM;
	}

	public FormatoPlaca getFormato() {
		return formato;
	}

	public void setFormato(FormatoPlaca formato) {
		this.formato = formato;
	}

	public int getSlotsPCIe() {
		return slotsPCIe;
	}

	public void setSlotsPCIe(int slotsPCIe) {
		this.slotsPCIe = slotsPCIe;
	}

	public int getSocket() {
		return socket;
	}

	public void setSocket(int socket) {
		this.socket = socket;
	}

	public int getMaxRAM() {
		return maxRAM;
	}

	public void setMaxRAM(int maxRAM) {
		this.maxRAM = maxRAM;
	}

	private int maxRAM;

}

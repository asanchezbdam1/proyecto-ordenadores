import java.util.ArrayList;
import java.util.List;

public class Ordenador {
    private String idOrdenador;
    private PlacaBase placaBase;
    private List<Disco> discos;
    private Cpu cpu;
    private List<Ram> rams;
    private List<Gpu> gpus;
    private Fuente fuente;
    private Torre torre;

    public Ordenador(String usuario) {
        discos = new ArrayList<>();
        rams = new ArrayList<>();
        gpus = new ArrayList<>();
        setIdOrdenador(usuario + java.time.LocalDate.now().toString());
    }

    public boolean addDisco(Disco disco) {
        discos.add(disco);
        return true;
    }

    public boolean addRam(Ram ram) {
        if (placaBase.getSlotsRAM() > rams.size()) {
            int disponible = placaBase.getMaxRAM() - getTotalRam();
            if (disponible >= ram.getCapacidad()) {
                rams.add(ram);
                return true;
            }
        }
        return false;
    }

    private int getTotalRam() {
        int n = 0;
        for (Ram ram : rams) {
            n += ram.getCapacidad();
        }
        return n;
    }

    public boolean addGpu(Gpu gpu) {
    	if (placaBase.getSlotsPCIe() > 0) {
    		gpus.add(gpu);
    	}
        return false;
    }

    public void removeDisco(Disco disco) {
    	discos.remove(disco);
    }

    public void removeGpu(Gpu gpu) {
    	gpus.remove(gpu);
    }

    public void removeRam(Ram ram) {
    	rams.remove(ram);
    }

    private double calcularPrecio() {
    	double precio = 0;
    	if (placaBase != null) {
    		precio += placaBase.getPrecio();
    	}
    	if (fuente != null) {
    		precio += fuente.getPrecio();
    	}
    	if (torre != null) {
    		precio += torre.getPrecio();
    	}
    	if (cpu != null) {
    		precio += cpu.getPrecio();
    	}
    	for (Disco d : discos) {
    		precio += d.getPrecio();
    	}
    	for (Ram r : rams) {
    		precio += r.getPrecio();
    	}
    	for (Gpu g : gpus) {
    		precio += g.getPrecio();
    	}
        return precio;
    }

	public String getIdOrdenador() {
		return idOrdenador;
	}

	public void setIdOrdenador(String idOrdenador) {
		this.idOrdenador = idOrdenador;
	}

	public Cpu getCpu() {
		return cpu;
	}

	public void setCpu(Cpu cpu) {
		this.cpu = cpu;
	}

	public Fuente getFuente() {
		return fuente;
	}

	public void setFuente(Fuente fuente) {
		this.fuente = fuente;
	}

	public Torre getTorre() {
		return torre;
	}

	public void setTorre(Torre torre) {
		if (this.torre != null) {
			if (torre.getFormatoPlaca() == placaBase.getFormato()) {
				this.torre = torre;
			}
		}
	}
	
	public double getPrecio() {
		return calcularPrecio();
	}
}

import java.util.ArrayList;
import java.util.List;

public class Ordenador extends Articulo {
    private String idOrdenador;
    private PlacaBase placaBase;
    private List<Disco> discos;
    private Cpu cpu;
    private List<Ram> rams;
    private List<Gpu> gpus;
    private Fuente fuente;
    private Torre torre;

    public Ordenador(String usuario, double precio) {
        super(precio);
        idOrdenador = usuario + java.time.LocalDate.now().toString();
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
        return false;
    }

    public void removeDisco(Disco disco) {

    }

    public void removeGpu(Gpu gpu) {

    }

    public void removeRam(Ram ram) {

    }

    public double calcularPrecio() {
        return 0;
    }
}

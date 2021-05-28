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
        idOrdenador = usuario + java.time.LocalDate.now().toString();
    }

    public boolean addDisco(Disco disco) {
        return false;
    }

    public boolean addRam(Ram ram) {
        return false;
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
}

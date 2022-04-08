import java.util.Date;

public class ViajeFamiliar extends Viaje {

    // ATRIBUTOS

    private int familia;

    // CONSTRUCTORES Y METODOS

    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        setFamilia(familia);
    }

    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia.";
    }

    @Override
    public double costoDiferencial() {
        return getCosto() * .9;
    }

    public int getFamilia() {
        return familia;
    }

    public void setFamilia(int familia) {
        this.familia = familia;
    }
}

import java.util.Date;

public class ViajeIndividual extends Viaje {

    // ATRIBUTOS

    // CONSTRUCTORES Y METODOS

    public ViajeIndividual(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
    }

    @Override
    public String descripcion() {
        return "Disfruta de tu viaje individual.";
    }


}

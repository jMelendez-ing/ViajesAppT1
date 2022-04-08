import java.util.Date;

public class ViajeIncentivo extends Viaje {

    // ATRIBUTOS

    private String empresa;

    // CONSTRUCTORES Y METODOS

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        setEmpresa(empresa);
    }

    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa + ".";
    }

    @Override
    public double costoDiferencial() {
        return getCosto() * .95;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}

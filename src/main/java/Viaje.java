import java.util.Date;

public abstract class Viaje {

    // ATRIBUTOS

    protected String origen;
    protected String destino;
    protected double costo;
    protected Date fechaSalida;
    protected Date fechaLlegada;

    // CONSTRUCTORES Y METODOS

    public abstract String descripcion();

    public Viaje(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada) {

        setOrigen(origen);
        setDestino(destino);
        setCosto(costo);
        setFechaSalida(fechaSalida);
        setFechaLlegada(fechaLlegada);
    }

    public double costoDolares() {

        return getCosto() / 3400;
    }

    public double costoDiferencial() {
        return getCosto();
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
}

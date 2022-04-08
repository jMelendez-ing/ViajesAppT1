import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViajesAppMain {

    public static List<Viaje> viajes = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("\nDemo para Aplicación de Viajes Grupo KMA\n");

        leerViajes();
        mostrarViajes();
    }

    public static void leerViajes() {

        try {

            Viaje viaje1 = new ViajeFamiliar("Popayán", "Bogotá", 1250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/05/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("05/05/2019"), 5);
            viajes.add(viaje1);

            Viaje viaje2 = new ViajeIncentivo("Popayán", "Medellín", 210000, new SimpleDateFormat("dd/MM/yyyy").parse("01/06/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("09/06/2019"), "Emtel");
            viajes.add(viaje2);

            Viaje viaje3 = new ViajeIndividual("Popayán", "San Andrés", 4250000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje3);

            Viaje viaje4 = new ViajeTodoIncluido("Popayán", "Bogotá", 7350000, new SimpleDateFormat("dd/MM/yyyy").parse("01/07/2019"), new SimpleDateFormat("dd/MM/yyyy").parse("12/07/2019"));
            viajes.add(viaje4);

        } catch (ParseException e) {

            Logger.getLogger(ViajesAppMain.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static void mostrarViajes() {

        for (Viaje viaje : viajes) {

            System.out.println("Origen: " + viaje.getOrigen());
            System.out.println("Destino: " + viaje.getDestino());
            System.out.println("Fecha salida: " + viaje.getFechaSalida());
            System.out.println("Fecha llegada: " + viaje.getFechaLlegada());
            System.out.println("Costo: " + viaje.getCosto());
            System.out.println("Descripción: " + viaje.descripcion());
            System.out.println("Costo en dólares: " + viaje.costoDolares());
            System.out.println("Costo diferencial: " + viaje.costoDiferencial());
            System.out.println();
        }
    }

}

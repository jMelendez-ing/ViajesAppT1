import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ViajesAppMainTest {


    // Tests viaje familiar

    @Test
    public void testViajeFamiliarDescripcion() throws ParseException {

        // Resultado esperado
        String resultado = "Viaje para disfrutar con toda tu familia.";
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar("Origen", "Destino", 102000,
                new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"),
                new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"),
                10);
        Assert.assertEquals(resultado, viajeFamiliar.descripcion());
    }

    @Test
    public void testViajeFamiliarCostoDolares() throws ParseException {

        // Resultado esperado
        double resultado = 30;
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), 10);
        Assert.assertEquals(resultado, viajeFamiliar.costoDolares(), 0.001);
    }

    @Test
    public void testViajeFamiliarCostoDiferencial() throws ParseException {

        // Resultado esperado
        double resultado = 91800;
        ViajeFamiliar viajeFamiliar = new ViajeFamiliar("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), 10);
        Assert.assertEquals(resultado, viajeFamiliar.costoDiferencial(), 0.001);
    }


    // Test viaje incentivo

    @Test
    public void testViajeIncentivoDescripcion() throws ParseException {

        // Resultado esperado
        String empresaTest = "Empresa de Prueba";
        String resultado = ("Viaje incentivo que te envia la empresa " + empresaTest + ".");

        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), empresaTest);
        Assert.assertEquals(resultado, viajeIncentivo.descripcion());

    }

    @Test
    public void testViajeIncentivoCostoDolares() throws ParseException {

        // Resultado esperado
        double resultado = 30;
        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), "Empresa de Prueba");
        Assert.assertEquals(resultado, viajeIncentivo.costoDolares(), 0.001);
    }

    @Test
    public void testViajeIncentivoCostoDiferencial() throws ParseException {

        // Resultado esperado
        double resultado = 95000;
        ViajeIncentivo viajeIncentivo = new ViajeIncentivo("Origen", "Destino", 100000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"), "Empresa de Prueba");
        Assert.assertEquals(resultado, viajeIncentivo.costoDiferencial(), 0.001);
    }


    // Test viaje individual

    @Test
    public void testViajeIndividualDescripcion() throws ParseException {

        // Resultado esperado
        String resultado = "Disfruta de tu viaje individual.";
        ViajeIndividual viajeIndividual = new ViajeIndividual("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeIndividual.descripcion());

    }

    @Test
    public void testViajeIndividualCostoDolares() throws ParseException {

        // Resultado esperado
        double resultado = 30;
        ViajeIndividual viajeIndividual = new ViajeIndividual("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeIndividual.costoDolares(), 0.001);
    }

    @Test
    public void testViajeIndividualCostoDiferencial() throws ParseException {

        // Resultado esperado
        double resultado = 102000;
        ViajeIndividual viajeIndividual = new ViajeIndividual("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeIndividual.costoDiferencial(), 0.001);
    }


    // Test viaje todo_incluido

    @Test
    public void testViajeTodoIncluidoDescripcion() throws ParseException {

        // Resultado esperado
        String resultado = "Disfruta de tu viaje todo incluido.";
        ViajeTodoIncluido viajeTodoIncluido = new ViajeTodoIncluido("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeTodoIncluido.descripcion());

    }

    @Test
    public void testViajeTodoIncluidoCostoDolares() throws ParseException {

        // Resultado esperado
        double resultado = 30;
        ViajeTodoIncluido viajeTodoIncluido = new ViajeTodoIncluido("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeTodoIncluido.costoDolares(), 0.001);
    }

    @Test
    public void testViajeTodoIncluidoCostoDiferencial() throws ParseException {

        // Resultado esperado
        double resultado = 102000;
        ViajeTodoIncluido viajeTodoIncluido = new ViajeTodoIncluido("Origen", "Destino", 102000, new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2022"), new SimpleDateFormat("dd/MM/yyyy").parse("02/01/2022"));
        Assert.assertEquals(resultado, viajeTodoIncluido.costoDiferencial(), 0.001);
    }

}
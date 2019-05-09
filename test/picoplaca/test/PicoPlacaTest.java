package picoplaca.test;

import picoplaca.automobile.domain.Automobile;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import picoplaca.automobile.factory.AutomobileFactory;

/**
 *
 * @author Brayme
 */
public class PicoPlacaTest {

    @Test
    public void forGovermentAutomobile() {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "AEC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(true, result);
    }

    @Test
    public void forPrivateAutomobileInPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "ABC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(false, result);
    }

    @Test
    public void forPrivateAutomobileOutPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "15:00:00";
        String placa = "ADC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(true, result);
    }

    @Test
    public void forMunicipalityInPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "AMC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(false, result);
    }

    @Test
    public void forMunicipalityOutPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "15:00:00";
        String placa = "AMC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(true, result);
    }

    @Test
    public void forUseOficial() {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "AXC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(true, result);
    }

    @Test
    public void forCommercialInPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "16:30:00";
        String placa = "AAC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(false, result);
    }

    @Test
    public void forCommercialOutPicoPlaca() {
        String fecha = "2019-05-09";
        String hora = "15:00:00";
        String placa = "AAC-0127";
        Automobile automobile = new AutomobileFactory().createAutomobile(placa);
        boolean result = automobile.canBeOnTheRoad(fecha, hora);
        assertEquals(true, result);
    }

}

package picoplaca.test;

import picoplaca.automobile.domain.Automobile;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import picoplaca.automobile.factory.AutomobileFactory;

/**
 * Calculator for pico and placa, let me know if a car can be on the Road. *
 * On base of the license plate I can have differents type of cars:
 *
 * Vehículos comerciales        A, U, Z	Ejemplo:AAB-0123
 * Vehículos gubernamentales	E	Ejemplo:PEB-0001 
 * Vehículos de uso oficial	X       Ejemplo: GXA-0100 
 * Vehículos de Municpio	M	Ejemplo:LMA-0010 
 * Vehículo privado             Cualquiera menoslas anteriores	Ejemplo: EBA-0234
 *
 * These type of only goverments and oficialuse automobiles don't have pico and
 * placa restriccion. for the other cars the picoAndPlaca is applied in the day
 * and the final letter of the plate as shown here: 
 * DÍA	N° PLACA 
 * LUNES	1 y 2
 * MARTES	3 y 4 
 * MIERCOLES	5 y 6 
 * JUEVES	7 Y 8 
 * VIERNES	9 y 0
 *
 * Between 7:00 and 9:30, and, 16:00 and 19:30.
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

package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class TemperatureClassReporterTest {
    TemperatureClassReporter temperatureClassRep;

    @Before
    public void setUP(){
        temperatureClassRep = new TemperatureClassReporter();
    }

    @Test
    public void getTemperatureInCelsiusTest(){
        temperatureClassRep.setTemperatureInCelsius(32);
        assertEquals(32.0,temperatureClassRep.getTemperatureInCelsius());
    }

    @Test
    public void getTemperatureInFahrenheitTest(){
        temperatureClassRep.setTemperatureInFahrenheit(74);
        assertEquals(74.0,temperatureClassRep.getTemperatureInFahrenheit());
    }

}

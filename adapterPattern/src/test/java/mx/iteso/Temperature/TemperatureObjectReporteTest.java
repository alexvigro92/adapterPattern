package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.adapters.TemperatureClassReporter;
import mx.iteso.adapter.temperature.adapters.TemperatureObjectReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class TemperatureObjectReporteTest {
    TemperatureObjectReporter temperatureObjectReporter;

    @Before
    public void setUP(){
        temperatureObjectReporter = new TemperatureObjectReporter();
    }

    @Test
    public void getTemperatureInCelsiusTest(){
        temperatureObjectReporter.setTemperatureInCelsius(32);
        assertEquals(32.0, temperatureObjectReporter.getTemperatureInCelsius());
    }

    @Test
    public void getTemperatureInFahrenheitTest(){
        temperatureObjectReporter.setTemperatureInFahrenheit(74);
        assertEquals(74.0, temperatureObjectReporter.getTemperatureInFahrenheit());
    }

}

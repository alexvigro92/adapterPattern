package mx.iteso.Temperature;

import mx.iteso.adapter.temperature.CelsiusReporter;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mavg_ on 11/4/2015.
 */
public class CelsiusReporterTest {
    CelsiusReporter celsiusReporter;

    @Before
    public void setUP(){
        celsiusReporter = new CelsiusReporter();
    }

    @Test
    public void getTemperatureInCelsiusTest(){
        celsiusReporter.setTemperatureInCelsius(32);
        assertEquals(32.0,celsiusReporter.getTemperatureInCelsius());
    }


}

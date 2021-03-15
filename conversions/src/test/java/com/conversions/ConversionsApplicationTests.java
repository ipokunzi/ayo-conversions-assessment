package com.conversions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
@SpringBootTest(classes = ConversionsApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ConversionsApplicationTests {

	@Autowired
    private TestRestTemplate restTemplate;

	@LocalServerPort
    private int port;

    private String getRootUrl() {
        return "http://localhost:" + port;
    }

	@Test
	void contextLoads() {
	}
	
	@Test
    public void test_kelvintocelsius() {
        double celsius = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/kelvintocelsius/0.0", Double.class);
        assertEquals(-273.15, celsius);
    }

	@Test
    public void test_celsiustokelvin() {
        double kelvin = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/celsiustokelvin/0", Double.class);
        assertEquals(273.15, kelvin);
    }
	
	@Test
    public void test_milestokilometers() {
        double kilometers = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/milestokilometers/1", Double.class);
        assertEquals(1.609344, kilometers);
    }
	
	@Test
    public void test_kilometerstomiles() {
        double miles = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/kilometerstomiles/1", Double.class);
        assertEquals(0.621371, miles);
    }
	
	@Test
    public void test_kilogramstopounds() {
        double pounds = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/kilogramstopounds/1", Double.class);
        assertEquals(2.20462, pounds);
    }

	@Test
    public void test_poundstokilograms() {
        double kilograms = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/poundstokilograms/1", Double.class);
        assertEquals(0.453593, kilograms);
    }
	
	@Test
    public void test_squarekilometerstosquaremiles() {
        double squaremiles = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/squarekilometerstosquaremiles/1", Double.class);
        assertEquals(0.386102, squaremiles);
    }
	
	@Test
    public void test_squaremilestosquarekilometers() {
        double squarekilometers = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/squaremilestosquarekilometers/1", Double.class);
        assertEquals(2.589989, squarekilometers);
    }
	
	@Test
    public void test_milliliterstoliters() {
        double liters = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/milliliterstoliters/1", Double.class);
        assertEquals(0.001, liters);
    }

	@Test
    public void test_literstomilliliters() {
        double milliliters = restTemplate.getForObject(getRootUrl() + "/api/v1/conversions/literstomilliliters/1", Double.class);
        assertEquals(1000, milliliters);
    }
	
}

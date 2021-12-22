package com.iso_project.test;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	public void testIsHealthy() {
		mainActivity main = new mainActivity();
		Person person = new Person();
		person.setHealthy(true);

		Assert.assertTrue(mainActivity.isHealthy(person));

		person.setHealthy(false);

		Assert.assertFalse(mainActivity.isHealthy(person));

	}

	public void testWeatherTemperatureBelow0() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setTemperature(-5);

		Assert.assertTrue(mainActivity.weatherTemperatureBelow0(weather));

		weather.setTemperature(5);

		Assert.assertFalse(mainActivity.weatherTemperatureBelow0(weather));

	}

	public void testWeatherTemperatureBetween15and25() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setTemperature(0);

		Assert.assertTrue(mainActivity.weatherTemperatureBetween15and25(weather));

		weather.setTemperature(17);

		Assert.assertFalse(mainActivity.weatherTemperatureBetween15and25(weather));

		weather.setTemperature(27);

		Assert.assertFalse(mainActivity.weatherTemperatureBetween15and25(weather));

	}

	public void testNoWaterPrecipitation() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setWaterPrecipitation(true);

		Assert.assertTrue(mainActivity.noWaterPrecipitation(weather));

		weather.setWaterPrecipitation(false);

		Assert.assertFalse(mainActivity.noWaterPrecipitation(weather));

	}

	public void testNotCloudy() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setCloudy(true);

		Assert.assertTrue(mainActivity.notCloudy(weather));

		weather.setCloudy(false);

		Assert.assertFalse(mainActivity.notCloudy(weather));

	}

	public void testHumidityBelow60() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setHumidity(0.4);

		Assert.assertTrue(mainActivity.humidityBelow60(weather));

		weather.setHumidity(1);

		Assert.assertFalse(mainActivity.humidityBelow60(weather));

	}
	
	public void testNoRestrictionsConfinament() {
		mainActivity main = new mainActivity();
		Space space = new Space();
		space.setRestriction(true);

		Assert.assertTrue(mainActivity.noRestrictionsConfinament(space));

		space.setRestriction(false);

		Assert.assertFalse(mainActivity.noRestrictionsConfinament(space));

	}
	
	
	public void testWeatherTemperatureBetween25and35() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setTemperature(0);

		Assert.assertTrue(mainActivity.weatherTemperatureBetween25and35(weather));

		weather.setTemperature(27);

		Assert.assertFalse(mainActivity.weatherTemperatureBetween25and35(weather));

		weather.setTemperature(37);

		Assert.assertFalse(mainActivity.weatherTemperatureBetween25and35(weather));

	}
	
	
	public void testAllowedCapacityNotExceeded() {
		mainActivity main = new mainActivity();
		Space space = new Space();
		space.setAllowedCapacity(true);

		Assert.assertTrue(mainActivity.allowedCapacityNotExceeded(space));

		space.setAllowedCapacity(false);

		Assert.assertFalse(mainActivity.allowedCapacityNotExceeded(space));

	}
	
	
	
	public void testTemperatureAbove30() {
		mainActivity main = new mainActivity();
		Weather weather = new Weather();
		weather.setTemperature(0);

		Assert.assertTrue(mainActivity.temperatureAbove30(weather));

		weather.setTemperature(37);

		Assert.assertFalse(mainActivity.temperatureAbove30(weather));

	}

	
	public void testSwimmingPoolAllowedCapacityNotExceeded() {
		mainActivity main = new mainActivity();
		Space space = new Space();
		space.setAllowedCapacity(true);

		Assert.assertTrue(mainActivity.swimmingPoolAllowedCapacityNotExceeded(space));

		space.setAllowedCapacity(false);

		Assert.assertFalse(mainActivity.swimmingPoolAllowedCapacityNotExceeded(space));

	}
	
	public void testSwimmingPoolAllowedCapacityExceeded() {
		mainActivity main = new mainActivity();
		Space space = new Space();
		space.setAllowedCapacity(true);

		Assert.assertTrue(mainActivity.swimmingPoolAllowedCapacityExceeded(space));

		space.setAllowedCapacity(false);

		Assert.assertFalse(mainActivity.swimmingPoolAllowedCapacityExceeded(space));

	}
	
	
	
	
}
package com.iso_project.test;

import org.junit.Assert;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	public  void testIsHealthy() {
		mainActivity main = new mainActivity();
		Person person=new Person();
		person.setHealthy(true);
		
		Assert.assertTrue(mainActivity.isHealthy(person));
		
		person.setHealthy(false);
		
		Assert.assertFalse(mainActivity.isHealthy(person));

	}
    
	public  void testWeatherTemperatureBelow0() {
		mainActivity main = new mainActivity();
		Weather weather=new Weather();	
		weather.setTemperature(-5);
		
		Assert.assertTrue(mainActivity.weatherTemperatureBelow0(weather));
		
		weather.setTemperature(5);
		
		Assert.assertFalse(mainActivity.weatherTemperatureBelow0(weather));

	}
    
}
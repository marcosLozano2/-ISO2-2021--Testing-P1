package com.iso_project.test;

public class Weather {
	
	private int temperature;
	private double humidity;
	private boolean waterPrecipitation;
	private boolean snowPrecipitation;
	private boolean cloudy;
	public Weather(int temperature, double humidity, boolean waterPrecipitation, boolean snowPrecipitation,boolean cloudy) {
		super();
		this.temperature = temperature;
		this.humidity = humidity;
		this.waterPrecipitation = waterPrecipitation;
		this.snowPrecipitation = snowPrecipitation;
		this.cloudy=cloudy;
	}
	
	public boolean isCloudy() {
		return cloudy;
	}

	public void setCloudy(boolean cloudy) {
		this.cloudy = cloudy;
	}

	public int getTemperature() {
		return temperature;
	}
	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
	public double getHumidity() {
		return humidity;
	}
	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}
	public boolean isWaterPrecipitation() {
		return waterPrecipitation;
	}
	public void setWaterPrecipitation(boolean waterPrecipitation) {
		this.waterPrecipitation = waterPrecipitation;
	}
	public boolean isSnowPrecipitation() {
		return snowPrecipitation;
	}
	public void setSnowPrecipitation(boolean snowPrecipitation) {
		this.snowPrecipitation = snowPrecipitation;
	}
	
}

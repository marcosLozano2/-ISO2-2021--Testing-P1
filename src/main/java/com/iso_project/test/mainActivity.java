package com.iso_project.test;

public class mainActivity {

	public static void main(String[] args) {

		String activity = "";

		Person person = new Person();
		Weather weather = new Weather();
		Space space = new Space();

	}

	public String personAvailability(Person person, String activity) {

		if (isHealthy(person) && !person.isSymptom() && !person.isContactWithInfected() && person.isPassedCovid()
				&& person.isHasVaccinationCard()) {
			activity = "all";
		} else {
			activity = "none";
		}

		return activity;
	}

	public static boolean isHealthy(Person person) {
		if (person.isHealthy()) {
			return true;
		} else {
			return false;
		}
	}

	public String temperatureBelow0_humidityBelow15_thereIsPrecipitation(Weather weather, String activity) {

		if (weather.getTemperature() < 0 && weather.getHumidity() < 0.15
				&& (weather.isSnowPrecipitation() || weather.isWaterPrecipitation())) {
			activity = "stay at home";
		}

		return activity;
	}

	public static boolean weatherTemperatureBelow0(Weather weather) {
		if (weather.getTemperature() < 0) {
			return true;
		} else {
			return false;
		}
	}

	public String temperatureBelow0_humidityBelow15_thereIsNoPrecipitation_legislationCapacityNotExceeded(
			Weather weather, Space space, String activity) {

		if (weather.getTemperature() < 0 && weather.getHumidity() < 0.15
				&& !(weather.isSnowPrecipitation() || weather.isWaterPrecipitation())
				&& space.isLegislationCapacity()) {
			activity = "go skiing";
		}

		return activity;
	}

	public String temperatureBetween0And15_noWaterPrecipitation_plannedAllowedNotExceeded(Weather weather, Space space,
			String activity) {

		if (weather.getTemperature() >= 0 && weather.getTemperature() <= 15 && !weather.isWaterPrecipitation()
				&& space.isPlanetSpaceCapacity()) {
			activity = "go hiking";
		}

		return activity;
	}

/////////////////////////////////////////////////////////////////////////////////////
	public String temperatureBetween15And25_noWaterPrecipitation_notCloudy_humidityBelow60_noRestrictionsConfinament(
			Weather weather, Space space, String activity) {

		if (weatherTemperatureBetween15and25(weather) && noWaterPrecipitation(weather) && notCloudy(weather)
				&& humidityBelow60(weather) && noRestrictionsConfinament(space)) {
			activity = "go sightseeing in the open air";
		}

		return activity;
	}

	public static boolean weatherTemperatureBetween15and25(Weather weather) {
		if (weather.getTemperature() >= 15 && weather.getTemperature() <= 25) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean noWaterPrecipitation(Weather weather) {
		if (!weather.isWaterPrecipitation()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean notCloudy(Weather weather) {
		if (!weather.isCloudy()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean humidityBelow60(Weather weather) {
		if (!(weather.getHumidity() > 0.6)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean noRestrictionsConfinament(Space space) {
		if (!space.isRestrictionOnConfinament()) {
			return true;
		} else {
			return false;
		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////	

	public String temperatureBetween25And35_noWaterPrecipitation_allowedCapacityNotExceeded(Weather weather,
			Space space, String activity) {

		if (weatherTemperatureBetween25and35(weather) && noWaterPrecipitation(weather)
				&& allowedCapacityNotExceeded(space)) {
			activity = "go for a beer";
		}

		return activity;
	}

	public static boolean weatherTemperatureBetween25and35(Weather weather) {
		if (weather.getTemperature() <= 35 && weather.getTemperature() >= 25) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static boolean allowedCapacityNotExceeded(Space space) {
		if (space.isAllowedCapacity()) {
			return true;
		} else {
			return false;
		}
	}
	

/////////////////////////////////////////////////////////////////////////////////////////////////////////
	public String temperatureAbove30_noWaterPrecipitation_swimmingPoolAllowedCapacityNotExceeded(Weather weather,
			Space space, String activity) {

		if (temperatureAbove30(weather) && noWaterPrecipitation(weather) && swimmingPoolAllowedCapacityNotExceeded(space)) {
			activity = "go to the beach or the swimming pool";
		} else if (swimmingPoolAllowedCapacityExceeded(space)) {
			activity = "go to the beach";
		}

		return activity;
	}
	
	public static boolean temperatureAbove30(Weather weather) {
		if (weather.getTemperature() > 30) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static boolean swimmingPoolAllowedCapacityNotExceeded(Space space) {
		if (space.isAllowedCapacity()) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean swimmingPoolAllowedCapacityExceeded(Space space) {
		if (!space.isAllowedCapacity()) {
			return true;
		} else {
			return false;
		}
	}
	
}

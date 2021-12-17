package com.iso_project.test;

public class mainActivity {
	
	
	
	public static void main (String [] args) {
		
		String activity="";
		
		Person person=new Person(false,false,false,false,false);
		Weather weather= new Weather(0, 1.0, false, false,false);
		Space space= new Space(false, false, false, false);
		
		if(person.isHealthy()&&!person.isSymptom()&&!person.isContactWithInfected()&&person.isPassedCovid()&&person.isHasVaccinationCard()) {
			activity="all";
		}else {
			activity="none";
		}
		
		if(weather.getTemperature()<0&&weather.getHumidity()<0.15&&(weather.isSnowPrecipitation()||weather.isWaterPrecipitation())) {
			activity="stay at home";
		}
		
		if(weather.getTemperature()<0&&weather.getHumidity()<0.15&&!(weather.isSnowPrecipitation()||weather.isWaterPrecipitation())&& space.isLegislationCapacity()) {
			activity="go skiing";
		}
		
		if(weather.getTemperature()>=0&&weather.getTemperature()<=15&&!weather.isWaterPrecipitation()&&space.isPlanetSpaceCapacity()) {
			activity="go hiking";
		}
		
		if(weather.getTemperature()>=15&&weather.getTemperature()<=25&&!weather.isWaterPrecipitation()&&!weather.isCloudy()&&!(weather.getHumidity()>0.6)&&!space.isRestrictionOnConfinament()) {
			activity="go sightseeing in the open air";
		}
		
		if(weather.getTemperature()>30&&!weather.isWaterPrecipitation()&& space.isAllowedCapacity()) {
			activity="go to the beach or the swimming pool";
		}else if(!space.isAllowedCapacity()) {
			activity="go to the beach";
		}
		
		if((weather.getTemperature()<35&&weather.getTemperature()>20)&&!weather.isWaterPrecipitation()&&space.isAllowedCapacity()) {
			activity="go for a beer";
		}
	

	}
	
	public String personAvailability(Person person,String activity) {
		
		if(person.isHealthy()&&!person.isSymptom()&&!person.isContactWithInfected()&&person.isPassedCovid()&&person.isHasVaccinationCard()) {
			activity="all";
		}else {
			activity="none";
		}
		
		return activity;
	}
	
	public String temperatureBelow0_humidityBelow15_thereIsPrecipitation(Weather weather,String activity) {
		
		if(weather.getTemperature()<0&&weather.getHumidity()<0.15&&(weather.isSnowPrecipitation()||weather.isWaterPrecipitation())) {
			activity="stay at home";
		}
		
		return activity;
	}
	
public String temperatureBelow0_humidityBelow15_thereIsNoPrecipitation_legislationCapacityNotExceeded(Weather weather,Space space,String activity) {
		
	if(weather.getTemperature()<0&&weather.getHumidity()<0.15&&!(weather.isSnowPrecipitation()||weather.isWaterPrecipitation())&& space.isLegislationCapacity()) {
		activity="go skiing";
	}
		
		return activity;
	}
	
public String temperatureBetween0And15_noWaterPrecipitation_plannedAllowedNotExceeded(Weather weather,Space space,String activity) {
	
	if(weather.getTemperature()>=0&&weather.getTemperature()<=15&&!weather.isWaterPrecipitation()&&space.isPlanetSpaceCapacity()) {
		activity="go hiking";
	}
		
		return activity;
	}

public String temperatureBetween15And25_noWaterPrecipitation_notCloudy_humidityBelow60_noRestrictionsConfinament(Weather weather,Space space,String activity) {
	
	if(weather.getTemperature()>=15&&weather.getTemperature()<=25&&!weather.isWaterPrecipitation()&&!weather.isCloudy()&&!(weather.getHumidity()>0.6)&&!space.isRestrictionOnConfinament()) {
		activity="go sightseeing in the open air";
	}
		
		return activity;
	}


public String temperatureBetween25And35_noWaterPrecipitation_allowedCapacityNotExceeded(Weather weather,Space space,String activity) {
	
	if((weather.getTemperature()<=35&&weather.getTemperature()>=25)&&!weather.isWaterPrecipitation()&&space.isAllowedCapacity()) {
		activity="go for a beer";
	}
		
		return activity;
	}

public String temperatureAbove30_noWaterPrecipitation_swimmingPoolAllowedCapacityNotExceeded(Weather weather,Space space,String activity) {
	
	if(weather.getTemperature()>30&&!weather.isWaterPrecipitation()&& space.isAllowedCapacity()) {
		activity="go to the beach or the swimming pool";
	}else if(!space.isAllowedCapacity()) {
		activity="go to the beach";
	}
		
		return activity;
	}

	
	

}

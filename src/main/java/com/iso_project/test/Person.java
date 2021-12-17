package com.iso_project.test;

public class Person {
	
	private boolean healthy;
	private boolean symptom;
	private boolean contactWithInfected;
	private boolean passedCovid;
	private boolean hasVaccinationCard;
	
	
	public Person(boolean healthy, boolean symptom, boolean contactWithInfected, boolean passedCovid,
			boolean hasVaccinationCard) {
		
		this.healthy = healthy;
		this.symptom = symptom;
		this.contactWithInfected = contactWithInfected;
		this.passedCovid = passedCovid;
		this.hasVaccinationCard = hasVaccinationCard;
	}
	public boolean isHealthy() {
		return healthy;
	}
	public void setHealthy(boolean healthy) {
		this.healthy = healthy;
	}
	public boolean isSymptom() {
		return symptom;
	}
	public void setSymptom(boolean symptom) {
		this.symptom = symptom;
	}
	public boolean isContactWithInfected() {
		return contactWithInfected;
	}
	public void setContactWithInfected(boolean contactWithInfected) {
		this.contactWithInfected = contactWithInfected;
	}
	public boolean isPassedCovid() {
		return passedCovid;
	}
	public void setPassedCovid(boolean passedCovid) {
		this.passedCovid = passedCovid;
	}
	public boolean isHasVaccinationCard() {
		return hasVaccinationCard;
	}
	public void setHasVaccinationCard(boolean hasVaccinationCard) {
		this.hasVaccinationCard = hasVaccinationCard;
	}
	
	

}

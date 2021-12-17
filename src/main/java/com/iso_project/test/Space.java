package com.iso_project.test;

public class Space {
	
	private boolean legislationCapacity;
	private boolean planetSpaceCapacity;
	private boolean restrictionOnConfinament;
	private boolean allowedCapacity;
	
	
	
	public Space(boolean legislationCapacity, boolean planetSpaceCapacity, boolean restrictionOnConfinament,
			boolean allowedCapacity) {
		super();
		this.legislationCapacity = legislationCapacity;
		this.planetSpaceCapacity = planetSpaceCapacity;
		this.restrictionOnConfinament = restrictionOnConfinament;
		this.allowedCapacity = allowedCapacity;
	}
	public boolean isLegislationCapacity() {
		return legislationCapacity;
	}
	public void setLegislationCapacity(boolean legislationCapacity) {
		this.legislationCapacity = legislationCapacity;
	}
	public boolean isPlanetSpaceCapacity() {
		return planetSpaceCapacity;
	}
	public void setPlanetSpaceCapacity(boolean planetSpaceCapacity) {
		this.planetSpaceCapacity = planetSpaceCapacity;
	}
	public boolean isRestrictionOnConfinament() {
		return restrictionOnConfinament;
	}
	public void setRestriction(boolean restrictionOnConfinament) {
		this.restrictionOnConfinament = restrictionOnConfinament;
	}
	public boolean isAllowedCapacity() {
		return allowedCapacity;
	}
	public void setAllowedCapacity(boolean allowedCapacity) {
		this.allowedCapacity = allowedCapacity;
	}
	
}

package com.learning.java11.scjp.lambdas;

public class Animal {

	private String animalName;
	private boolean canSwim,canHop,canFly;
	
	public Animal(String animalName,boolean canSwim,boolean canHop,boolean canFly) {
		this.animalName= animalName;
		this.canHop= canHop;
		this.canSwim= canSwim;
		this.canFly= canFly;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	public boolean isCanSwim() {
		return canSwim;
	}
	public void setCanSwim(boolean canSwim) {
		this.canSwim = canSwim;
	}
	public boolean isCanHop() {
		return canHop;
	}
	public void setCanHop(boolean canHop) {
		this.canHop = canHop;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
}

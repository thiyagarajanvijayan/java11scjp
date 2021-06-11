package com.learning.java11.scjp.lambdas;

public class TestLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal cat =new Animal("Cat",true,true,false);
		print(cat, animal ->{animal.setCanSwim(true);animal.setCanFly(true); return animal.isCanSwim();});
		print(cat, animal ->{return animal.isCanHop();});
	}

	static void  print(Animal animal,CheckAnimalCharacter checker) {
		System.out.println(checker.test(animal));
	}
}

package LiskovSubstitution.bad;

import java.util.*;
public class badExample {

	public static void main(String[] args){

		Airplane a = new Airplane();
		Fighter f = new Fighter();
		Drone d = new Drone();

		System.out.println("Airplane:");
		a.fly();
		a.engine();
		a.manned();
		System.out.println();

		System.out.println("Fighter:");	
		f.fly();
		f.engine();
		f.manned();
		f.fight();
		System.out.println();

		System.out.println("Drone:");
		d.fly();
		d.engine();
		d.manned();

	}	
}

class Airplane {

	public void fly() {
		System.out.println("can fly");
	}
	public void engine() {
		System.out.println("have engine");
	}
	public void manned() {
		System.out.println("can carry people");
	}

}

class Fighter extends Airplane {

	public void fight() {
		System.out.println("can fight");
	}
	
}

class Drone extends Airplane {

	@Override
	public void manned() {
		System.out.println("can't carry people");
	}

}

package LiskovSubstitution.good;

import java.util.*;
public class goodExample {

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

class Base {

	public void fly() {
		System.out.println("can fly");
	}
	public void engine() {
		System.out.println("have engine");
	}
}

interface Plane {

	public abstract void manned();

}

class Airplane extends Base implements Plane {
	@Override
	public void manned() {
		System.out.println("can carry people");
	}

}

class Fighter extends Base implements Plane {
	@Override
	public void manned() {
		System.out.println("can carry people");
	}

	public void fight() {
		System.out.println("can fight");
	}

}

class Drone extends Base implements Plane {
	@Override
	public void manned() {
		System.out.println("can't carry people");
	}

}
	
	


package LiskovSubstitution.good;

public class goodExample{
    public static void main(String[] args){
        Airplane a = new Airplane();
        Fighter f = new Fighter();
        Drone d = new Drone();
        a.fly();
        a.engine();
        a.manned();

        f.fly();
        f.engine();
        f.manned();
        f.fight();

        d.fly();
        d.engine();
        d.manned();
    }
}
class Airplane  {
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

    public void fly() {
        System.out.println("can fly");
    }
    public void engine() {
        System.out.println("have engine");
    }
    public void manned() {
        System.out.println("can carry people");
    }
    public void fight() {
        System.out.println("can fight");
    }

}

class Drone extends Airplane {

    public void fly() {
        System.out.println("can fly");
    }
    public void engine() {
        System.out.println("have engine");
    }
    @Override
    public void manned() {
        System.out.println("no need to drive");
    }

}
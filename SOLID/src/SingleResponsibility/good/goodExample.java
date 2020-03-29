package SingleResponsibility.good;

public class goodExample {
    public static void main(String[] args) {
        Manned manned = new Manned();
        manned.fly("I am airliner");

        Detect detect = new Detect();
        detect.fly("I am drone");

        Fighter fighter = new Fighter();
        fighter.fly("I am fighter");
    }


}

class Manned{
    public void fly(String airplane) {
        System.out.println(airplane + "can carry people");
    }
}

class Detect{
    public void fly(String airplane) {
        System.out.println(airplane + "can detect enemy");
    }

}

class Fighter{
    public void fly(String airplane) {
        System.out.println(airplane + "can fight");
    }

}
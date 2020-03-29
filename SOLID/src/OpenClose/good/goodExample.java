package OpenClose.good;

public class goodExample {

    public static void main(String[] args) {
        Component component = new Component();
        component.com("i have ");

        Move move = new Move();
        move.m("i have");

        Fight fight = new Fight();
        fight.fight("i fight by");
    }

}


class Component{
    public void com(String fighter) {
        System.out.print(fighter+"engine ");
        System.out.println("propeller");
    }
}

class Move{
    public void m(String fighter) {
        System.out.print("forword ");
        System.out.print("back ");
        System.out.print("left ");
        System.out.println("right");
    }
}

class Fight{
    public void fight(String fighter) {
        System.out.print("launch the rocket");
        System.out.println("shoot the bullet");

    }

}
//不符合interface segregation
package InterfaceSegregation.bad;
import java.util.*;

public class badExample {
    public static void main(String[] args){
        airplane ap = new airplane();
        ap.action(new drone());
        ap.action(new fighter());
    }
}
class airplane{
    public void action(tool a1){
        a1.manned();
        a1.fly();
        a1.engine();
    }
}
interface tool{
    void manned();
    void fly();
    void engine();
}
class drone implements tool{
    public void manned(){
        System.out.println("Drone can carry people.");
    }
    public void fly(){
        System.out.println("Drone can fly.");
    }
    public void engine(){
        System.out.println("Drone have engine.");
    }
}
class fighter implements tool{
    public void manned(){
        System.out.println("Fighter can carry people.");
    }
    public void fly(){
        System.out.println("Fighter can fly.");
    }
    public void engine(){
        System.out.println("Fighter have engine.");
    }
}
    package InterfaceSegregation.good;

    //符合interface segregation
    public class goodExample {
        public static void main(String[] args){
            airplane ap = new airplane();
            ap.action1(new drone());
            ap.action1(new fighter());
            ap.action2(new fighter());
        }
    }
    class airplane{
        public void action1(tool1 a1){
            a1.fly();
            a1.engine();
        }
        public void action2(tool2 a2){
            a2.manned();
        }
    }
    interface tool1{
        public void fly();
        public void engine();
    }
    interface tool2{
        public void manned();
    }
    class drone implements tool1{
        public void fly(){
            System.out.println("Drone can fly.");
        }
        public void engine(){
            System.out.println("Drone have engine.");
        }
    }
    class fighter implements tool1, tool2{
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
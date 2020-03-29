package SingleResponsibility.good;

public class goodExample {
    public static void main(String[] args) {
        drone plane1 = new drone(100, "COVID-18");
        fighter plane2 = new fighter(1000, 9999, "SARS-CoV5");
    }
}
class drone {
    private int gas;
    private String droneID;
    drone(int gas, String ID){
        this.droneID = ID;
        this.gas = gas;
    }
}
class fighter {
    private int gas;
    private int load;
    private String fighterID;
    fighter(int gas, int load, String name){
        this.fighterID = name;
        this.gas = gas;
        this.load = load;
    }
}
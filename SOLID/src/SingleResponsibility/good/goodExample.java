package SingleResponsibility.good;

public class goodExample {
    public static void main(String[] args) {
        Drone plane1 = new Drone(100, "COVID-18", "Nikon3310");
        Fighter plane2 = new Fighter(1000, 9999, "SARS-CoV5");
    }
}
class Drone {
    private int gas;
    private String cameraType;
    private String droneID;
    Drone(int gas, String ID, String cameraType){
        this.droneID = ID;
        this.gas = gas;
        this.cameraType = cameraType;
    }
}
class Fighter {
    private int gas;
    private int bullet;
    private String fighterID;
    Fighter(int gas, int bullet, String name){
        this.fighterID = name;
        this.gas = gas;
        this.bullet = bullet;
    }
}
package SingleResponsibility.good;

public class goodExample {
    public static void main(String[] args) {
        drone plane1 = new drone(100, "COVID-18", "Nikon3310");
        fighter plane2 = new fighter(1000, 9999, "SARS-CoV5");
    }
}
class drone {
    private int gas;
    private String cameraType;
    private String droneID;
    drone(int gas, String ID, String cameraType){
        this.droneID = ID;
        this.gas = gas;
        this.cameraType = cameraType;
    }
}
class fighter {
    private int gas;
    private int bullet;
    private String fighterID;
    fighter(int gas, int bullet, String name){
        this.fighterID = name;
        this.gas = gas;
        this.bullet = bullet;
    }
}
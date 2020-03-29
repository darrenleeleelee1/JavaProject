package SingleResponsibility.bad;

public class badExample {
    public static void main(String[] args) {
        Plane fighter = new Plane(1000, 9999, "SARS-CoV5", null);
        Plane drone = new Plane(100, 0,"COVID-18", "Nikon3310");
        //對於drone來說,他不需要bullet，bullet就是多餘的
        //對於fighter來說，他則不需要camera
        //修改code時就有可能發生錯誤
        //因此我們應該把兩個class 拉到一個super class 在去實作細節
    }
}
class Plane{
    private int gas;
    private int bullet;
    private String planeID;
    private String cameraType;
    Plane(int gas, int bullet, String name, String cameraType){
        this.gas = gas;
        this.bullet = bullet;
        this.planeID = name;
        this.cameraType = cameraType;
    }
}

package DependencyInversion.good;
public class goodExample {
    public static void main(String[] args) {
        airplane ap = new airplane();
        ap.siren(new fighter());
        ap.siren(new drone());
        ap.siren(new airliner());
    }
}
class airplane{
    public void siren(Sound sound){
        System.out.println(sound.getSiren());
    }
}
interface Sound{
    public String getSiren();
}
class fighter implements Sound{
    @Override
    public String getSiren() {
        return "Da Da Da Da!";
    }
}
class drone implements Sound{
    @Override
    public String getSiren() {
        return "Hong Hong Hong~";
    }
}
class airliner implements Sound{
    @Override
    public String getSiren() {
        return "__________";
    }
}
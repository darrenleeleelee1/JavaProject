package DependencyInversion.bad;
//siren 飛機的轟鳴聲
public class badExample {
    public static void main(String[] args) {
        airplane ap = new airplane();
        ap.siren(new fighter());
        ap.siren(new drone());
        ap.siren(new airliner());
    }
}
class airplane{
    public void siren(fighter sound){
        System.out.println(sound.getSiren());
    }
    public void siren(drone sound){
        System.out.println(sound.getSiren());
    }
    public void siren(airliner sound){
        System.out.println(sound.getSiren());
    }
}
class fighter{
    public String getSiren() {
        return "Da Da Da Da!";
    }
}
class drone{
    public String getSiren() {
        return "Hong Hong Hong~";
    }
}
class airliner{
    public String getSiren() {
        return "__";
    }
}
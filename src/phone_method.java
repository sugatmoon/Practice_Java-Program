public class phone_method {
    public static void main(String[] args) {
        cellPhone call = new cellPhone();
        call.vr = "Vibration......";
        call.ri = "Ringing.......";
        call.sound = "Sounding.....";
        call.phone1();
        call.phone2();
        call.phone3();
    }
}
class cellPhone{
    String vr;
    String ri;
    String sound;
    public void phone1(){
        System.out.println(vr);
    }
    public void phone2(){
        System.out.println(ri);
    }
    public void phone3(){
        System.out.println(sound);
    }
}

import javax.naming.spi.StateFactory;

public class Rock_star_game {
    public static void main(String[] args) {
        Tommy_vecetti sc = new Tommy_vecetti();
        sc.fire ="Finring on the ememy in the game.";
        sc.hide= "Hide beside the rock.....";
        sc.run ="Running on the game!!!";
        sc.runing();
        sc.firing();
        sc.hideing();
    }
}
class Tommy_vecetti{
    String hide;
    public void hideing(){
        System.out.println(hide);
    }
    String fire;
    public void firing(){
        System.out.println(fire);
    }
    String run;
    public void runing(){
        System.out.println(run);
    }

}

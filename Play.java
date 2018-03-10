import java.util.ArrayList;
public class Play {
  public static void main(String[] args) {
    ArrayList<Brikke> players = new ArrayList<Brikke>();
    players.add(new Brikke("Preben"));
    players.add(new Brikke("Arne"));
    players.add(new Brikke("MonkaS"));

    StigeSpill brett = new StigeSpill(players);
    System.out.println(brett.play() + " Vant!");
  }
}

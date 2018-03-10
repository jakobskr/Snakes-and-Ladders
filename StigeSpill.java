import java.util.ArrayList;
import java.util.Random;

public class StigeSpill {

  final int gaol = 100;
  ArrayList<Brikke> players = new ArrayList<Brikke>();
  ArrayList<Stige> ladders = new ArrayList<Stige>();
  Random randomGenerator = new Random();

  StigeSpill(ArrayList<Brikke> a) {
    players = a;
  }

  public Brikke play() {
    int check;
    while(true) {
      for (Brikke b: players) {
        check =  randomGenerator.nextInt(6) + 1;
        b.plass += check;
        System.out.println(b +  " " + check +  " -> " + b.plass);
        if (b.plass == gaol) {
          return b;
        }
        else if (b.plass > gaol) {
          b.plass = gaol - (b.plass - gaol);
        }
      }
    }
  }
}

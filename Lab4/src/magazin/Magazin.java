package magazin;
import cutii.Cub;
import cutii.Cilindru;
import cutii.Paralelipiped;
import cutii.ICutie;
import jucarii.Jucarie;
import jucarii.Minge;
import jucarii.Racheta;
import jucarii.Avion;

public class Magazin {

    public static void main(String[] args) {
        System.out.println("\n===== Demo Pachet (1p) =====");
        Pachet p1 = new Pachet(new Minge(10), true, true);
        System.out.println(p1);
        System.out.println("Pret="+p1.pretPachet());
    }
}
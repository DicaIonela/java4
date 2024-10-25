package magazin;
import cutii.Cub;
import cutii.Cilindru;
import cutii.Paralelipiped;
import cutii.ICutie;
import jucarii.Jucarie;
public class FabricaCutii {
    public static ICutie getCutie(Jucarie jucarie) {
        switch (jucarie.getTipCutie()) {
            case CUB:
                double diametru = jucarie.getDimensiuni()[0]; // diametru pentru minge
                return new Cub(diametru); // se va face un cub pe baza diametrului
            case CILINDRU:
                double lungimeRacheta = jucarie.getDimensiuni()[0]; // lungime pentru rachetă
                double diametruRacheta = jucarie.getDimensiuni()[1]; // diametru pentru rachetă
                return new Cilindru(diametruRacheta / 2, lungimeRacheta); // radius = diametru/2
            case PARALELIPIPED:
                double lungimeAvion = jucarie.getDimensiuni()[0];
                double latimeAvion = jucarie.getDimensiuni()[1];
                double inaltimeAvion = jucarie.getDimensiuni()[2];
                return new Paralelipiped(lungimeAvion, latimeAvion, inaltimeAvion);
            default:
                throw new IllegalArgumentException("Tip cutie necunoscut pentru jucăria specificată.");
        }
    }
}

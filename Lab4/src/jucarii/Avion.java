package jucarii;
import cutii.TipCutie;
public class Avion extends Jucarie{
    private static final double pret=100;

    public Avion(double lungime, double latime, double inaltime) {
        super(lungime,latime,inaltime);
    }

    @Override
    public String toString() {
        return "Avion: cutie recomandata-"+TipCutie.PARALELIPIPED;
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.PARALELIPIPED;
    }

    @Override
    public double getPret() {
        return pret;
    }
}

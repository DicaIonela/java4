package jucarii;
import cutii.TipCutie;
public class Minge extends Jucarie {
    private static final double pret=50;

    public Minge(double diametru) {
        super(diametru,0,0);
    }

    @Override
    public String toString() {
        return "Minge: cutie recomandata-"+TipCutie.CUB;
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.CUB;
    }

    @Override
    public double getPret() {
        return pret;
    }
}

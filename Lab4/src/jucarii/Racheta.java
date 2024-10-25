package jucarii;
import cutii.TipCutie;
public class Racheta extends Jucarie{
    private static final double pret=120;

    public Racheta(double lungime,double diametru){
        super(diametru,lungime,0);
    }

    @Override
    public String toString() {
        return "Racheta: cutie recomandata-"+TipCutie.CILINDRU;
    }

    @Override
    public TipCutie getTipCutie() {
        return TipCutie.CILINDRU;
    }

    @Override
    public double getPret() {
        return pret;
    }
}

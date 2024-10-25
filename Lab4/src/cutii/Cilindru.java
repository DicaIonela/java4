package cutii;

public class Cilindru implements ICutie {
    private double raza;
    private double inaltime;

    public String toString() {
        return "Cilindru";
    }
    public Cilindru(double raza, double inaltime) {
        this.raza = raza;
        this.inaltime = inaltime;
    }
    @Override
    public double getSuprafataTotala() {
        return 2 * Math.PI * raza * (raza+inaltime);
    }

    @Override
    public double getLungimePanglica() {
        double lungime=2*Math.PI*raza;
        return Math.round(lungime)*2+lnod;

    }
}

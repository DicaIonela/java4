package cutii;

public class Paralelipiped implements ICutie {
    private double lungime;
    private double latime;
    private double inaltime;
    public String toString() {
        return "Paralelipiped";
    }
    public Paralelipiped(double lungime, double latime, double inaltime) {
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public double getSuprafataTotala() {
        return 2 * (lungime * latime + latime * inaltime + lungime * inaltime);
    }

    @Override
    public double getLungimePanglica() {
        return 2 * (lungime + latime + inaltime) + lnod;
    }
}

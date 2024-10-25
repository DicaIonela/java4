package magazin;

public class RolaPanglica {
    private static RolaPanglica instance;
    private double lungimeDisponibila;
    private final double costUnitateLungime;

    private RolaPanglica() {
        this.lungimeDisponibila = 10000;
        this.costUnitateLungime = 0.01;
    }
    public static RolaPanglica getInstance() {
        if (instance == null) {
            instance = new RolaPanglica();
        }
        return instance;
    }
    public boolean cumparaPanglica(double lungime) {
        if (lungime <= lungimeDisponibila) {
            lungimeDisponibila -= lungime;
            return true;
        } else {
            return false;
        }
    }
    public double getLungimeDisponibila() {
        return lungimeDisponibila;
    }
    public double calculeazaCost(double lungime) {
        return lungime * costUnitateLungime;
    }
}

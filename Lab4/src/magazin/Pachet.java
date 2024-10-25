package magazin;

import cutii.ICutie;
import jucarii.Jucarie;

public class Pachet {
    private Jucarie jucarie;
    private ICutie cutie;
    private double lungPanglica;
    private boolean cereCutie;
    private boolean cerePanglica;

    public Pachet(Jucarie jucarie, boolean cereCutie, boolean cerePanglica) {
        this.jucarie = jucarie;
        this.cereCutie = cereCutie;
        this.cerePanglica = cerePanglica;

        if (cereCutie) {
            this.cutie = FabricaCutii.getCutie(jucarie);
        }

        if (cerePanglica && cutie != null) {
            this.lungPanglica = cutie.getLungimePanglica();
            boolean panglicaCumparata = RolaPanglica.getInstance().cumparaPanglica(this.lungPanglica);
            if (!panglicaCumparata) {
                throw new IllegalArgumentException("Lungimea panglicii cerută nu este disponibilă.");
            }
        }
    }

    public double pretPachet() {
        double pretTotal = jucarie.getPret();
        if (cereCutie) {
            pretTotal += cutie.pret();
        }
        if (cerePanglica) {
            pretTotal += RolaPanglica.getInstance().calculeazaCost(lungPanglica);
        }
        return pretTotal;
    }

    @Override
    public String toString() {
        return "Pachet{" +
                "jucarie={" + jucarie.toString()+ ", l1=" + jucarie.getDimensiuni()[0] + "}," +
                " impachetat in " + cutie +
                ", lungPanglica=" + lungPanglica +
                '}';
    }
}

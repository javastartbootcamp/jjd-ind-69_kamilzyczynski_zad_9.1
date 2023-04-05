package pl.javastart.task;

public class PodatekWgSkali extends FormaOpodatkowania {

    private static final double PIERWSZY_PROG = 10_000;
    private static final double DRUGI_PROG = 100_000;
    private static final double PODATEK_18 = 0.18;
    private static final double PODATEK_32 = 0.32;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = wyliczDochod(przychody, wydatki);

        if (dochod <= PIERWSZY_PROG) {
            return 0;
        } else if (dochod <= DRUGI_PROG) {
            return (dochod - PIERWSZY_PROG) * PODATEK_18;
        } else {
            return (DRUGI_PROG - PIERWSZY_PROG) * PODATEK_18 + (dochod - DRUGI_PROG) * PODATEK_32;
        }
    }

    @Override
    public String getName() {
        return "Podatek według skali";
    }
}

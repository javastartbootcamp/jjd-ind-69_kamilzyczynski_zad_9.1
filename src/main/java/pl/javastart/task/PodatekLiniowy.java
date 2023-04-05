package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    private static final double PODATEK_19 = 0.19;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        double dochod = wyliczDochod(przychody, wydatki);
        return dochod * PODATEK_19;
    }

    @Override
    public String getName() {
        return "Podatek liniowy";
    }
}

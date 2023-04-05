package pl.javastart.task;

public class RyczaltEwidencjonowany extends FormaOpodatkowania {

    private static final double PODATEK_15 = 0.15;

    @Override
    public double wyliczPodatek(double przychody, double wydatki) {
        return przychody * PODATEK_15;
    }

    @Override
    public String getName() {
        return "Ryczałt ewidencjonowany";
    }
}

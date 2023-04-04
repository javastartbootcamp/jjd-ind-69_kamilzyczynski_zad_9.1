package pl.javastart.task;

public class PodatekLiniowy extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody) {
        return przychody * 0.19;
    }
}

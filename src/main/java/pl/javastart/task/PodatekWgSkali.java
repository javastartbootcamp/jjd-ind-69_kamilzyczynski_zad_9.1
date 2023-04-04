package pl.javastart.task;

public class PodatekWgSkali extends FormaOpodatkowania {

    @Override
    public double wyliczPodatek(double przychody) {
        double pierwszyProg = 10000;
        double drugiProg = 100000;

        if (przychody <= pierwszyProg) {
            return 0;
        } else if (przychody <= drugiProg) {
            return (przychody - 10000) * 0.18;
        } else {
            return (drugiProg - pierwszyProg) * 0.18 + (przychody - drugiProg) * 0.32;
        }

    }
}

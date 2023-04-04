package pl.javastart.task;

public class Firma {

    private String nazwa;
    private FormaOpodatkowania formaOpodatkowania;
    private double przychody;
    private double wydatki;

    public Firma(String nazwa, FormaOpodatkowania formaOpodatkowania) {
        this.nazwa = nazwa;
        this.formaOpodatkowania = formaOpodatkowania;
    }

    public void wyswietlPodsumowanie() {
        double kwotaOpodatkowana = zsumujPrzychody();

        if (formaOpodatkowania instanceof PodatekLiniowy) {
            kwotaOpodatkowana = wyliczDochod();
        }
        if (formaOpodatkowania instanceof PodatekWgSkali) {
            kwotaOpodatkowana = wyliczDochod();
        }

        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getClass().getSimpleName());
        System.out.printf("Suma przychodów: %.2f zł\n", zsumujPrzychody());
        System.out.printf("Suma wydatków: %.2f zł\n", zsumujWydatki());
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(kwotaOpodatkowana));
        System.out.print("\n\n");
    }

    private double zsumujWydatki() {
        return wydatki;
    }

    private double zsumujPrzychody() {
        return przychody;
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody += wartosc;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki += wartosc;
    }

    private double wyliczDochod() {
        return przychody - wydatki;
    }
}

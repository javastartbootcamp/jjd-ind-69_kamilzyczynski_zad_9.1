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
        System.out.printf("======= Firma: %s ===========\n", nazwa);
        System.out.printf("Forma opodatkowania: %s\n", formaOpodatkowania.getName());
        System.out.printf("Suma przychodów: %.2f zł\n", przychody);
        System.out.printf("Suma wydatków: %.2f zł\n", wydatki);
        System.out.printf("Podatek do zapłacenia: %.2f zł", formaOpodatkowania.wyliczPodatek(przychody, wydatki));
        System.out.print("\n\n");
    }

    public void dodajPrzychod(String nazwa, double wartosc) {
        przychody += wartosc;
    }

    public void dodajWydatek(String nazwa, double wartosc) {
        wydatki += wartosc;
    }
}

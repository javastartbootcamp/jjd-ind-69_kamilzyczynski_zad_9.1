package pl.javastart.task;

public class FormaOpodatkowania {

    public double wyliczPodatek(double przychody, double wydatki) {
        System.out.println("Metoda z wyliczaniem podatku nie została nadpisana");
        return -1;
    }

    public double wyliczDochod(double przychody, double wydatki) {
        return przychody - wydatki;
    }

    public String getName() {
        return "Brak nazwy";
    }
}

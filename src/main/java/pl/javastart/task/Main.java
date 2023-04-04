package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma("JanuszPOL", new PodatekWgSkali());

        firma.dodajPrzychod("Remont Mieszkania", 150_000);
        firma.dodajWydatek("Gładzie i farby", 20_000);

        firma.wyswietlPodsumowanie();

        Firma janNowakServices = new Firma("Jan Nowak IT Services", new RyczaltEwidencjonowany());

        janNowakServices.dodajPrzychod("Programowanie", 15_000);
        janNowakServices.dodajWydatek("Energetyki", 200);

        janNowakServices.wyswietlPodsumowanie();
    }

}

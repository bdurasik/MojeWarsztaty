package com.company;

public class Main {

    public static void main(String[] args) {

        Human czlowiek = new Human();
        czlowiek.setImie("Adam");
        czlowiek.setWiek(30);
        czlowiek.setWiek(31);
        czlowiek.setKolorWlosow("Blondyn");
        Koszulka tshirt = new Koszulka();
        tshirt.setKolor("niebieski");
        tshirt.setMaterial("bawelna");
        tshirt.setRozmiar(36);

        System.out.println(
                "\nImię obiektu 'czlowiek' to: " + czlowiek.getImie() +
                        "\nJego wiek to: " + czlowiek.getWiek() +
                        "\nJego kolor włosów to: " + czlowiek.getKolorWlosow() +
                        " Jego koszulka jest w rozmiarze " + tshirt.getRozmiar() + " w kolorze " + tshirt.getKolor() +
                        " oraz zrobiona jest z materiału o nazwie " + tshirt.getMaterial()
        );
    }
}
package com.company;

public class Human {

    private int wiek = 0;
    private String imie;
    private String kolorWlosow;

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        // Jeżeli zmienna 'this.wiek' jest pusta
        if (this.wiek == 0)
            // Ustaw wiek
            this.wiek = wiek;
            // W innym przypadku
        else
            // wypisz informację o wieku człowieka
            System.out.println("Człowiek ma już ustawiony wiek: " + this.wiek);
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(String kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }
}
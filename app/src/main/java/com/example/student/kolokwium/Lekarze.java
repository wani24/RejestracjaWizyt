package com.example.student.kolokwium;


public class Lekarze {

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getGprzyjec() {
        return gprzyjec;
    }

    public void setGprzyjec(String gprzyjec) {
        this.gprzyjec = gprzyjec;
    }
    private String imie;
    private String nazwisko;
    private String przyjec;
    private String gprzyjec;
    Lekarze(String imie, String nazwisko, String gprzyjec)
    {


        this.imie = imie;
        this.nazwisko = nazwisko;
        this.gprzyjec = gprzyjec;
    }

}

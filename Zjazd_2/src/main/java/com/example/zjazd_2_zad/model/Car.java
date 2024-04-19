package com.example.zjazd_2_zad.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public class Car {
    private String model;
    private String marka;

    private String cena;

    public Car(String model, String marka, String cena) {
        this.model = model;
        this.marka = marka;
        this.cena = cena;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getCena() {
        return cena;
    }

    public void setCena(String cena) {
        this.cena = cena;
    }





}

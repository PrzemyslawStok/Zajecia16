package com.company;

public class Prostokat extends FiguraGeometryczna{
    double szerokosc, wysokosc;

    Prostokat(double szerokosc, double wysokosc){
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    @Override
    public void wypiszDane() {

        System.out.println("szerokość: "+szerokosc);
        System.out.println("wysokość: "+wysokosc);
    }

    @Override
    public void polePowierzchni() {

        System.out.println("Pole powierzchni prostokąta: "+szerokosc*wysokosc);
    }
}

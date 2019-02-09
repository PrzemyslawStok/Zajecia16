package com.company;

public class Kolo extends FiguraGeometryczna{
    double mPromien = 0;

    Kolo(double promien){
        mPromien = promien;
    }

    @Override
    public void wypiszDane() {

        System.out.println("Koło: promień="+mPromien);
    }

    @Override
    public void polePowierzchni() {

        System.out.println("Pole powierzchni koła:"+Math.PI*mPromien*mPromien);
    }
}

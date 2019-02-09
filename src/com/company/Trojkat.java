package com.company;

public class Trojkat extends FiguraGeometryczna{
    double mDlugoscBoku;

    Trojkat(double dlugoscBoku){
        mDlugoscBoku = dlugoscBoku;

    }

    @Override
    public void wypiszDane() {
        System.out.println("Trójkąt: długość boku="+mDlugoscBoku);
    }

    @Override
    public void polePowierzchni() {
        System.out.println("Pole powierzchni: "+mDlugoscBoku*mDlugoscBoku*Math.sqrt(3)/4);
    }
}

package com.company;

public class Kwadrat extends FiguraGeometryczna{
    double dlugoscBoku;

    Kwadrat(double dlugoscBoku){

        this.dlugoscBoku = dlugoscBoku;
    }

    @Override
    public void wypiszDane() {

        System.out.println("Kwadrat: długość boku="+dlugoscBoku);
    }

    @Override
    public void polePowierzchni() {

        System.out.println("Pole powierzchni kwadratu:"+dlugoscBoku*dlugoscBoku);
    }
}

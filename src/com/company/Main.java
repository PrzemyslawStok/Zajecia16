package com.company;

import java.lang.annotation.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FiguraGeometryczna figura1, figura2;

        figura1 = new Prostokat(20,40);

        figura1.wypiszDane();
        figura1.polePowierzchni();

        figura2 = new Kolo(50);

        figura2.wypiszDane();
        figura2.polePowierzchni();

        ArrayList<FiguraGeometryczna> figury = new ArrayList<>();

        figury.add(figura1);
        figury.add(figura2);

        System.out.println("________________________________");

        for(FiguraGeometryczna figura : figury){
            figura.wypiszDane();
            figura.polePowierzchni();
        }

        FiguraGeometryczna trapez = new Trapez();
        trapez.polePowierzchni();

    }
}

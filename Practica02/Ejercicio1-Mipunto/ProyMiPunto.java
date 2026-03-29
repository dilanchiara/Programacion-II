package com.mycompany.proymipunto;
public class ProyMiPunto {
    public static void main(String[] args) {
        MiPunto p1 = new MiPunto(); // (0,0)
        MiPunto p2 = new MiPunto(10, 30.5);
        double distancia = p1.distancia(p2);
        System.out.println("Punto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Punto 2: (" + p2.getX() + ", " + p2.getY() + ")");
        System.out.println("Distancia: " + distancia);
    }
}

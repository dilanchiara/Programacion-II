package com.mycompany.proyalgebravectorial;
public class ProyAlgebraVectorial {
    public static void main(String[] args) {
        AlgebraVectorial a = new AlgebraVectorial(3, 4);
        AlgebraVectorial b = new AlgebraVectorial(4, -3);
        System.out.println("Producto punto: " + a.productoPunto(b));
        if (a.perpendicular(b)) {
            System.out.println("Son perpendiculares");
        } else {
            System.out.println("No son perpendiculares");
        }
        if (a.paralelo(b)) {
            System.out.println("Son paralelos");
        } else {
            System.out.println("No son paralelos");
        }
        AlgebraVectorial proy = a.proyeccion(b);
        System.out.println("Proyeccion de a sobre b: (" + proy.getX() + ", " + proy.getY() + ")");
        double comp = a.componente(b);
        System.out.println("Componente de a en b: " + comp);
    }
}

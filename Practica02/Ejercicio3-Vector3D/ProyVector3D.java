package com.mycompany.proyvector3d;
public class ProyVector3D {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, 0, 2);
        Vector3D suma = a.suma(b);
        System.out.println("Suma: (" + suma.getX() + ", " + suma.getY() + ", " + suma.getZ() + ")");
        Vector3D resta = a.resta(b);
        System.out.println("Resta: (" + resta.getX() + ", " + resta.getY() + ", " + resta.getZ() + ")");
        System.out.println("Producto punto: " + a.productoPunto(b));
        Vector3D cruz = a.productoCruz(b);
        System.out.println("Producto cruz: (" + cruz.getX() + ", " + cruz.getY() + ", " + cruz.getZ() + ")");
        System.out.println("Norma de a: " + a.norma());
        Vector3D proy = a.proyeccion(b);
        System.out.println("Proyección de a sobre b: (" + proy.getX() + ", " + proy.getY() + ", " + proy.getZ() + ")");
        System.out.println("Componente de a en b: " + a.componente(b));
    }
}

package com.mycompany.proyecuacionlineal;
import java.util.Scanner;
public class ProyEcuacionLineal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double e=sc.nextDouble();
        double f=sc.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);        
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX() + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion");
        }
        sc.close();
    }
}

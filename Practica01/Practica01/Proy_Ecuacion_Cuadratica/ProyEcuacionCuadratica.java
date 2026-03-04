package com.mycompany.proyecuacioncuadratica;
import java.util.Scanner;
public class ProyEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        if (discriminante > 0) {
            System.out.printf("La ecuacion tiene dos raices %.6f y %.6f",
                    ecuacion.getRaiz1(), ecuacion.getRaiz2());
        } 
        else if (discriminante == 0) {
            System.out.printf("La ecuacion tiene una raiz %.0f",
                    ecuacion.getRaiz1());
        } 
        else {
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}

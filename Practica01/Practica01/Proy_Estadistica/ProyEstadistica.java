package com.mycompany.proyestadistica;
import java.util.Scanner;
public class ProyEstadistica {
    public static double promedio(double[] datos) {
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += datos[i];
        }
        return suma / datos.length;
    }
    public static double desviacion(double[] datos) {
        double prom = promedio(datos);
        double suma = 0;
        for (int i = 0; i < datos.length; i++) {
            suma += Math.pow(datos[i] - prom, 2);
        }
        return Math.sqrt(suma / (datos.length - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < 10; i++) {
            numeros[i] = sc.nextDouble();
        }
        System.out.printf("El promedio es %.2f\n", promedio(numeros));
        System.out.printf("La desviacion estándar es %.5f",
                desviacion(numeros));
    }
}
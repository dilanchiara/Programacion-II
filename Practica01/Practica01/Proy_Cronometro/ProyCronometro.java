package com.mycompany.proycronometro;
import java.util.Random;
public class ProyCronometro {
    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random r = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = r.nextInt(100000);
        }
        Cronometro c = new Cronometro();
        c.inicia();
        seleccion(numeros);
        c.detener();
        System.out.println("Tiempo: " + c.lapsoDeTiempo() + " ms");
    }
    public static void seleccion(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}

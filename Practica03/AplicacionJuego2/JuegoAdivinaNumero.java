package com.mycompany.aplicacionjuego2;
import java.util.Scanner;
public class JuegoAdivinaNumero {
    protected int numeroSecreto;
    public JuegoAdivinaNumero() {
        numeroSecreto = (int)(Math.random() * 11); // 0 a 10
    }
    // Valida si el número está entre 0 y 10
    public boolean validaNumero(int numero) {
        return numero >= 0 && numero <= 10;
    }
    public void juega() {
        Scanner sc = new Scanner(System.in);
        int intento;
        int vidas = 3;
        while (vidas > 0) {
            System.out.print("Adivina el número (0-10): ");
            intento = sc.nextInt();
            if (!validaNumero(intento)) {
                System.out.println("Número inválido.");
                continue;
            }
            if (intento == numeroSecreto) {
                System.out.println("¡Correcto!");
                return;
            } else {
                vidas--;
                System.out.println("Incorrecto. Te quedan " + vidas + " vidas.");
            }
        }
        System.out.println("Perdiste. El número era: " + numeroSecreto);
    }
}

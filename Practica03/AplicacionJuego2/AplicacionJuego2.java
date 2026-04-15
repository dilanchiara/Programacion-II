package com.mycompany.aplicacionjuego2;
public class AplicacionJuego2 {
    public static void main(String[] args) {
        JuegoAdivinaNumero juego1 = new JuegoAdivinaNumero();
        JuegoAdivinaPar juego2 = new JuegoAdivinaPar();
        JuegoAdivinaImpar juego3 = new JuegoAdivinaImpar();

        System.out.println("=== Juego Normal ===");
        juego1.juega();

        System.out.println("\n=== Juego Par ===");
        juego2.juega();

        System.out.println("\n=== Juego Impar ===");
        juego3.juega();
    }
}

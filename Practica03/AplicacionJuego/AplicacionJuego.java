package com.mycompany.aplicacionjuego;
public class AplicacionJuego {

    public static void main(String[] args) {
        JuegoAdivinaNumero juego = new JuegoAdivinaNumero(3); // 3 vidas
        juego.juega();
    }
}

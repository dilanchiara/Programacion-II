
package com.mycompany.aplicacionjuego;

public class Juego {
    //atributos
    protected int numeroDeVidas;
    protected int record;
    //metodos
    public Juego(int vidas) {
        this.numeroDeVidas = vidas;
        this.record = 0;
    }
    public void reiniciaPartida() {
        numeroDeVidas = 3; // puedes ajustar si quieres usar otro valor inicial
    }
    public void actualizaRecord() {
        record++;
        System.out.println("¡Nuevo record! Record actual: " + record);
    }
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            return true;
        } else {
            System.out.println("Te has quedado sin vidas.");
            return false;
        }
    }
}

package com.mycompany.aplicacionjuego;
import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }
    public void juega() {
        reiniciaPartida();
        Random rand = new Random();
        numeroAAdivinar = rand.nextInt(11); // Entre 0 y 10 inclusive
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina un número entre 0 y 10:");
        while (true) {
            int intento = scanner.nextInt();
            if (intento == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                break;
            } else {
                boolean quedanVidas = quitaVida();
                if (!quedanVidas) {
                    System.out.println("No te quedan mas vidas. El numero era: " + numeroAAdivinar);
                    break;
                } else {
                    if (intento < numeroAAdivinar) {
                        System.out.println("El numero a adivinar es MAYOR.");
                    } else {
                        System.out.println("El numero a adivinar es MENOR.");
                    }
                    System.out.println("Intentalo de nuevo:");
                }
            }
        }
        scanner.close();
    }
}

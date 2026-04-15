
package com.mycompany.aplicacionjuego2;
public class JuegoAdivinaPar extends JuegoAdivinaNumero{

    
    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("Error: el número debe ser PAR.");
            return false;
        }
        return super.validaNumero(numero);
    }
}

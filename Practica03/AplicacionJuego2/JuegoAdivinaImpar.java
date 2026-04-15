
package com.mycompany.aplicacionjuego2;
public class JuegoAdivinaImpar extends JuegoAdivinaNumero{
    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Error: el número debe ser IMPAR.");
            return false;
        }
        return super.validaNumero(numero);
    }    
}

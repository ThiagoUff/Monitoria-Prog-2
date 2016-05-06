/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão3;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questão3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = teclado.nextDouble();
        if (numero >= 0 && numero <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (numero > 25 && numero <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (numero > 50 && numero <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (numero > 75 && numero <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
    }

}

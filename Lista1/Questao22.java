/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questao22;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questao22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tipo = teclado.nextInt();
        int gas = 0, alc = 0, dis = 0;
        while (tipo != 4) {
            if (tipo == 1) {
                alc++;
            }
            if (tipo == 2) {
                gas++;
            }
            if (tipo == 3) {
                dis++;
            }
            tipo = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + dis);
    }
}

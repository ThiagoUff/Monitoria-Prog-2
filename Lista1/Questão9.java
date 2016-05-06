/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão9;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int horaI, horaF, minI, minF;
        int difH, difM;
        horaI = teclado.nextInt();
        minI = teclado.nextInt();
        horaF = teclado.nextInt();
        minF = teclado.nextInt();

        if (horaI == horaF) {
            if (minI == minF) {
                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
            } else {
                difM = minF - minI;
                difH = horaF - horaI;
                System.out.println("O JOGO DUROU " + difH + " HORA(S) E " + difM + " MINUTO(S)");
            }
        } else {
            if (minF < minI) {
                difH = horaF - horaI - 1;
                difM = 60 + (minF - minI);
                System.out.println("O JOGO DUROU " + difH + " HORA(S) E " + difM + " MINUTO(S)");
            } else {
                difM = minF - minI;
                difH = horaF - horaI;
                System.out.println("O JOGO DUROU " + difH + " HORA(S) E " + difM + " MINUTO(S)");
            }

        }

    }
}

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
        int minutoInicio, minutoFim, horaInicio, horaFim;
        horaInicio=teclado.nextInt();
        minutoInicio=teclado.nextInt();
        horaFim=teclado.nextInt();
        minutoFim=teclado.nextInt();
        
        int duracaoMinutos = horaFim*60 + minutoFim - (horaInicio*60+minutoInicio);
        
        if(duracaoMinutos==0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if (duracaoMinutos>0){
            int horas=duracaoMinutos/60;
            int minutos=duracaoMinutos%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);
        }
        else{
            duracaoMinutos=duracaoMinutos+24*60; //para compensar a volta do dia
                                                 //somamos o total de minutos num dia
            int horas=duracaoMinutos/60;
            int minutos=duracaoMinutos%60;
            System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", horas, minutos);

        }

    }
}

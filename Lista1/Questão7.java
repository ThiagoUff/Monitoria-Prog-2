/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão7;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questão7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        int x, y, z;
        x = teclado.nextInt();
        y = teclado.nextInt();
        if (x < y){
            z = y;
            y = x;
            x = z;
        }
        if (x % y == 0){
            System.out.println("Sao Multiplos");
        }
        else{
            System.out.println("Nao sao Multiplos");
        }
    }
    
}

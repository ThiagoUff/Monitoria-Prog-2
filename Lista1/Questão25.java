/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão25;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] array = new int[10];

        for(int i =0;i<10;i++){
             array[i]=teclado.nextInt();
             if(array[i]<=0){
                 array[i]=1;
             }
        }
        for(int i=0;i<array.length;i++){
            System.out.println("X["+i+"] = " +array[i]);
        }

    }
}

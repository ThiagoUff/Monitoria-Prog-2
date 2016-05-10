/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package questão24;

import java.util.Scanner;

/**
 *
 * @author Monitoria
 */
public class Questão24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int n = teclado.nextInt();
       for(int i =1;i<=n;i++){
           if(n%i==0){
               System.out.println(i);
           }
       }
       
       
    }
}

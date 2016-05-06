/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questão4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Questão4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
        int qtd,pedido;
        pedido = teclado.nextInt();
        qtd = teclado.nextInt();
        double conta = 0;
        if (pedido == 1){
            conta = qtd * 4.00;
        }
        if (pedido == 2){
            conta = qtd * 4.50; 
        }
        if (pedido == 3){
            conta = qtd * 5.00;
        }
        if (pedido == 4){
            conta = qtd * 2.00;
        }
        if (pedido == 5){
            conta = qtd * 1.50;
        }
        //System.out.println("Total: R$ %.2f\n,conta);
        NumberFormat decimal = new DecimalFormat("0.00");
        System.out.println("Total: R$ "+decimal.format(conta));
       
        
    }
    
}

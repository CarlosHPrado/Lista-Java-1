/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q6;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2, soma, difer, produt;
        float coefi;
        
        System.out.println("Digite o primeiro valor: ");
        num1 = ler.nextInt();
        System.out.println("Digite o segundo valor: ");
        num2 = ler.nextInt();
        
        soma=num1+num2;
        produt=num1*num2;
        difer=num1-num2;
        coefi=num1/num2;
        
        System.out.println("Soma:" +soma);
        System.out.println("Produto: " +produt);
        System.out.println("Diferença: " +difer);
        System.out.println("Quociente: " +coefi);
    }
    
}

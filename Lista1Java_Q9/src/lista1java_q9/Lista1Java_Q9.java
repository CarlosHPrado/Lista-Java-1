/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q9;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2;
        
        System.out.println("Digite o Primeiro numero: ");
        num1=ler.nextInt();
        System.out.println("Digite o Segundo numero: ");
        num2=ler.nextInt();
        
        if (num1%num2==0){
            System.out.printf("O número %d é multipo de %d",num1,num2);
        }
        else{
            System.out.println("Estes numeros não são multiplos!"); 
        }
    }
    
}

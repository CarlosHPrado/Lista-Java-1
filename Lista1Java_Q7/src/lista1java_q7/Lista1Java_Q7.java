/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q7;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int num1, maior=0, num2=0;
        
        System.out.println("Digite 2 numeros inteiros: ");
        num1=ler.nextInt();
        num2=ler.nextInt();
        
        maior=num1;
        maior=num2;
        
        if(num1>num2){
            maior=num1;
            System.out.println(maior+" is larger.");
        } 
        else if(num2>num1){
            maior=num2;
            System.out.println(maior+" is larger");                    
            
        }
        else if(num1==num2){
            System.out.println("These numbers are equal.");
        }
    }
    
}

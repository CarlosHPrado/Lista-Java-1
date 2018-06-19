/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q8;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num1, num2,num3;
        int Nmaior=0, Nmenor=0;
        
        System.out.println("Digite o 1º numero: ");
        num1=ler.nextInt();
        System.out.println("Digite o 2º numero: ");
        num2=ler.nextInt();
        System.out.println("Digite o 2º numero: ");
        num3=ler.nextInt();
        
        int soma= num1+num2+num3;
        int produto=num1*num2*num3;
        float media= (num1+num2+num3)/3;
        
        Nmaior=num1;
        Nmenor=num1;
        
        if (num1>num2 & num1>num3 & num3>num2){
            Nmaior=num1;
            Nmenor=num2;            
        }
        else if(num2>num1 & num2>num3 & num3>num1){
            Nmaior=num2;
            Nmenor=num1;            
        }
        else if(num3>num1 & num3>num2 & num2>num1){
            Nmaior=num3;
            Nmenor=num1;            
        }
        else if(num2>num1 & num2>num3 & num1>num3){
            Nmaior=num2;
            Nmenor=num3;            
        }
        else if(num1>num2 & num1>num3 & num2>num3){
            Nmaior=num1;
            Nmenor=num3;
        }
        else if(num3>num1 & num3>num2 & num1>num2){
            Nmaior=num3;
            Nmenor=num2;        
        }
        System.out.printf("Soma:\t%d\n Produto:\t%d\n Média:\t%.0f\n",soma,produto,media);
        System.out.printf("Número Maior:\t%d\n Número Menor:\t%d\n",Nmaior,Nmenor);
    }
    
}
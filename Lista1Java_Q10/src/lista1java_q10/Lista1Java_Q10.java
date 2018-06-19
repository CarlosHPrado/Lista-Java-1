/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q10;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float raio, diam,circunf,area; 
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o raio do Círculo");
        raio=ler.nextFloat();
        
        diam=2*raio;
        circunf=(float) (2*(Math.PI)*raio);
        area= (float) Math.pow(Math.PI,2);
        
        System.out.printf("A area do Círculo é: %.2f\n",area);
        System.out.printf("A circuferência é: %.2f\n",circunf);
        System.out.printf("O diâmetro do círculo é: %.2f\n",diam);
    }
    
}

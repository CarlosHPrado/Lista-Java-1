/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1java_q3;

import java.util.Scanner;

/**
 *
 * @author cliente
 */
public class Lista1Java_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final Scanner ler = new Scanner(System.in);
		
                System.out.println("Digite um numero com mais de 4 Digitos");
		final Integer a = ler.nextInt();
		final String b = a.toString();
		String c = "";
		for (int i = b.length(); i > 0; i--) {
			c += b.substring(i - 1, i);
		}
		System.out.println("Este é o numero invertido:" + c);
        // TODO code application logic here
    }
    
}

/*
 */
package lista1java_q2;
import java.util.Scanner;
/**
 *
 * @author cliente
 */
public class Lista1Java_Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double tempo, velocidade=20.0, distancia, calculo=0;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite a distancia pecorrida (Km/h), parta calcular o tempo: ");
        distancia=ler.nextDouble();
        
        tempo = distancia/velocidade;
        System.out.println("O tempo pecorrida pela onda na distancia de "+distancia);
        System.out.println("é de: "+tempo+"m/s");
    }
    
}

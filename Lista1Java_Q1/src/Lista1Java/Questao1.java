
package Lista1Java;
import java.util.Scanner;
/**
 *
 * @author Carlos Henrique Prado
 */
public class Questao1 {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int Meses,cont,ano,taxa;
        float aluguel,total=0;
        
        System.out.println("Digite a quantidade de meses a ser feito o contrato do aluguel: ");
        Meses = ler.nextInt();
        System.out.println("Digite o valor do aluguel mensal: ");
        aluguel = ler.nextFloat();
        System.out.println("Digite a taxa anual de aumento (%): ");
        taxa = ler.nextInt();
        
        for (cont=1; cont>=Meses; cont++){
                         
             for(ano=1; ano>=Meses; ano=ano+11){
                 aluguel=(aluguel * taxa)/100;
                           
            }
         total=aluguel+aluguel;  
            
        }
            System.out.println("O valor total do aluguel a ser pago durante este período é: " +total);
        
    }
    
}

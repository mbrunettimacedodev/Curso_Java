/* trim() -> retira espaços em brancos no ínicio e fim da frase 
 * split("\\s+") -> Divide uma String em partes menores com base em espaços em branco (um ou mais). 
 * \\s -> representa qualquer espaço em branco (espaço, tab, quebra de linha…) + significa “um ou mais”
 * Quando utilizamos o .length em string, conta letras.
 * Quando utilizamos o .length dentro de um array, ele conta palavras.
*/

import java.util.Scanner;

public class ContadorDePalavras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String continuar = "Sim";

        while (continuar.equalsIgnoreCase("Sim")) { 
            
            contarPalavras();

            System.out.println("Deseja continuar? (Sim/Nao)");

            continuar = scanner.nextLine();
        }

        System.out.println("Sistema encerrado.");

        scanner.close();
        
     
    }

    public static void contarPalavras(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();

        String [] palavras = frase.trim().split("\\s+");

        int numeroPalavras = palavras.length;

        System.out.println("O número de palavras digitado foi: " + numeroPalavras);

       
        

        
    }
        
     
    

    
}



import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma frase: ");
    String frase = scanner.nextLine();

    String [] fraseLida = frase.trim().split("\\s+");

    int contarPalavras = fraseLida.length;

    System.out.println("O número de palavras na frase é: " + contarPalavras);
    
    
    }

     }
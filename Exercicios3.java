import java.util.Scanner;
public class Exercicios3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

    // Exercício 1:

    int somatorio = 0;

    for(int num = 0; num <= 100; num++){

        somatorio += num;

    }

    System.out.println("Soma de 1 a 100: " + somatorio);

    // Exercício 2:

    int numero = 1;

    while(numero <= 20){
        
        if(numero % 2 == 0){
            System.out.println("Número par: " + numero);
        }
        numero++;
    }


    // Exercício 3:

    int numPrimo = 10;

    boolean ePrimo = true;

    // Testar se ele é primo mesmo
    for(int i = 2; i < numPrimo; i++){

        // dividir esse cara e não ter resto, ele não é primo
        // divir por 1 e ele mesmo, ele é primo.
        if(numPrimo % i == 0){
            ePrimo = false;
            break;
        }
    }

    if(ePrimo) {
        System.out.println("O número " + numPrimo + " é primo!");
    } else {
        System.out.println("O número " + numPrimo + " não é primo!");
    }

    
    // Exercício 5:

    int numFatorial = 5;
    int fatorial = 1;

    for(int i = 1; i <= numFatorial; i++){

        fatorial *= i;
    }

    System.out.println("O fatorial de " + numFatorial + " é igual a: " + fatorial);

    // Exercício 6:

    int numeroParaContar = 1000;
    int contador = 0;

    while (numeroParaContar != 0) { 
        
        numeroParaContar = numeroParaContar/10;

        contador++;
    }

    System.out.println("Número de dígitos: " + contador);
    
    

}
}        
        
    


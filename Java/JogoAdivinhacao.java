import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        
        // Invocando Scanner 
        Scanner scanner = new Scanner(System.in);

        // Invocando número aleatório
        Random random = new Random();

        // Número aleatório
        int numeroAleatorio = random.nextInt(100) + 1;

        // Palpite
        int numeroEscolhido = 0;
        
        // Número de tentativas
        int tentativas = 0;

        while(numeroEscolhido != numeroAleatorio){

            System.out.println("Digite o seu palpite: ");
            numeroEscolhido = scanner.nextInt();

            tentativas++;

           if(numeroEscolhido > numeroAleatorio){
            
            System.out.println("O número " + numeroEscolhido + " é maior que o número aleatório!");

           } else if(numeroEscolhido < numeroAleatorio){
            
            System.out.println("O número " + numeroEscolhido + " é menor que o número aleatório!");

           } else {
            
            System.out.println("Parabéns, você venceu o jogo! Foram realizadas " + tentativas + " tentativas!");

           }
        }

        scanner.close();
        

        



        
    }
}

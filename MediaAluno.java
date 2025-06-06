
import java.util.Scanner;


public class MediaAluno {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o nome do aluno...");
        String nome = scan.nextLine();

        System.out.println(nome + ", por favor digite sua primeira nota..." + "\n"); // o \n serve para pular uma linha.
        double nota1 = scan.nextDouble();
        
        System.out.println(nome + ", por favor digite sua segunda nota...");
        double nota2 = scan.nextDouble();
        
        System.out.println(nome + ", por favor digite sua terceira nota...");
        double nota3 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média atual é de: " + media);

        if(media >= 7.0){

            System.out.println("Parabéns, você foi aprovado!!!");
        } else{

            System.out.println("Infelizmente, você foi reprovado...");

        }
    }
}

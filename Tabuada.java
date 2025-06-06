import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para saber sua tabuada: ");
        int numeroTabuada = scanner.nextInt();
        System.out.println("O número escolhido foi " + numeroTabuada);

        System.out.println(numeroTabuada + " X 1 = " + (numeroTabuada*1));
        System.out.println(numeroTabuada + " X 2 = " + (numeroTabuada*2));
        System.out.println(numeroTabuada + " X 3 = " + (numeroTabuada*3));
        System.out.println(numeroTabuada + " X 4 = " + (numeroTabuada*4));
        System.out.println(numeroTabuada + " X 5 = " + (numeroTabuada*5));
        System.out.println(numeroTabuada + " X 6 = " + (numeroTabuada*6));
        System.out.println(numeroTabuada + " X 7 = " + (numeroTabuada*7));
        System.out.println(numeroTabuada + " X 8 = " + (numeroTabuada*8));
        System.out.println(numeroTabuada + " X 9 = " + (numeroTabuada*9));
        System.out.println(numeroTabuada + " X 10 = " + (numeroTabuada*10));

        scanner.close();
    }
}

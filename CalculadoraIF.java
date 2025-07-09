import java.util.Scanner;

public class CalculadoraIF{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Escolha o tipo de operação que deseja realizar:");
        System.out.println("1) Adição");
        System.out.println("2) Subtração");
        System.out.println("3) Multiplicação");
        System.out.println("4) Divisão");
        
        int escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.println("Você escolheu adição! Insira o primeiro número");
            double num1 = scanner.nextDouble();
            System.out.println("Insira o segundo número");
            double num2 = scanner.nextDouble();
            System.out.println("O resultado foi: " + adicao(num1,num2));
        } else if(escolha == 2){
            System.out.println("Você escolheu subtração! Insira o primeiro número");
            double num1 = scanner.nextDouble();
            System.out.println("Insira o segundo número");
            double num2 = scanner.nextDouble();
            System.out.println("O resultado foi: " + subtracao(num1,num2));
        } else if(escolha == 3){
            System.out.println("Você escolheu multiplicação! Insira o primeiro número");
            double num1 = scanner.nextDouble();
            System.out.println("Insira o segundo número");
            double num2 = scanner.nextDouble();
            System.out.println("O resultado foi: " + multiplicacao(num1,num2));
        } else if(escolha == 4){
            System.out.println("Você escolheu divisão! Insira o primeiro número");
            double num1 = scanner.nextDouble();
            System.out.println("Insira o segundo número");
            double num2 = scanner.nextDouble();
            System.out.println("O resultado foi: " + divisao(num1,num2));
        } else{
            System.out.println("Você não escolheu uma opção válida");
        }

        scanner.close();

    }

    public static double adicao(double num1, double num2){

        return num1 + num2;
    }

    public static double subtracao(double num1, double num2){

        return num1 - num2;
    }

    public static double multiplicacao(double num1, double num2){

        return num1 * num2;
    }

    public static double divisao(double num1, double num2){
        
        return num1 / num2;
    }
}
import java.util.Scanner;

public class CalculadoraSwitch {
    public static void main(String[] args) {
        String continuar = "Sim";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Escolha o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha o tipo de operação que deseja realizar:");
        System.out.println("1) Adição (+)");
        System.out.println("2) Subtração (-)");
        System.out.println("3) Multiplicação (*)");
        System.out.println("4) Divisão (/)");
        
        int escolha = scanner.nextInt();
        

        
        
    switch(escolha){
        case 1:
         System.out.println("O resultado da adição ficou " + adicao(num1, num2));
        break;

        case 2: 
         System.out.println("O resultado da subtração ficou " + subtracao(num1, num2));
        break;

        case 3:
         System.out.println("O resultado da multiplicação ficou " + multiplicacao(num1, num2));
        break;

        case 4:
        if(num2 != 0){
         System.out.println("O resultado da divisão ficou " + divisao(num1, num2));
        break;
        } else{
        System.out.println("Divisão por 0 não permitida!");
        return;
        }
         

        default:
         System.out.println("Opção Inválida!");
        return;
    }

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


import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura em metros: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);
        System.out.println("Seu IMC é: " + IMC);

        if(IMC < 18.5){
            System.out.println("Abaixo do peso");
        } else if (IMC >= 18.5 && IMC <= 24.90) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC < 29.90){
            System.out.println("Sobrepeso");
        } else{
            System.out.println("Obesidade");
        }


    }
}

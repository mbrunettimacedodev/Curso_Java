import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite uma das opções de conversão abaixo: ");
        System.out.println("1: Celsius para Farenheit");
        System.out.println("2: Farenheit para Celsius");

        int resposta = scanner.nextInt();

        

        if(resposta == 1 ){
            celsiusParaFarenheit();
        } else if(resposta == 2){
            farenheitParaCelsius();
        } else{
            System.out.println("Opção inválida!");
        }

        scanner.close();
        
    }

public static void celsiusParaFarenheit(){
    
    System.out.println("Informe a temperatura em Celsius: ");
    
    Scanner scanner = new Scanner(System.in);

    double celsius = scanner.nextDouble();
    
    scanner.close();

    double farenheit = (celsius * 9/5) + 32;

    System.out.println(celsius + "C" + " convertido em farenheit fica: " + farenheit + "F");

}

public static void farenheitParaCelsius(){
    
    System.out.println("Informe a temperatura em Farenheit: ");
    
    Scanner scanner = new Scanner(System.in);

    double farenheit = scanner.nextDouble();

    scanner.close();

    double celsius = (farenheit - 32) * 5/9;

    System.out.println(farenheit + "F" + " convertido em Celsius fica: " + celsius + "C");
}

}

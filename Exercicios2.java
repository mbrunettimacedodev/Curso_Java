public class Exercicios2 {
    public static void main(String[] args) {

        // Exercício 1:

        double celsius = 25;
        double farenheit = converterTemperatura(celsius);
        System.out.println("a temperatura em celsius é " + celsius + "° e convertendo em farenheit ela fica " + farenheit + "°");
        
    }

    // Exercício 1 (Função):
    
    public static double converterTemperatura(double celsius) {
        return (celsius * 9) /5 + 32;
    }
}
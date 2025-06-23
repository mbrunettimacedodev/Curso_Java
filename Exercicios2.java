public class Exercicios2 {
    public static void main(String[] args) {

        // Exercício 1:

        double celsius = 25;
        double farenheit = converterTemperatura(celsius);
        System.out.println("a temperatura em celsius é " + celsius + "C e convertendo em farenheit ela fica " + farenheit + "F");
        
        // Exercício 2:

        int numeroFatorial = 10;
        System.out.println("O resultado do fatorial de " + numeroFatorial + " é " + calcularFatorial(numeroFatorial));
        System.out.println(calcularFatorial(5));

        // Exercício 3:

        numeroParOuImpar(2);
        numeroParOuImpar(5);

        // Exercício 4:
        
        System.out.println(classificarNota(10));
        System.out.println(classificarNota(9));
        System.out.println(classificarNota(8));
        System.out.println(classificarNota(7));
        System.out.println(classificarNota(6));
        System.out.println(classificarNota(11));
        System.out.println(classificarNota(5));


    }

    // Exercício 1 (Função):
    
    public static double converterTemperatura(double celsius) {
        return (celsius * 9) /5 + 32;
    }

    // Exercício 2 (Função):

    public static int calcularFatorial(int numero){

        if(numero == 0 || numero == 1){
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    // Exercício 3 (Função):

    public static void numeroParOuImpar(int numeroAleatorio){

        if(numeroAleatorio % 2 == 0){
            System.out.println("O número escolhido é par");
        } else {
            System.out.println("O número escolhido é ímpar");
        }
    }

    // Exercício 4 (Função):

    public static String classificarNota(int nota){

        if(nota < 0 || nota > 10 ){
            return "Nota inválida";
        }

        switch(nota){
            case 10:
            case 9:
                return "A";
           

            case 8:
                return "B";
            

            case 7:
                return "C";
            

            case 6:
                return "D";
           
            
            default:
                return "F";
            
        }
        
    }
}
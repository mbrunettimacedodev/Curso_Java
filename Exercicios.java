public class Exercicios {
    public static void main(String[] args){

        //Exercicio 1:
        int numero = 10;
        int numeroDobro = numero*2;
        System.out.println(numeroDobro);

        //Exercicio 2:
        char letra = 'B';
        int letraAcima = (int) letra;
        System.out.println(letraAcima);

        //Exercicio 3:
        double valor1 = 15.75D;
        double valor2 = 20.40D;
        double valorSomado = valor1 + valor2;
        System.out.println(valorSomado);

        //Exercicio 4:
        long numeroBilhao = 2_000_000_000L;
        int numeroBilhaoCasting = (int) numeroBilhao;
        System.out.println(numeroBilhaoCasting);

        //Exercicio 5:
        String bomDia = "Olá mundo,";
        String java = "bem vindo ao Java!";
        System.out.println(bomDia + " " + java);
    }
}

// Array => subs. a classe Array

public class Listas {

    public static void main(String[] args) {
        
        // 1 - Sintaxe

        int [] numeros = {1,2,3,4,5,6,7,8};

        // {ELEM1,ELEM2,ELEM3,...}

        System.out.println("Acessa o primeiro elemento: " + numeros[0]);

        // Tamanho fixo, só que vazio

        String[] frutas = new String[3];

        // 0, 1 e 2 => add elementos
        // 3 => não tenho

        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";
        // frutas[3] = "Teste";

        System.out.println(frutas[0]);
        System.out.println(frutas[1]);
        System.out.println(frutas[2]);
        // System.out.println(frutas[3]);

        double [] precos = {1.99, 2.45, 4.97};

        precos[2] = 5;

        System.out.println(precos[2]);

        // precos[5] = 1;

        // System.out.println(precos[5]);

        // precos[2] = "5";
        // System.out.println(precos[2]);

        // 2 - Loops em Arrays

        // Somar todos os elementos de um Array
        // Acessar os elementos e condensar a soma deles em uma var.

        int soma = 0;

        // length => a quantidade de elementos de um array

        for(int i = 0; i < numeros.length; i++){

        // i > 0; i > 1; i > 2;...
        // numeros[i] = numeros[0] => 1 
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);

        // for each
        // Nomear o item => Array
        // Pessoas => Fruta

        for(String fruta:frutas){
            System.out.println("A fruta da vez: " + fruta);
        }

        // Encontrar o maior valor de um array

        int[] valores = {10,25,8,22,1};

        int maiorValor = valores[0];

        int j = 0;
        
        while(j < valores.length ){
            if(valores [j] > maiorValor){
                maiorValor = valores[j];
            }

            j++;
        }

        System.out.println("O maior valor é: " + maiorValor);

        // 3 - for each

        for(int numero : numeros){
            System.out.println("O número é " + numero);
        }

        // Concacetenar elementos de um array

        String [] palavras = {"Java", "é", "Bom"};

        String frase = "";

        for(String palavra : palavras){
            frase += palavra + " ";
        }

        System.out.println(frase);

        // Verificar se valor está presente em array

        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for(char letra : letras){
            if(letra == letraProcurada){
            System.out.println("Encontramos a letra " + letra);
            break;
        } }
        


}
    
}

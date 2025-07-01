public class Loops {
    public static void main(String[] args) {
        
        // 1 - for

        // Loop que vai rodar de 1 a 5

        // Definir variável de inicialização = i, j, k...
        // Condição -> Determina até quando ou quantas vezes o loop vai rodar
        // incremento -> A variável vai chegar na condição
        
        for (int i = 1; i <= 5; i++) {
            //repetir
            System.out.println("Contador: " + i);
        }

        // Mostrar cada caractere de uma String

        String palavra = "Java";

        for(int i = 0; i < palavra.length(); i++){
            
            // palavra.charAt(0) => palavra.charAt(1) ...
            // Letra(0): J, Letra(1): A, Letra(2): V, Letra(3): A
            System.out.println("Caractere: " + palavra.charAt(i));
        }
        

        //Contagem regressiva
        
        for(int i = 5; i > 0; i-- ){

            System.out.println("Contagem regressiva: " + i);
        }

        // 2 - While

        int i = 0;

        while (i <= 5) { 
            
            System.out.println("While contador: " + i);

            i++;
        }

        int valor = 0;

        while(valor != 7){

            // .111 => 1
            valor = (int) (Math.random()*10);

            System.out.println("Valor aleatório: " + valor);

        }

        // 3 - Loop infinito (comentei pra nao travar)

    // while(true) {
    //     System.out.println("Infinito!");
    // }

    // for(int j = 0; j <= 5; j--){
    // System.out.println(j);
    //  }

    }
}

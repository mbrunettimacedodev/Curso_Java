public class LoopsB {
    public static void main(String[] args) {
        
        // Loops com rótulos

        // Rótulos externos e internos

        externo:
        for(int i = 0; i < 3; i ++){

            for(int j = 0; j < 3; j ++){
                
                if( i == 1 && j == 1){
                    break externo;
                }

                System.out.println("i " + i + " j " + j);
            }
        }

                
        for(int i = 0; i < 5; i ++){

        System.out.println("Externo " + i);

            interno: 

            for(int j = 0; j < 5; j ++){
                
                if(j == 2){
                    System.out.println("Parou interno");
                    break interno;
                }

                System.out.println("i " + i + " j " + j);
            }
        }

        // 9 - off by one

        // [1, 2, 3, 4]

        // 4 vezes

        // 5 -> Acessar um elemento inválido

        // Associar o loop a quantidade de elementos

        // Executar 5 vezes
        
        for(int i = 0; i <= 5; i++){
            System.out.println("I: " + i);
        }
    }
}

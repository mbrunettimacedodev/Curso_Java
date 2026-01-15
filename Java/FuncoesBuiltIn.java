public class FuncoesBuiltIn {
    public static void main(String[] args) {
        
        // 10 - Funções built in de string
        String frase = "Java é muito bom";

        // Length
        System.out.println(frase.length());

        // int => Inteiro
        // String => S => letra maiúscula inicial =>

        System.out.println(frase.substring(0,4));

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("a","e"));

        String fraseModificada = frase.toUpperCase();

        System.out.println(fraseModificada);
        
        System.out.println(fraseModificada.toLowerCase());

        // 11 - Funções de Math

        System.out.println(Math.sqrt(26)); // sqrt => Raiz quadrada
        System.out.println(Math.sqrt(9));

        System.out.println(Math.pow(2,3)); // pow => 2³ => Número elevado

        System.out.println(Math.abs(10)); // Número absoluto (volta sempre positivo)
        System.out.println(Math.abs(-10));

        System.out.println(Math.max(100,10)); // max => Maior entre 2 números

        double raizQuadrada = Math.sqrt(99);

        System.out.println("A raiz quadrada de 99 é: " + raizQuadrada );



    }
}

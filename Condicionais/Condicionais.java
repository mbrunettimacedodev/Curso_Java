public class Condicionais {
    public static void main(String[] args){
        // 4 - Comparação de Strings

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 == str2);
        System.out.println(str1 == "Java");

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));  
        System.out.println(str1.equals("Java"));
        
        // Java == JAVA (false) > java == java (ele le dessa forma tornando true)
        System.out.println(str1.equalsIgnoreCase(str2));

        // 5 - if
        int numero = 10;

        // Baseado em uma comparação, eu executo algo
        
        if (numero > 125) {
            
            System.out.println("O número é maior que 5");
        }

        // if com Strings
        String texto = "Teste";

        // Se a função retorna um booleano, eu posso usar no if
        
        if(texto.equals("Teste")){

            System.out.println("O texto é teste");
        
        }

        // Declaração do if (comparaç´~ao ou retorno de booleano) {o que será executado...}



        // 6 - else
        int q = 7;

        if(q > 10) {
            System.out.println("Q é maior que 10");
        } else {
            System.out.println("Insira um número maior que 10");
        }

        // Todo else precisa de um if, mas nem todo if precisa TER um else

        if(texto.equals("Teste2")){

            System.out.println("O texto é teste");
        
        } else {
            System.out.println("O texto não é igual!");
        }

        // 7 -  else if
        double nota = 10;
        if (nota == 10) {
            System.out.println("Você tirou a nota máxima!");
        }else if(nota >= 9){
            System.out.println("Muito boa!");
        } else if(nota >= 7) {
        System.out.println("Acima de média!");
        } else {
            System.out.println("Abaixo da média :( ");
        }

        int num = 5;
        
        if(num > 3 && num < 5){ // Ele vai parar na primeira que constar como verdadeira, por isso ele para no > 3.
            System.out.println("Alguma coisa");
        } else if (num == 5){
            System.out.println("Outra coisa aqui!");
        }

        // 1 - Vou escolher qual a situação que eu quero que mais ocorra
        // 2 - Melhorar a lógica (Coloco o &&) para deixar a comparação mais específica

        
    }
}

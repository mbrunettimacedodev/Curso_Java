public class Funções {

    public static void main(String[] args) {
        

        // 1 - Criando a primeira função
        // Tanto funções como variáveis, a gente nomeia

        saudacao(); // Invoquei a função

        // 2 - parâmetros

        soma(2,4);
        soma(10,10);

        saudar("Matheus");

        // 3 - return

        dobrar(5);

        int numero = 10;

        int numeroDobrado = dobrar(numero);

        System.out.println("O numero dobrado é: " + numeroDobrado);

        System.out.println(dobrar(15));

      
        // 4 - retorno em variável

        String r1 = verificarPar(numero);

        String r2 = verificarPar(3);

        System.out.println(r1);
        
        System.out.println(r2);

        int x = dobrar(soma2(2,4)); 

        System.out.println(x);


    }


    // NIVEL DE ACESSO (public), STATIC (static) => não preciso instanciar classe para executar, TIPO RETORNO (void - vazio)
    //NOME, OS PARANTESES (ARGS), BLOCO{}
        
    public static void saudacao() {

        System.out.println("Olá, esta é a minha primeira função!");
    }

    
    public static void soma(int a, int b){
        int resultado = a + b;
        System.out.println("O resultado da soma é: "+ resultado);
    }


    public static void saudar(String nome){
        
        System.out.println("Olá, " + nome + ", tudo bem?");
    }

    // Parâmetros de funções diferentes, podem ter o mesmo nome.

    public static int dobrar(int n){
        return n * 2;
    }

    public static String verificarPar(int n){
        if(n % 2 == 0) {
            return "O número " + n + " é par";
        } else {
            return "O número " + n + " é ímpar";
        }

        
    } 


    public static int soma2(int a, int b){
            return a + b;
        }
}

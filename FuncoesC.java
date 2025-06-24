import java.util.Arrays;
import java.util.List;

public class FuncoesC {
    public static void main(String[] args) {
        
        // 12 - Função recursiva
        
        System.out.println(somaRecursiva(10));

        // 13 - Method Overloading

        System.out.println(soma(2,3));
        System.out.println(soma(2,3,5));
        System.out.println(soma(2.5,5.6));

        // 14 - Funções anônimas

        Runnable tarefa = () -> System.out.println("Minha função anônima!");
        tarefa.run();

        // (arg1, arg2) -> {}

        List<String> nomes = Arrays.asList("Matheus", "Rodrigo", "Fernanda");

        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecursiva(int n){
        if(n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }


    // 13 - Method Overloading:

    public static int soma (int a, int b){
        return a + b;
    }

     public static int soma (int a, int b, int c){
        return a + b + c;
    }

     public static double soma (double a, double b){
        return a + b;
    }
}

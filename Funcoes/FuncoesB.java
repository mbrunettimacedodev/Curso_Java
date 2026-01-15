public class FuncoesB {
     static int globalVar = 20;

    public static void main(String[] args) {
        // Escopo Global: 
      
        escopoLocal(globalVar);

        // 5 - funções com condicionais
        String r1 = verificarAcesso(19, true, false);
        System.out.println(r1);

        // 6 - Funções com switch
        System.out.println(obterDiaDaSemana(5));
        System.out.println(obterDiaDaSemana(15));

        // 7 - System exit
        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi");

        // 8 - Documentação Função
        System.out.println(calcularMedia(6,5,8));

        // 9 - Escopos

        // Escopo local:
        int localVar = 10;

        if(true){
            System.out.println(localVar);
        }

        System.out.println(globalVar);
        
        escopoLocal(localVar);

        int testeFnEscopo = escopoLocal(localVar);

        System.out.println(testeFnEscopo);

        // { } geralmente delimitam um escopo, cria um escopo.

    }

    public static String verificarAcesso(int idade, boolean temCarteira, boolean temHistoricoNegativo){
        if(idade >= 18 && temCarteira && !temHistoricoNegativo){
            return "Acesso permitido: Todos os critérios foram atendidos";
        } else if(idade >= 18 && temCarteira && temHistoricoNegativo){
            return "Acesso negado: Critérios não atendidos 1";
        } else {
            return "Acesso negado: Critérios não atendidos 2";
        }
    }

    
    public static String obterDiaDaSemana(int dia) {
        switch(dia) {
            case 1:
            return "Segunda-Feira";
            case 2:
            return "Terça-Feira";
            case 3:
            return "Quarta-Feira";
            case 4:
            return "Quinta-Feira";
            case 5:
            return "Sexta-Feira";
            case 6:
            return "Sábado";
            case 7:
            return "Domingo";
            
            default:
            return "Dia inválido";
        }
    }

    public static void verificarAutenticacao(String usuario, String senha){

        if(!usuario.equals("admin") || !senha.equals("SenhaSegura")){
            System.out.println("Autenticação Falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
    }

/**
 * 
 * Calcula a média de três números inteiros:
 * @param n1 O primeiro número/nota a ser enviado
 * @param n2 O segundo número/nota a ser enviado
 * @param n3 O terceiro número/nota a ser enviado
 * @return A média dos três números
 * 
 */

 public static double calcularMedia(int n1, int n2, int n3) {
    return (n1 + n2 + n3) / 3;

}

public static int escopoLocal(int a){
    System.out.println(globalVar);
    System.out.println(a);

    int testeFuncao = 1;

    return testeFuncao;
}

}

public class FuncoesB {
    
    public static void main(String[] args) {
        

        // 5 - funções com condicionais
        String r1 = verificarAcesso(19, true, false);
        System.out.println(r1);

        // 6 - Funções com switch
        System.out.println(obterDiaDaSemana(5));
        System.out.println(obterDiaDaSemana(15));

        // 7 - System exit
        verificarAutenticacao("admin", "SenhaSegura");

        System.out.println("Oi");
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

        if(!usuario.equals("admin") && !senha.equals("SenhaSegura")){
            System.out.println("Autenticação Falhou!");
            System.exit(1);
        }

        System.out.println("Autenticação bem sucedida!");
    }
}

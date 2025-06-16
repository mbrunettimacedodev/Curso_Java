public class FuncoesB {
    
    public static void main(String[] args) {
        

        // 5 - funções com condicionais
        String r1 = verificarAcesso(19, true, false);
        System.out.println(r1);
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
}

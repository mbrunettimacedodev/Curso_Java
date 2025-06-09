public class Switch {
    public static void main(String[] args) {
        
        // 11 - switch case e break

        // para validar dia de semana baseado no número
        // 1 = Domingo
        // 7 = Sábado
        int diaDaSemana = 6;
        switch(diaDaSemana) {
        
        case 1:
            System.out.println("Domingo");
            break;
        case 2:
            System.out.println("Segunda-Feira");
            break;
        case 3:
            System.out.println("Terça-Feira");
            break;
        case 4:
            System.out.println("Quarta-Feira");
            break;
        case 5:
            System.out.println("Quinta-Feira");
            break;
        case 6:
            System.out.println("Sexta-Feira");
            break;
        case 7:
            System.out.println("Sábado");
            break;
        }

        // 12 - Default

        // default é o else do switch

        int n = 20;
        
        switch(n){
        case 1:
            System.out.println("É 1");
            break;

        case 2:
            System.out.println("É 2");
            break;

        default:
            System.out.println("Número não encontrado");
            break;
        }
        
    }
}

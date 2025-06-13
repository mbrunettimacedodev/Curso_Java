import java.util.Scanner;
public class ClassificacaoProduto{

    public static void main(String[] args){
        
    Scanner scanner = new Scanner(System.in);

        String produto1 = "Mouse";
        String produto2 = "Teclado";
        String produto3 = "MousePad";
        double preco = 0;

        System.out.println("Insira o nome do produto: ");
        String produto = scanner.nextLine();

        if(produto.equalsIgnoreCase(produto1) || 
           produto.equalsIgnoreCase(produto2) || 
           produto.equalsIgnoreCase(produto3)){

        System.out.println("O produto está catalagodado! Gostaria de adicionar um preço? (Sim/Nao)");
        String resposta = scanner.nextLine();
        
        if(resposta.equalsIgnoreCase("Sim")){
            
            
        System.out.println("Insira o valor: ");
        preco = scanner.nextDouble();
        }
        
        else if(resposta.equalsIgnoreCase("Nao")){
            System.out.println("Tudo bem! Insira o valor novo ou confirme que irá ficar grátis digitando 0: ");
            preco = scanner.nextDouble();
        }
    
        } else{
            System.out.println("Coloque um valor por favor: ");
            preco = scanner.nextDouble();
        }
    scanner.close();
         
        
    
    
        if(preco >= 0.01 && preco < 50){
            System.out.println("Classificação: Barato");
        } else if(preco >= 50 && preco <=100) {
            System.out.println("Classificação: Moderado");
        } else if(preco > 100) {
            System.out.println("Classificação: Caro");
        } else{
            System.out.println("Classificação: Grátis");
        }

        System.out.println("O produto escolhido foi " + produto +" e seu preço é: " + preco);

    }
    
}
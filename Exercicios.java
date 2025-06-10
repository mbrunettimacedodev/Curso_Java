import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args){

        //Exercicio 1:
        int numero = 10;
        int numeroDobro = numero*2;
        System.out.println(numeroDobro);

        //Exercicio 2:
        char letra = 'B';
        int letraAcima = (int) letra;
        System.out.println(letraAcima);

        //Exercicio 3:
        double valor1 = 15.75D;
        double valor2 = 20.40D;
        double valorSomado = valor1 + valor2;
        System.out.println(valorSomado);

        //Exercicio 4:
        long numeroBilhao = 2_000_000_000L;
        int numeroBilhaoCasting = (int) numeroBilhao;
        System.out.println(numeroBilhaoCasting);

        //Exercicio 5:
        String bomDia = "Olá mundo,";
        String java = "bem vindo ao Java!";
        System.out.println(bomDia + " " + java);

        // Exercicio 1 (Condicionais)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double precoProduto = scanner.nextDouble();

        if(precoProduto < 50){
            System.out.println("Categoria: Barato");
        }  else if (precoProduto >= 50 && precoProduto <= 100){
            System.out.println("Categoria: Médio");
        } else{
            System.out.println("Categoria: Caro");
            
            
        }


        // Exercicio 2 (Condicionais)

        System.out.println("Insira o nome de usuário: ");
        String usuario = scanner.next();

        System.out.println("Insira a senha de usuário: ");
        String senha = scanner.next();

        // 12 / 2 = 6 -> Resto 0 (Par)
        // 13 / 2 = 6 -> Resto 1 (Ímpar)

        if(usuario.equals("admin") && senha.equals("123")){
            System.out.println("Acesso permitido");
        } else{
            System.out.println("Acesso negado");
            
        }


        // Exercicio 3 (Condicionais)

        System.out.println("Insira um número para saber se é par ou ímpar: ");
        int numeroParOuImpar = scanner.nextInt();

        String resultado = "";

        if(numeroParOuImpar % 2 == 0){
            resultado = "É par";
        } else {
            resultado = "É ímpar";
        }

        System.out.println("O número escolhido foi: " + numeroParOuImpar + ". Este número: " + resultado);


        // Exercicio 4 (Condicionais)

        System.out.println("Insira um número entre 1 a 7 (Referente aos dias da semana)");
        int numeroEscolhido = scanner.nextInt();

        switch (numeroEscolhido) {
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
            default:
            System.out.println("Você não inseriu um número válido");
}

        // Também pode ser feito dessa forma

        // Exercicio 4 (Condicionais) 

                switch(numeroEscolhido){
                    case 1:
                    case 7:
                System.out.println("Final de semana");
                    break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                System.out.println("Dia de semana");
                    break;
            
                }

        
        // Exercicio 5 (Condicionais)

        System.out.println("Insira um número");
        int numeroIntervalo = scanner.nextInt();

        if(numeroIntervalo >= 10 && numeroIntervalo <= 20){
            System.out.println("Parabéns, você está dentro do intervalo");
        } else{
            System.out.println("Infelizmente, você está fora do intervalo");
        }


        // Exercicio 6 (Condicionais)

        System.out.println("Favor digitar uma letra");
        
        // equalsIgnoreCase OU toLowerCase
        char letraEscolhida = scanner.next().toLowerCase().charAt(0);

        switch (letraEscolhida){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
        System.out.println("A letra escolhida foi a vogal: " + letraEscolhida);
        break;

        default:
        System.out.println("Você escolheu a consoante: " + letraEscolhida);
        break;

        }

                scanner.close();
        
        

        
    }
}

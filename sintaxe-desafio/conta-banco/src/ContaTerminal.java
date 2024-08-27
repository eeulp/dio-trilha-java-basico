import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        // Declaração de variáveis
        int numeroConta;
        String numeroAgencia;
        String nomeCliente;
        Double saldo;

        //Tela de Boas-Vindas
        System.out.println("---------- BANCO DIO ----------");
        System.out.println("Seja bem-vindo ao Banco Dio! Para abrir sua conta, digite os dados solicitados!");
        
        // Entrada de Dados
        System.out.println("Digite o número da conta!");
        numeroConta = ler.nextInt();
        ler.nextLine();

        System.out.println("Digite o número da agência!");
        numeroAgencia = ler.nextLine();

        System.out.println("Agora digite seu nome completo!");
        nomeCliente = ler.nextLine();

        System.out.println("Insira o valor que você deseja depositar!");
        saldo = ler.nextDouble();

        // Impressão de Dados
        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+numeroAgencia+", conta "+numeroConta+" e seu saldo R$ "+saldo+" já está disponível para saque.");

    }
}
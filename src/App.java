import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int opcaoSelecionada = 0;

        try (Scanner leitor = new Scanner(System.in)) {
            System.out.print("Digite seu nome: ");
            String nomeCliente = leitor.next();

            // Criando o objeto conta com o nome do cliente e R$ 5000 de saldo inicial
            Conta minhaConta = new Conta(nomeCliente, 5000.0);

            System.out.println("Bem vindo ao seu banco preferido " + minhaConta.getNomeCliente());

            while (opcaoSelecionada != 5) {
                System.out.println("\nO que deseja hoje? ");
                System.out.println("======================");
                System.out.println("1. Verificar o Saldo");
                System.out.println("2. Realizar depósito");
                System.out.println("3. Realizar saque");
                System.out.println("4. Ver extrato");
                System.out.println("5. Encerrar sessão");
                System.out.println("======================");
                System.out.print("Escolha uma opção: ");

                opcaoSelecionada = leitor.nextInt();

                switch (opcaoSelecionada) {
                    case 1:
                        System.out.println("\n--> Seu saldo atual é de: R$ " + minhaConta.getSaldo());
                        break;
                        
                    case 2:
                        System.out.print("Digite o valor do seu depósito: R$ ");
                        double valorDeposito = leitor.nextDouble();
                        minhaConta.depositar(valorDeposito); // Chamando o método da classe Conta
                        break;
                        
                    case 3:
                        System.out.print("Digite o valor do seu saque: R$ ");
                        double valorSaque = leitor.nextDouble();
                        minhaConta.sacar(valorSaque); // Chamando o método da classe Conta
                        break;

                    case 4:
                        minhaConta.exibirExtrato();
                        break;
                        
                    case 5:
                        System.out.println("\nObrigado por utilizar nosso banco, " + minhaConta.getNomeCliente() + ". Até logo!");
                        break;
                        
                    default:
                        System.out.println("\nOpção inválida! Por favor, escolha uma opção de 1 a 4.");
                        break;
                }
            }
        }
    }
}
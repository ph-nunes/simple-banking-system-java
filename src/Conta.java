import java.util.ArrayList;
import java.util.List;


public class Conta {
    // Atributos privados (Encapsulamento)
    private String nomeCliente;
    private double saldo;
    private List<Transacao> extrato;

    // Construtor para inicializar a conta com o nome e um saldo inicial (ou 0)
    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
        this.extrato = new ArrayList<>();
    }

    // Método para consultar o saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para obter o nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            extrato.add(new Transacao("Depósito", valor));
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para realizar saque
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            extrato.add(new Transacao("Saque", valor));
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saque negado. Verifique o valor ou saldo insuficiente.");
            return false;
        }
    }

    // Método para varrer o ArrayList e imprimir cada operação na tela
    public void exibirExtrato(){
        System.out.println("\n-----Extrato de Transações-----\n");

        // Verificamos se a lista está vazia primeiro
        if(extrato.isEmpty()){
            System.out.println("Nenhuma movimentação realizada!");
        } else {
            // O laço for-each: para cada objeto "t" do tipo Transacao dentro da lista "extrato"...
            for (Transacao t : extrato) {
                System.out.println(t.getDescricao() + " R$ " + t.getValor());
            }
        }
        System.out.println("\n-----------------------");
    }
}

public class Conta {
    // Atributos privados (Encapsulamento)
    private String nomeCliente;
    private double saldo;

    // Construtor para inicializar a conta com o nome e um saldo inicial (ou 0)
    public Conta(String nomeCliente, double saldoInicial) {
        this.nomeCliente = nomeCliente;
        this.saldo = saldoInicial;
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
            System.out.println("Depósito realizado com sucesso! Novo saldo: R$ " + saldo);
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para realizar saque
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: R$ " + saldo);
            return true;
        } else {
            System.out.println("Saque negado. Verifique o valor ou saldo insuficiente.");
            return false;
        }
    }
}
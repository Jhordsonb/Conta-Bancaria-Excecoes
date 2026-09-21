package ContaBancaria;

public class ContaBancaria {
    private double saldo;
    public ContaBancaria(double saldoInicial) { this.saldo = saldoInicial; }
    public double getSaldo() { return saldo; }
    public void sacar(double valor) {
        if (valor <= 0) throw new IllegalArgumentException("Valor de saque deve ser positivo");
        if (valor > this.saldo) throw new SaldoInsuficienteException("Saldo insuficiente! Saldo atual: " + this.saldo + ", tentou sacar: " + valor);
        this.saldo -= valor;
    }
}

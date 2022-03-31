package banco;

public class ContaPoupanca{
    private int agencia;
    private int numero;
    private double saldo;


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, ContaCorrente contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }
    


}
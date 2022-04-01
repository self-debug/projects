package banco;

public class ContaPoupanca extends Conta{
    public void imprimirSaldo() {
        System.out.println("========Saldo Conta Poupança========");
        super.DadosConta();
    }
}
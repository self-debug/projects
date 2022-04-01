package banco;

public class Conta implements iConta {

    private static final int AgenciaPadrao = 1;
    protected static int SEQUENCIAL = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;

    
    public Conta () {
        this.agencia = Conta.AgenciaPadrao;
        this.numero = SEQUENCIAL++;
        //this.cliente.nome = "Sergio";
        //this.cliente.adicionaEndereco(enderecos("Rua 1"));
        //this.cliente.cpf = "78419506168";
    }


    @Override
    public void sacar(double valor) {
        // TODO Auto-generated method stub
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        // TODO Auto-generated method stub
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaCorrente contaDestino) {
        // TODO Auto-generated method stub
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    protected void DadosConta() {
        //System.out.println("Titular: " + this.cliente);
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }


    @Override
    public void imprimirSaldo() {
        // TODO Auto-generated method stub
        
    }
}

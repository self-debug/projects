package banco;

public class Main {

    public static void main(String[] args) {
        iConta cc = new ContaCorrente();
        cc.depositar(100);
        
        iConta pp = new ContaPoupanca();
        pp.depositar(50);
        pp.sacar(10);
        cc.transferir(20d, pp);
        
        cc.imprimirSaldo();
        pp.imprimirSaldo();
    }

    
}

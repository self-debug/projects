import java.util.ArrayList;

import model.Cliente;
import model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args)
     {
        // dados do endereco
        Endereco enderecos = new Endereco();
        enderecos.cep = "12345-678";
        
        
        Cliente cliente = new Cliente();
        cliente.id = 1;
        cliente.nome = "Joao";
        // dados do cliente
        //if (cliente.enderecos == null) {
        //    cliente.enderecos = new ArrayList<Endereco>();
        //}

        cliente.adicionaEndereco(enderecos);
        //cliente.enderecos.add(endereco);
        //System.out.println("endereço adicionado");
        
    }
}

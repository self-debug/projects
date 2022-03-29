package model;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {   
   
    
    //public List<Endereco> enderecos;
    private List<Endereco> enderecos;


    public void adicionaEndereco(Endereco enderecos) {
        if (enderecos == null) {
            throw new NullPointerException("Endereco não pode ser nulo");
        }
        if (enderecos.cep == null) {
            throw new NullPointerException("CEP não pode ser nulo");
        }
        getEnderecos().add(enderecos);
        //enderecos.add(endereco);
    }

    //public List<Endereco> getEnderecos() {
    private List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
    
    
    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

   //public List<Endereco> getEnderecos() {
   //     return enderecos;
   // }


}
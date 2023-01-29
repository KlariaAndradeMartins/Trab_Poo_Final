package domain;

import java.util.ArrayList;
import java.util.Date;

// Questão 1 -
// g - Criação da entidade cliente
// h - Agencia de cadastro do cliente
// Questão 4 -
// a - Conta será uma super classe para os 3 tipos de conta utilizados
public class Cliente extends Pessoa {

    private String escolaridade;
    private int numeroAgencia;
    private ArrayList<Conta> contas;

    public Cliente(String nome, String cpf) {
        super.setNomeCompleto(nome);
        super.setCpf(cpf);

    }
    public Cliente() {}

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public ArrayList<Conta> getContas() {
        return contas;
    }

    public void setContas(ArrayList<Conta> contas) {
        this.contas = contas;
    }

}

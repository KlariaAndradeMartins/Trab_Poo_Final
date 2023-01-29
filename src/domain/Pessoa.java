package domain;

import domain.validacao.ValidaCPF;

import java.util.Date;

// Questão 6 -
// a - Pessoa será uma entidade abstrata
public abstract class Pessoa {

    private String cpf;
    private String nomeCompleto;
    private String enderecoCompleto;
    private String estadoCivil;
    private Date dataNascimento;

    public Pessoa() {
    }

    public Pessoa(String cpf, String nomeCompleto, String enderecoCompleto, String estadoCivil, Date dataNascimento) {
        this.setCpf(cpf);
        this.nomeCompleto = nomeCompleto;
        this.enderecoCompleto = enderecoCompleto;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean setCpf(String cpf) {
        String cpfValido = "";
        if (ValidaCPF.isCPF(cpf)) {
            cpfValido = ValidaCPF.imprimeCPF(cpf);
        }
        if (!cpfValido.equals("")) {
            this.cpf = cpfValido;
            return true;
        }
        System.out.println("CPF Inválido");
        return false;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEnderecoCompleto() {
        return enderecoCompleto;
    }

    public void setEnderecoCompleto(String enderecoCompleto) {
        this.enderecoCompleto = enderecoCompleto;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

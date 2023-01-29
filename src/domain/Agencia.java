package domain;

// Questão 1 -
// i - Criação da entidade Agencia
public class Agencia {

    private int numeroAgencia;
    private String nomeFicticio;
    private Endereco endereço;

    public Agencia(int numeroAgencia, String nomeFicticio, Endereco endereço) {
        this.numeroAgencia = numeroAgencia;
        this.nomeFicticio = nomeFicticio;
        this.endereço = endereço;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public String getNomeFicticio() {
        return nomeFicticio;
    }

    public void setNomeFicticio(String nomeFicticio) {
        this.nomeFicticio = nomeFicticio;
    }

    public Endereco getEndereço() {
        return endereço;
    }

    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }



}

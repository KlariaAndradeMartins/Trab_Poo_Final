package domain;

// Questão 1 -
// i - especificando endereço como uma classe para facilitar a busca por agencias;

public class Endereco {

    private String cidade;
    private String estado;
    private String bairro;

    public Endereco(String cidade, String estado, String bairro) {
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
}

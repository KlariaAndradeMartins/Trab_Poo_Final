package domain;

import java.util.Date;

// Questão 1 -
// j, k - Criação da Entidade gerente (A agencia será informada nessa entidade, então a busca pelos gerentes de uma
// agencia será feita pelo numero da agencia na entidade gerente)
// Questão 4 -
// b - herança da entidade Funcionário
public class Gerente extends Funcionario {

    private Date dataIngressoCarreira;
    private int numeroAgencia;
    private boolean possuiFormacaoBasica;
    private static double comissao;

    public Gerente(String cpf, String nomeCompleto, String enderecoCompleto, String estadoCivil, Date dataNascimento, String rg, String sexo, String cargo, double salario, int anoDeIngresso, Date dataIngressoCarreira, int numeroAgencia, boolean possuiFormacaoBasica) {
        super(cpf, nomeCompleto, enderecoCompleto, estadoCivil, dataNascimento, rg, sexo, cargo, salario, anoDeIngresso);
        this.dataIngressoCarreira = dataIngressoCarreira;
        this.numeroAgencia = numeroAgencia;
        this.possuiFormacaoBasica = possuiFormacaoBasica;
    }

    public void calcularSalarioEspecifico(){
        System.out.println("O salário específico do Gerente é: " +super.getSalario() + getComissao());
    }

    public Date getDataIngressoCarreira() {
        return dataIngressoCarreira;
    }

    public void setDataIngressoCarreira(Date dataIngressoCarreira) {
        this.dataIngressoCarreira = dataIngressoCarreira;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public boolean isPossuiFormacaoBasica() {
        return possuiFormacaoBasica;
    }

    public void setPossuiFormacaoBasica(boolean possuiFormacaoBasica) {
        this.possuiFormacaoBasica = possuiFormacaoBasica;
    }

    public static double getComissao() {
        return comissao;
    }

    public static void setComissao(double comissao) {
        Gerente.comissao = comissao;
    }
}

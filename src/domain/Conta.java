package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

// Questão 1 -
// a - Criação da entidade conta
// b - implementação da senha (apenas a parte da classe)
// d, e, f - valores comuns entre as contas ficarão na entidade pai
// n - associação à uma agência
// Questão 4 -
// a - Conta será uma super classe para os 3 tipos de conta utilizados
// Questão 6 -
// b - Conta será uma super classe para os 3 tipos de conta utilizados e será abstrata pois nunca será instanciada
public abstract class Conta {
    private String senha;
    private boolean status;
    private int numeroDaConta;
    private double saldoAtual;
    private LocalDateTime dataDeAbertura;
    private LocalDateTime dataUltimaMovimentacao;
    private ArrayList<Cliente> associados;
    private int numeroAgencia;

    public Conta(String senha, boolean status, int numeroDaConta, double saldoAtual, LocalDateTime dataDeAbertura, LocalDateTime dataUltimaMovimentacao, ArrayList<Cliente> associados, int numeroAgencia) {
        this.senha = senha;
        this.status = status;
        this.numeroDaConta = numeroDaConta;
        this.saldoAtual = saldoAtual;
        this.dataDeAbertura = dataDeAbertura;
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
        this.associados = associados;
        this.numeroAgencia = numeroAgencia;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public LocalDateTime getDataDeAbertura() {
        return dataDeAbertura;
    }

    public void setDataDeAbertura(LocalDateTime dataDeAbertura) {
        this.dataDeAbertura = dataDeAbertura;
    }

    public LocalDateTime getDataUltimaMovimentacao() {
        return dataUltimaMovimentacao;
    }

    public void setDataUltimaMovimentacao(LocalDateTime dataUltimaMovimentacao) {
        this.dataUltimaMovimentacao = dataUltimaMovimentacao;
    }

    public ArrayList<Cliente> getAssociados() {
        return associados;
    }

    public void setAssociados(ArrayList<Cliente> associados) {
        this.associados = associados;
    }

    public int getNumeroAgencia() {
        return numeroAgencia;
    }

    public void setNumeroAgencia(int numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }
}

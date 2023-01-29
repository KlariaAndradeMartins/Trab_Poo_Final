package domain;

import java.time.LocalDateTime;
import java.util.Date;

// Questão 1 -
// o - Criação da entidade Transacao bancaria base para armazenar transações
public class TransacaoBancaria {

    private LocalDateTime dataTransacao;
    private double valorTransacao;
    private String canalTransacao;
    private int numeroDaConta;

    private String efetuaSaque(Conta conta, double valorTransacao, String canalTransacao, String senha){
        if(!validaCanal(canalTransacao))
            return "Canal da transação inválido";

        if(!senha.equals(conta.getSenha())){
            return "Senha inválida";
        }

        double saldoAtual = conta.getSaldoAtual();
        double saldoFinal = saldoAtual - valorTransacao;
        conta.setSaldoAtual(saldoFinal);

        this.valorTransacao = valorTransacao;
        this.dataTransacao = LocalDateTime.now();
        this.canalTransacao = canalTransacao;
        conta.setDataUltimaMovimentacao(LocalDateTime.now());

        return "Operação de Saque realizada com sucesso, Numero da conta: " + conta.getNumeroDaConta() +
                ", Saldo atual: " + conta.getSaldoAtual();

    }

    private String efetuaDeposito(Conta conta, double valorTransacao, String canalTransacao, String senha){
        if(!validaCanal(canalTransacao))
            return "Canal da transação inválido";

        if(!senha.equals(conta.getSenha())){
            return "Senha inválida";
        }

        double saldoAtual = conta.getSaldoAtual();
        double saldoFinal = saldoAtual + valorTransacao;
        conta.setSaldoAtual(saldoFinal);

        this.valorTransacao = valorTransacao;
        this.dataTransacao = LocalDateTime.now();
        this.canalTransacao = canalTransacao;
        conta.setDataUltimaMovimentacao(LocalDateTime.now());

        return "Operação de Depósito realizada com sucesso, Numero da conta: " + conta.getNumeroDaConta() +
                ", Saldo atual: " + conta.getSaldoAtual();

    }

    private String efetuaConsulta(Conta conta , String canalTransacao, String senha){
        if(!validaCanal(canalTransacao))
            return "Canal da transação inválido";

        if(!senha.equals(conta.getSenha())){
            return "Senha inválida";
        }

        double saldoAtual = conta.getSaldoAtual();

        this.dataTransacao = LocalDateTime.now();
        this.canalTransacao = canalTransacao;

        return "Saldo atual: " + conta.getSaldoAtual();

    }

    private boolean validaCanal (String canalTransacao){
        if (canalTransacao.equals("internet banking") ||
            canalTransacao.equals("caixa eletrônico") ||
            canalTransacao.equals("caixa físico")) {
            return true;
        }

        return false;
    }

    // Construtor com a conta como parametro, a data da transação será setada quando uma transação for efetuada
    // usando o recurso LocalDateTime.now
    public TransacaoBancaria(Conta conta){
        this.numeroDaConta = conta.getNumeroDaConta();
    }

    public LocalDateTime getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDateTime dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public double getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(double valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getCanalTransacao() {
        return canalTransacao;
    }

    public void setCanalTransacao(String canalTransacao) {
        this.canalTransacao = canalTransacao;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}

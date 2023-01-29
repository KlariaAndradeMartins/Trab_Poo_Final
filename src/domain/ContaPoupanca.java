package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

// Questão 1 -
// e - tipo poupança
public class ContaPoupanca extends Conta {

    private double rendimentoMesAtual;

    public ContaPoupanca(String senha, boolean status, int numeroDaConta, double saldoAtual, LocalDateTime dataDeAbertura, LocalDateTime dataUltimaMovimentacao, ArrayList<Cliente> associados, int numeroAgencia, double rendimentoMesAtual) {
        super(senha, status, numeroDaConta, saldoAtual, dataDeAbertura, dataUltimaMovimentacao, associados, numeroAgencia);
        this.rendimentoMesAtual = rendimentoMesAtual;
    }

    public double getRendimentoMesAtual() {
        return rendimentoMesAtual;
    }

    public void setRendimentoMesAtual(double rendimentoMesAtual) {
        this.rendimentoMesAtual = rendimentoMesAtual;
    }
}

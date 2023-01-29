package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

// Questão 1 -
// e - tipo salário
public class ContaSalario extends Conta{

    private double limiteParaSaque;
    private double limiteParaTransferencia;

    public ContaSalario(String senha, boolean status, int numeroDaConta, double saldoAtual, LocalDateTime dataDeAbertura, LocalDateTime dataUltimaMovimentacao, ArrayList<Cliente> associados, int numeroAgencia, double limiteParaSaque, double limiteParaTransferencia) {
        super(senha, status, numeroDaConta, saldoAtual, dataDeAbertura, dataUltimaMovimentacao, associados, numeroAgencia);
        this.limiteParaSaque = limiteParaSaque;
        this.limiteParaTransferencia = limiteParaTransferencia;
    }

    public double getLimiteParaSaque() {
        return limiteParaSaque;
    }

    public void setLimiteParaSaque(double limiteParaSaque) {
        this.limiteParaSaque = limiteParaSaque;
    }

    public double getLimiteParaTransferencia() {
        return limiteParaTransferencia;
    }

    public void setLimiteParaTransferencia(double limiteParaTransferencia) {
        this.limiteParaTransferencia = limiteParaTransferencia;
    }
}

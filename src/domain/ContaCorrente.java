package domain;

import java.time.LocalDateTime;
import java.util.ArrayList;

// Questão 1 -
// d - tipo corrente
public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;
    private double valorTaxaAdministrativa;

    public ContaCorrente(String senha, boolean status, int numeroDaConta, double saldoAtual, LocalDateTime dataDeAbertura, LocalDateTime dataUltimaMovimentacao, ArrayList<Cliente> associados, int numeroAgencia, double limiteChequeEspecial, double valorTaxaAdministrativa) {
        super(senha, status, numeroDaConta, saldoAtual, dataDeAbertura, dataUltimaMovimentacao, associados, numeroAgencia);
        this.limiteChequeEspecial = limiteChequeEspecial;
        this.valorTaxaAdministrativa = valorTaxaAdministrativa;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getValorTaxaAdministrativa() {
        return valorTaxaAdministrativa;
    }

    public void setValorTaxaAdministrativa(double valorTaxaAdministrativa) {
        this.valorTaxaAdministrativa = valorTaxaAdministrativa;
    }
}

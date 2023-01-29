package domain;

import domain.Pessoa;

import java.time.LocalDateTime;
import java.util.Date;

// Questão 1 -
// l - Criação da entidade funcionário
// Questão 4 -
// c - herança da entidade pessoa
public class Funcionario extends Pessoa {

    private String rg;
    private String sexo;
    private String cargo;
    private double salario;
    private int anoDeIngresso;

    public Funcionario(String cpf, String nomeCompleto, String enderecoCompleto, String estadoCivil, Date dataNascimento, String rg, String sexo, String cargo, double salario, int anoDeIngresso) {
        super(cpf, nomeCompleto, enderecoCompleto, estadoCivil, dataNascimento);
        this.rg = rg;
        this.sexo = sexo;
        this.cargo = cargo;
        this.salario = salario;
        this.anoDeIngresso = anoDeIngresso;
    }

    public void calcularSalarioEspecifico(){
        if(LocalDateTime.now().getYear() - this.anoDeIngresso > 15){
            System.out.println("O salário específico do Funcionário é: " + this.salario * 1.10);
            return;
        }
        System.out.println(this.salario);
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAnoDeIngresso() {
        return anoDeIngresso;
    }

    public void setAnoDeIngresso(int anoDeIngresso) {
        this.anoDeIngresso = anoDeIngresso;
    }
}

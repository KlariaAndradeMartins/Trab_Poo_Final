import domain.Cliente;
import domain.ContaCorrente;
import domain.Funcionario;

import java.sql.Date;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("11487790600", "Eduardo A", "Rua X",
                "Solteiro", Date.valueOf("1996-05-04"), "18064407", "M", "Vendas", 1500, 2005);

        funcionario.calcularSalarioEspecifico();



    }
}
package Exercicio08;

public class Gerente extends Funcionario{
    public Gerente(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double getSalary() {
        return super.getSalary() * 1.20;
    }
}

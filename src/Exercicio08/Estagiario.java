package Exercicio08;

public class Estagiario extends Funcionario{
    public Estagiario(String name, double salary) {
        super(name, salary);
    }
    @Override
    public double getSalary() {
        return super.getSalary() * 0.90;
    }
}

package Exercicio08;

public class Funcionario {
    protected String Name;
    protected double Salary;

    public Funcionario(String name, double salary){
        this.Name = name;
        this.Salary = salary;
    }
    public double getSalary() {
        return Salary;
    }
    public String getName() {
        return Name;
    }
}

package Exercicio08;

public class Ex8 {
    public static void main(String[] args){
        Funcionario gerente = new Gerente("Luiz Cesar", 4500);
        Funcionario estagiario = new Estagiario("Giovani Marlon", 1500);

        System.out.printf("Funcionário: %s\nSalário Final: %f\n\n",gerente.getName(), gerente.getSalary());
        System.out.printf("Funcionário: %s\nSalário Final: %f\n\n",estagiario.getName(), estagiario.getSalary());

    }
}

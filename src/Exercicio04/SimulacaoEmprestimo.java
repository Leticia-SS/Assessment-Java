package Exercicio04;

public class SimulacaoEmprestimo {
    double total, payment, loaned;
    int months;
    public String CalcularEmprestimo(double loaned, int months) {
        payment = loaned/months + loaned * 0.03;
        total = loaned + (loaned * 0.03 * months);
        return "\nTotal com juros: R$" + String.format("%.2f", total) + "\nValor Mensal: R$" + String.format("%.2f", payment);
    }
}

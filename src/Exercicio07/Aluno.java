package Exercicio07;

public class Aluno {
    private String Nome;
    private int Matricula;
    private double[] Notas = new double[3];

    public Aluno(String nome, int matricula,double[] notas){
        this.Nome = nome;
        this.Matricula = matricula;
        this.Notas[0] = notas[0];
        this.Notas[1] = notas[1];
        this.Notas[2] = notas[2];
    }
    public double calcularMedia(){
        double soma = 0;
        for(int i = 0; i< Notas.length; i++){
            soma += Notas[i];
        }
        return soma / Notas.length;
    }
    public String verificarAprovacao() {
        double media = calcularMedia();
            if (media >= 7) {
                return "Aprovado!!!";
            } else {
                return "Reprovado!!!";
            }
    }
    public void dadosAluno() {
        System.out.println("================");
        System.out.println("Nome: " + Nome);
        System.out.println("Matricula: " + Matricula);
    }
}

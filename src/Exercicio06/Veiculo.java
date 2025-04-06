package Exercicio06;

public class Veiculo {
    private String Placa;
    private String Modelo;
    private int AnoFabricacao;
    private double Quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.Modelo = modelo;
        this.Placa = placa;
        this.AnoFabricacao = anoFabricacao;
        this.Quilometragem = quilometragem;
    }

    public void exibirDetalhes(){
        System.out.println("\n-------------------------");
        System.out.printf("Modelo: %s\nPlaca: %s\nAno de Fabricação: %d\nQuilometragem: %f\n", Modelo, Placa, AnoFabricacao, Quilometragem);
        System.out.println("-------------------------\n");
    }

    public double registrarViagem(double km){
        Quilometragem += km;
        return Quilometragem;
    }

}

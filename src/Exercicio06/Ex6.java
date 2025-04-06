package Exercicio06;

public class Ex6 {
    public static void main(String[] args){
        Veiculo veiculo1 = new Veiculo("PWD=4Y56","Toyota",2020,42235.75 );
        Veiculo veiculo2 = new Veiculo("QR8-QU45", "Hyundai HB20", 2017, 110450.80);

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        System.out.printf("Registro de viagem: 180km\nTotal: %f\n", veiculo1.registrarViagem(180));
        System.out.printf("Registro de viagem: 450km\nTotal: %f\n", veiculo2.registrarViagem(450));

        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}

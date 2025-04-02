package Exercicio03;

public class ImpostoDeRenda {
    double imposto, liquido;
    public String calcularImposto(double bruto){
        if(bruto>=45012.61){
            imposto = bruto * 0.275;
        } else if(bruto<=45012.60 && bruto>=33919.81){
            imposto = bruto * 0.15;
        } else if(bruto<=33919.80 && bruto>=22847.77){
            imposto = bruto * 0.075;
        } else {
            imposto = 0;
        }
        liquido = bruto - imposto;
        return "=====================\n" + "Imposto a pagar: R$" + imposto + "\nSalário Anual Líquido: R$" + liquido;
    }
}

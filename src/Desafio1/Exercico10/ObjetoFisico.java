package Desafio1.Exercico10;

public class ObjetoFisico {

    double massa;
    double velocidade;
    double gravidade = 9.8;
    double energiaCinetica;
    double energiaPotencial;
    double alturaEquivalente;

    public double calcularEnergiaCinetica(){
       energiaCinetica = (massa * velocidade * velocidade) / 2;
        return energiaCinetica;
    }

    public double calcularAlturaEquivalente(){
        energiaPotencial = energiaCinetica;
        alturaEquivalente = energiaPotencial / (massa * gravidade);
        return alturaEquivalente;
    }
}

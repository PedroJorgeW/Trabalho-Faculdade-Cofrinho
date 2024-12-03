package TrabalhoFaculdade;

public class Dolar extends Moeda{
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    double converterMoeda() {
        return valor * 6.06;
    }


    public Dolar() {
    }


}

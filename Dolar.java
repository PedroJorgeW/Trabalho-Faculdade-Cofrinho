package TrabalhoFaculdade;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public double converterMoeda() {
        return valor * 6.06;
    }

    @Override
    public String toString() {
        return "Dolar{" +
                "valor=" + valor +
                '}';
    }
}

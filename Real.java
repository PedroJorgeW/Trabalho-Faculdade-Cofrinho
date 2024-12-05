package TrabalhoFaculdade;

public class Real extends Moeda {

    public Real(double valor) {
        super(valor);
    }

    @Override
    public double converterMoeda() {
        return valor; // ja esta em real
    }

    @Override
    public String toString() {
        return "Real{" +
                "valor=" + valor +
                '}';
    }
}


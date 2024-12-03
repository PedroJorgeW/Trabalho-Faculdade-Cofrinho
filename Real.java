package TrabalhoFaculdade;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    double converterMoeda() {
        return valor;
    }

    public Real() {
        super();
    }

    }



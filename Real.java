package TrabalhoFaculdade;

public class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    double converterMoeda() {
        return valor;
    }

    @Override
    public String toString() {
        return "Real{" +
                "listaMoeda=" + listaMoeda +
                ", valor=" + valor +
                '}';
    }

    public Real() {
        super();
    }

    }



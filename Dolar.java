package TrabalhoFaculdade;

public class Dolar extends Moeda{
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    double converterMoeda() {
        return valor * 6.06;
    }

    @Override
    public String toString() {
        return "Dolar{" +
                "valor=" + valor +
                ", listaMoeda=" + listaMoeda +
                '}';
    }

    public Dolar() {
    }


}

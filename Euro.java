package TrabalhoFaculdade;

public class Euro extends Moeda {

    public Euro(double valor) {
        super(valor);
    }

    @Override
    public double converterMoeda() {
        return valor * 6.36; // Taxa de conversão no dia que o projeto ta sendo feito
    }

    @Override
    public String toString() {
        return "Euro{" +
                "valor=" + valor +
                '}';
    }

}















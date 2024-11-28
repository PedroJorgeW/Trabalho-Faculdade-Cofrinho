package TrabalhoFaculdade;

abstract public class Moeda {
    double valor;

     public Moeda(double valor) {
        this.valor = valor;
    }

    abstract void info(); {
        System.out.println("Moeda: " + valor);

    }
    public void converterMoeda(double valor) {
        this.valor = valor;
        Double converterEuro = valor *  6.27;
        Double converterDolar = valor * 5.94;
    }
}



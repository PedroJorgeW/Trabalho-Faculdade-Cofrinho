package TrabalhoFaculdade;


import java.util.Objects;

abstract public class Moeda {
   protected double valor;

    public Moeda(double valor) {
        this.valor = valor;

    }
        public double getValor() {
            return valor;
        }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(valor);
    }

    // Conversão para Real
    public abstract double converterMoeda();

    public String info() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Valor: " + valor;
    }
}

























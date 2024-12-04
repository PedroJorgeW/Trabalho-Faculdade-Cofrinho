package TrabalhoFaculdade;

public class Euro extends Moeda {
    public Euro(double valor) {
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
            return valor * 6.36;
        }

    @Override
    public String toString() {
        return "Euro{" +
                "valor=" + valor +
                ", listaMoeda=" + listaMoeda +
                '}';
    }



    public Euro() {
        super();
    }




    }



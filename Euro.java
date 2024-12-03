package TrabalhoFaculdade;

public class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

        @Override
        double converterMoeda() {
            return valor * 6.36;
        }


        public Euro() {
        super();
    }


    }


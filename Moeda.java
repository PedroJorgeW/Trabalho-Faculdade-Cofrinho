package TrabalhoFaculdade;
import java.util.ArrayList;


abstract public class Moeda {
    double valor;
    double valorTotal = 0;

    public Moeda(){

    }

    public Moeda(double valor) {
        this.valor = valor;
    }

    ArrayList<Moeda> listaMoeda = new ArrayList<>();


    public void adicionar(Moeda m) {
        Euro addMoedaEuro = new Euro();
        listaMoeda.add(addMoedaEuro);

        Dolar addMoedaDolar = new Dolar();
        listaMoeda.add(addMoedaDolar);

        Real addMoedaReal = new Real();
        listaMoeda.add(addMoedaReal);

    }

    public void remover(Moeda m) {

    }

    public void listar() {

        for (Moeda m : listaMoeda) {
            System.out.println("Valor Total: " + valorTotal);

        }

        }

        abstract double converterMoeda();
        }














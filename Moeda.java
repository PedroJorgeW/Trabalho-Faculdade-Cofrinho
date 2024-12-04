package TrabalhoFaculdade;
import java.util.ArrayList;
import java.util.Objects;


abstract public class Moeda {
    double valor;



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Moeda moeda = (Moeda) o;
        return Double.compare(valor, moeda.valor) == 0 && Objects.equals(listaMoeda, moeda.listaMoeda);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, listaMoeda);
    }

    public void listar() {

        for (Moeda m : listaMoeda) {
            System.out.println("Valor Total: " + valor);
        }





        }
        abstract double converterMoeda();
        }
















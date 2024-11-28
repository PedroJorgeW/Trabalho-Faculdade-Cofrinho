package TrabalhoFaculdade;
import java.util.ArrayList;
import java.util.Scanner;

public class Cofinho {
    public static void main(String[] args) {
        ArrayList<Moeda> listaMoeda = new ArrayList<Moeda>();

        Scanner lerValor = new Scanner(System.in);

        Euro addMoedaEuro = new Euro(lerValor.nextDouble());
        listaMoeda.add(addMoedaEuro);

        Dolar addMoedaDolar = new Dolar(lerValor.nextDouble());
        listaMoeda.add(addMoedaDolar);

        Real addMoedaReal = new Real(lerValor.nextDouble());
        listaMoeda.add(addMoedaReal);

            };
        }















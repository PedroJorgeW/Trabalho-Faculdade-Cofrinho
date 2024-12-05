package TrabalhoFaculdade;
import java.util.ArrayList;
import java.util.List;

public class Cofrinho {
    private List<Moeda> moedas; // Declaração correta

    // Construtor inicializando a lista
    public Cofrinho() {
        this.moedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda
    public void adicionar(Moeda moeda) {
        moedas.add(moeda);
        System.out.println("Moeda adicionada: " + moeda.info());
    }

    // Método para remover uma moeda
    public void remover(Moeda moeda) {
        if (moedas.remove(moeda)) {
            System.out.println("Moeda removida: " + moeda.info());
        } else {
            System.out.println("Moeda não encontrada.");
        }
    }

        // Método para listar todas as moedas
    public void listar() {
        if (moedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");
        } else {
            System.out.println("Moedas no cofrinho:");
            for (Moeda moeda : moedas) {
                System.out.println(moeda.info());
            }
        }
    }

    // Método para calcular o total em reais
    public double calcularTotalConvertido() {
        double total = 0;
        for (Moeda moeda : moedas) {
            total += moeda.converterMoeda();
        }
        return total;
    }
}

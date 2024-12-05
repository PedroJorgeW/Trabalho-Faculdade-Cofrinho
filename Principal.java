package TrabalhoFaculdade;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();
        int opcao;
        int tipoMoeda;

        do {
            System.out.println("Menu");
            System.out.println("1- Adicionar Moeda");
            System.out.println("2- Remover Moeda");
            System.out.println("3- Listar");
            System.out.println("4- Calcular total em Reais");
            System.out.println("5- Encerrar");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o tipo de moeda que deseja adicionar:");
                    System.out.println("1- Euro");
                    System.out.println("2- Dólar");
                    System.out.println("3- Real");
                    tipoMoeda = teclado.nextInt();
                    System.out.println("Digite o valor:");
                    int valorDeposito = teclado.nextInt();

                    Moeda moedaAdicionar = null;
                    switch (tipoMoeda) {
                        case 1:
                            moedaAdicionar = new Euro(valorDeposito);
                            break;
                        case 2:
                            moedaAdicionar = new Dolar(valorDeposito);
                            break;
                        case 3:
                            moedaAdicionar = new Real(valorDeposito);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                            break;
                    }
                    if (moedaAdicionar != null) {
                        cofrinho.adicionar(moedaAdicionar);
                    }
                    break;
                case 2:
                    System.out.println("Escolha o tipo de moeda que deseja remover:");
                    System.out.println("1- Euro");
                    System.out.println("2- Dólar");
                    System.out.println("3- Real");
                    tipoMoeda = teclado.nextInt();
                    System.out.println("Digite o valor:");
                    int valorRemovido = teclado.nextInt();

                    Moeda moedaRemover = null;
                    switch (tipoMoeda) {
                        case 1:
                            moedaRemover = new Euro(valorRemovido);
                            break;
                        case 2:
                            moedaRemover = new Dolar(valorRemovido);
                            break;
                        case 3:
                            moedaRemover = new Real(valorRemovido);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido!");
                            break;
                    }
                    if (moedaRemover != null) {
                        cofrinho.remover(moedaRemover);
                    }
                    break;
                case 3:
                    cofrinho.listar();
                    break;

                case 4:
                    System.out.println("Total em Reais: R$ " + cofrinho.calcularTotalConvertido());
                    break;

                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 5);

        teclado.close();
    }
}

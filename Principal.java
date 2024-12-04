package TrabalhoFaculdade;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int tipoMoeda = 0;
        double euro;
        double dolar;
        double reais;

        Moeda moeda = new Moeda() {
            @Override
            double converterMoeda() {
                return valor;
            }
        };

        System.out.println("Menu");
        System.out.println("1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3 -Lista");
        System.out.println("4 - Encerrar");
        opcao = teclado.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Menu");
                        System.out.println("1- Euro");
                        System.out.println("2- Dolar");
                        System.out.println("3 - Real");
                        tipoMoeda = teclado.nextInt();

                        Moeda mod = null;

                        if (tipoMoeda == 1) {
                            System.out.println("Quanto deseja depositar em Euros?");
                            euro = teclado.nextInt();
                            mod = new Euro();
                        }

                        if (tipoMoeda == 2) {
                            System.out.println("Quanto deseja depositar em Dolar?");
                            dolar = teclado.nextInt();
                            mod = new Dolar();
                        }

                        if (tipoMoeda == 3) {
                            System.out.println("Quanto deseja depositar em Reais?");
                            reais = teclado.nextInt();
                            mod = new Real();

                        }
                        moeda.adicionar(mod);
                        break;
                    }


                case 2:

                    while (tipoMoeda > 3 || tipoMoeda <= 0) {
                        System.out.println("Menu");
                        System.out.println("1- Euro");
                        System.out.println("2- Dolar");
                        System.out.println("3 - Real");
                        tipoMoeda = teclado.nextInt();

                        Moeda mod = null;

                        if (tipoMoeda == 1) {
                            System.out.println("Quanto deseja sacar em Euros?");
                            euro = teclado.nextInt();
                            mod = new Euro();
                        }

                        if (tipoMoeda == 2) {
                            System.out.println("Quanto deseja sacar em Dolar?");
                            dolar = teclado.nextInt();
                            mod = new Dolar();
                        }

                        if (tipoMoeda == 3) {
                            System.out.println("Quanto deseja sacar em Reais?");
                            reais = teclado.nextInt();
                            mod = new Real();

                            moeda.remover(mod);

                            break;
                        }
                    }
                            case 3:
                                moeda.listar();
                            default:
                                System.out.println("Opção invalida");
                                return;

                        }
                    }

            }
        }



















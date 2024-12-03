package TrabalhoFaculdade;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opcao;
       // Moeda moeda = new Moeda()


        System.out.println("Menu");
        System.out.println("1- Depositar");
        System.out.println("2- Sacar");
        System.out.println("3 -Lista");
        System.out.println("4 - Encerrar");
        opcao = teclado.nextInt();
        while (opcao > 0 && opcao < 4) {
            switch (opcao) {
                case 1:
                    int tipoMoeda = 0;
                    while (tipoMoeda > 0 || tipoMoeda <= 4) {
                        System.out.println("Menu");
                        System.out.println("1- Euro");
                        System.out.println("2- Dolar");
                        System.out.println("3 - Real");
                        tipoMoeda = teclado.nextInt();

                        Moeda mod;

                        if (tipoMoeda == 1) {
                            System.out.println("Quanto deseja depositar em Euros?");
                            int euro = teclado.nextInt();
                            mod = new Euro();
                        }

                            if (tipoMoeda == 2) {
                                System.out.println("Quanto deseja depositar em Dolar?");
                                int dolar = teclado.nextInt();
                                mod = new Dolar();
                            }

                                if (tipoMoeda == 3) {
                                    System.out.println("Quanto deseja depositar em Reais?");
                                    int reais = teclado.nextInt();
                                    mod = new Real();

                        }

                    }


                    break;
                case 2:
                    // remover
                    break;
                case 3:
                    // lista
                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("Menu");
            System.out.println("1- Adicionar uma moeda");
            System.out.println("2- Remover uma moeda");
            System.out.println("3 -Lista de moedas");
            System.out.println("4 - Encerrar");

            }

            }
        }















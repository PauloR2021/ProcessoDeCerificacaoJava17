package Semana2;

import java.util.Scanner;

public class MainSemana2 {

    static Scanner sc = new Scanner(System.in);
    static ContaBancaria cb = new ContaBancaria();
    static MainSemana2 ms2 = new MainSemana2();

    public int menu(){


        System.out.println("##### Meu Banco #####");
        System.out.println("1 - Consultar Saldo\n" +
                "2 - Depositar\n" +
                "3 - Sacar\n" +
                "4 - Sair do APP");
        System.out.print(">: ");
        int opcao = sc.nextInt();
        sc.nextLine();

        return opcao;

    }

    public static void main(String[] args){

        //Criando o Objeto da Classe Carro
        //Carro carro = new Carro();
        //carro.acelerar(); //Chamando o Atributo do Carro para Acelerar

        //Criando um Objeto Carro através da Classe Carro já instanciado

        /*
       carro.modelo = "Civic";
       carro.cor = "Preto";
       carro.ano = 2025;

       carro.mostrarCarro();*/

        //Trabalhando com Classes, Métodos e Encapsulamento

        try {
            cb.setNome("Paulo Ricardo");
            cb.setConta("00001-0");
            cb.setSaldo(100.0);

            while (true){

                int opcao = ms2.menu();

                switch (opcao){
                    case 1:
                        System.out.println(cb.consultarSaldo());
                        break;
                    case 2:
                        System.out.println("------------- DEPOSITAR -------------");
                        System.out.println("- INFO CONTA ------------------------");
                        System.out.println(cb.consultarSaldo());
                        System.out.print("Valor do Deposito R$: ");
                        double valorDeposito = sc.nextDouble();
                        cb.depositar(valorDeposito);
                        break;
                    case 3:
                        System.out.println("------------- SACAR -------------");
                        System.out.println("- INFO CONTA --------------------");
                        System.out.println(cb.consultarSaldo());
                        System.out.print("Valor do Saque R$: ");
                        double valorSaque = sc.nextDouble();
                        cb.sacar(valorSaque);
                        break;
                    case 4:
                        System.out.println("Encerrando o APP");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção Inválida !!");

                }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);

        }finally {
            ms2.menu();

        }


    }
}

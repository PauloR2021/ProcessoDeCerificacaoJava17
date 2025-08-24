package Exercicios;

import java.util.Scanner;

public class TesteSemana1 {

    /*
     * Criando projetos testes para Fixar as informações da 1 semana de Estudos
     * Tipos de Dados
     * Operadores
     * Controle de Fluxo
     */

    static Scanner sc = new Scanner(System.in);

    public int menu(){
        System.out.println("########## Tela Principal ##########");
        System.out.println("1 - Cadastrar Usuário\n" +
                "2 - Consultar os Dias da Semanana\n" +
                "3 - Sair"
        );
        System.out.print(">: ");

        return sc.nextInt();
    }

    public String cadastraUsuario() {
        String nome;
        int idade;
        long cpf;
        boolean filhos;
        char sexo;

        System.out.print("Digite seu Nome: ");
        nome = sc.next();
        sc.nextLine();

        System.out.print("Digite sua Idade: ");
        idade = sc.nextInt();
        sc.nextLine(); // limpa o buffer

        System.out.print("Digite o CPF: ");
        cpf = sc.nextLong();
        sc.nextLine(); // limpa o buffer

        System.out.print("Possui Filhos: 0 - Não | 1 - Sim: ");
        int opFilhos = sc.nextInt();
        sc.nextLine(); // limpa o buffer
        filhos = (opFilhos == 1);

        System.out.print("Sexo: M - Masculino | F - Feminino | O - Outro: ");
        sexo = Character.toUpperCase(sc.next().charAt(0));
        sc.nextLine(); // limpa o buffer

        return String.format(
                "Usuário Cadastrado com Sucesso: NOME: %s, IDADE: %d, CPF: %d, FILHOS: %b, SEXO: %c",
                nome, idade, cpf, filhos, sexo
        );
    }


    public String diaDaSemana(){
        String diaSemana = "1 - Domingo \n" +
                "2 - Segunda Feira\n" +
                "3 - Terça Feira\n" +
                "4 - Quarta Feira\n" +
                "5 - Quinta Feira\n" +
                "6 - Sexta Feira\n" +
                "7 - Sábado";
        return diaSemana;
    }

    public static void main(String [] args){

        TesteSemana1 app = new TesteSemana1();



        while (true){

            int escolha = app.menu();
            switch (escolha){
                case 1:
                    System.out.println(app.cadastraUsuario());
                    break;
                case 2:
                    System.out.println(app.diaDaSemana());
                    break;
                case 3:
                    System.out.println("Deseja Sair do App: S - sim | N - Não");
                    System.out.print(">: ");
                    char sair = sc.next().charAt(0);

                    if(Character.toUpperCase(sair) == 'S'){
                        System.out.println("Fechando o APP ...");
                        System.exit(0);
                        break;
                    }else{
                        continue;
                    }
                default:
                    System.out.println("Opção Não Existe");
            }

        }


    }
}

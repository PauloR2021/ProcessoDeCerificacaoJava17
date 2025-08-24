package Exercicios;

import java.util.*;

public class Exercicio1 {

    static Scanner sc = new Scanner(System.in);
    static  Exercicio1 exer1 = new Exercicio1();

    //Menu
    public int menu(){
        System.out.println("=========== Treinamento de Exercicios Java ==========");
        System.out.println("===========    Escolha Seu Execicio Java   ==========");
        System.out.println("1 - Exercicio List: Digitando Nomes\n"+
                "2 - Exercicio List: Digite 10 Números e Mostre em Ordem Invertida\n"+
                "3 - Exercicio List: Digite 4 Notas e Receba a Média\n"+
                "4 - Exercicio Set: Digite 5 Números aonde não pode ter valores duplicados\n"+
                "5 - Exercicio Set: Digite 10 Palavras Aonde vai ser mostrado quantas foram Distintas\n"+
                "6 - Exercicio Map: Digite o Nome e o Telefone de 5 Pessoas");
        System.out.print(">: ");
        int opcao =sc.nextInt();
        sc.nextLine();

        return opcao;

    }

    //Excercicio 1
    public void criarNomes(){
        List<String> nomes = new ArrayList<>();
        System.out.println("Exercicio de List - Digite 5 Nomes");
        for(int i =0; i<5; i++){

            System.out.print("Digite o Nome: ");
            String nomeDigitado = sc.nextLine();
            nomes.add(nomeDigitado);
        }
        System.out.println("===== Resposta =====");
        for(int j =0; j < nomes.size(); j++){
            System.out.println("index do Nome: " + j +" Nome: " + nomes.get(j));

        }

        System.out.println();

    }

    //Excercicio 2
    public void lerNumeroInvertidos(){
        List<Integer> numeros = new ArrayList<>();
        System.out.println("Exercicio de List - Digite 10 Números");
        for(int i =0; i<10; i++){
            System.out.print("Digite o Número: ");
            int numeroDigitado = sc.nextInt();
            numeros.add(numeroDigitado);
        }
        System.out.println("===== Resposta =====");
        Collections.reverse(numeros); //Método para Inverte a Ordem dos Valores do Array
        for(int j=0; j < numeros.size(); j++){
            System.out.println("Index: "+j + " Número: "+numeros.get(j));
        }
        System.out.println();

    }

    //Exercicio 3
    public void calcularNotaAluno(){
        List<Double> notas = new ArrayList<>();
        double media =0;

        System.out.println("Exercicio de List - Digite 4 Notas");
        for(int i =0; i<4; i++){
            System.out.print("Digite a Nota: ");
            double numeroDigitado = sc.nextDouble();
            notas.add(numeroDigitado);
        }
        System.out.println("===== Resposta =====");
        for (double nota : notas){
            System.out.println("Nota: "+nota);
            media += nota / 4;
        }
        System.out.println("Média: "+media);
        System.out.println();
        
    }

    //Excicio 4
    public void lerNumerosEmSet(){
        Set<Integer> numeros = new HashSet<>();

        System.out.println("Exercicio de List - Digite 5 Números");
        for(int i =0; i<5; i++){
            System.out.print("Digite um Número: ");
            int numeroDigitado = sc.nextInt();

            if(numeros.contains(numeroDigitado)){
                System.out.println("Número Digitado: "+numeroDigitado + " Já está na Lista e não pode ser Adicionado...");
                System.out.println();
                break;
            }else{
                numeros.add(numeroDigitado);
            }
        }
        System.out.println("===== Resposta =====");
        for(int numero : numeros){
            System.out.println("Número Adicionado na Lista: "+numero);
        }

        System.out.println();
    }

    //Excercicio 5
    public void listaDePalavrasEmSet(){
        Set<String> palavras = new HashSet<>();

        System.out.println("Exercicio de List - Digite 10 Palavras");
        for(int i =0; i<10; i++){
            System.out.print("Digite uma Palavra: ");
            String palavraDigitada = sc.nextLine();

            if(palavras.contains(palavraDigitada)){
                System.out.println("Palavra Digitado: "+palavraDigitada+ " Já está na Lista e não pode ser Adicionado...");
                System.out.println();

            }else{
                palavras.add(palavraDigitada);
            }
        }
        System.out.println("===== Resposta =====");
        for(String palavra : palavras){
            System.out.println("Palavra Adicionado na Lista: "+palavra);
        }
        System.out.println("Quantoas Palavras Distintas: "+palavras.size());

        System.out.println();
    }

    //Exercicio 6
    public void listaDePessoasETelefone(){
        Map<String,String> lista = new HashMap<>();

        System.out.println("Exercicio de List - Digite 5 Nomes e  Telefones");
        for(int i =0; i<5; i++){
            System.out.print("Digite um Nome: ");
            String nomeDigitado = sc.nextLine();
            System.out.print("Digite o Telefone: ");
            String telefoneDigitado = sc.nextLine();

            lista.put(nomeDigitado,telefoneDigitado);
        }
        System.out.println("===== Resposta =====");
        for(String nome : lista.keySet()){
            System.out.println("| Nome: "+nome + " | Telefone: "+lista.get(nome) + " |");
        }

        System.out.println();
    }


    //Método Main
    public static void main(String[] args){

        while (true){
            int escolha = exer1.menu();

            switch(escolha){
                case 1 :
                    exer1.criarNomes();
                    break;
                case 2:
                    exer1.lerNumeroInvertidos();
                    break;
                case 3:
                    exer1.calcularNotaAluno();
                    break;
                case 4:
                    exer1.lerNumerosEmSet();
                    break;
                case 5:
                    exer1.listaDePalavrasEmSet();
                    break;
                case 6:
                    exer1.listaDePessoasETelefone();
                    break;
                case 0:
                    System.out.println("Deseja Sair do APP : S - Sim / N - Não");
                    char opcao = Character.toUpperCase(sc.next().charAt(0));

                    if(opcao == 'S'){
                        System.out.println("Saindo do APP...");
                        System.exit(0);
                    }else {
                        continue;
                    }
                default:
                    System.out.println("Opção Inválida...");
            }

        }



    }
}

package Semana1;

import java.util.Scanner;

public class MainSemana1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TiposDados tiposDados = new TiposDados(); //Classe dos Tipos de Dados

        // Primeira Semana de Estudos - Tipos de Dados Primitivos
        /*
        * Tipo de Dados - Byte
        * Ex: Armazenamento da Idade

        System.out.print("Digite Sua Idade: ");
        byte idade = sc.nextByte();
        System.out.println("Sua idade: "+ tiposDados.suaIdade(idade));
        */

        /*
        *  Tipo de Dados - Short
        *  Ex: Ano de Nascimento

        System.out.print("Digite Seu Ano de Nascimento: ");
        short ano = sc.nextShort();
        System.out.println("Seu Ano de Nascimento: " + tiposDados.seuAnoNascimento(ano));

         */

        /*
        * Tipo de Dados - Int
        * Ex: Número sem Pontuação (1,2,3,4,5,6)

        System.out.print("Digite um Número: ");
        int numero = sc.nextInt();
        System.out.println("Seu Número Digitado: " +tiposDados.numeroQualquer(numero));

        */


        /*
        * Tipo de Dados - Long - Números muito grande
        * Ex: Número da População


        System.out.print("Digite a População da sua Cidade: ");
        long populacao = sc.nextLong();
        System.out.println("Populçao é de : "+tiposDados.numeroPopulacao(populacao));
        */

        /*
        * Tipo de Dados - Double - Numero com Pontuação
        * Ex : PI

        double númeroPI =  3.14159;
        System.out.println("Valor do PI: "+tiposDados.numeroPi(númeroPI));
        */

        /*
        * Tipo de Dados - Char
        * Ex: Qualquer Caracter

        char caracter = 'A';
        System.out.println("Seu Caracter: "+tiposDados.digiteCaracter(caracter));
         */

        /*
        * Tipo de Dados - Boolean
        * Ex: Comparação de Valores

        System.out.println(tiposDados.verificaComparacao(6> 2));
         */

        /*################################################################################*/

        // Operadores e Controle de Fluxos
        /*
        * Aritméticos: + - * /
        * Atribuição: = += -= *= /=
        * Comparação: == != > < >= <=
        * Lógicos: &&(E) ||(ou) !(Não)
        * Incremento/Decremento: ++ --
        *
        * ############ Controle de Fluxo #########
        * IF e ELSE
        * */

        int numero1 = 10;
        int numero2 = 5;
        int resultado;

        // Arítméticos
        // Operador  +
        resultado = numero1+numero2;
        System.out.println("Operador de + : " + resultado);

        // Operador -
        resultado = numero1 - numero2;
        System.out.println("Operador de - : " +resultado);

        // Operador *
        resultado = numero1 * numero2;
        System.out.println("Operador de * : " +resultado);

        // Opeador /
        resultado = numero1 / numero2;
        System.out.println("Operador de / : " +resultado);


        // Atribuição
        // Operador =
        numero1 = 45;
        System.out.println("Nova Atribuição da Váriavel Numero1 que Valia 10 - Novo Valor: " + numero1);

        // Operador += - Ele Pega o Valor Atual e Adiciona mais o novo Valor, assim realizando uma Soma
        numero1 += 100;
        System.out.println("Nova Atribuição ( += ) da Váriavel Numero1 que Valia 10 - Novo Valor: " + numero1);

        // Operador -= - Ele Pega o Valor Atual e Subtrai menos o novo Valor, assim realizando uma Subtração
        numero1 -= 100;
        System.out.println("Nova Atribuição ( -= ) da Váriavel Numero1 que Valia 10 - Novo Valor: " + numero1);

        // Operador *= - Ele Pega o Valor Atual e multiplica pelo novo Valor, assim realizando uma Multplicação
        numero1 *= 100;
        System.out.println("Nova Atribuição ( *= )  da Váriavel Numero1 que Valia 10 - Novo Valor: " + numero1);

        // Operador /= - Ele Pega o Valor Atual e Divide pelo novo Valor, assim realizando uma Divisão
        numero1 /= 100;
        System.out.println("Nova Atribuição ( /= )  da Váriavel Numero1 que Valia 10 - Novo Valor: " + numero1);

        // Comparação - Retorno (False ou True)

        // Operador ==
        //Realizando a Comparação dos valores utilizando o simbolo (== - Igual)
        System.out.println("Verificando se o númeor 45 e 5 são iguais ' == ': " + (numero1 == numero2));

        //Operador !=
        //Realizando a Comparação deos valores utilizando o Simbolo ( != - Diferente ou Igual)
        System.out.println("Verificando se o númeor 45 e 5 são iguais ' != ': " + (numero1 != numero2));

        //Operador >
        //Realizando a Comparação deos valores utilizando o Simbolo ( > - Maior)
        System.out.println("Verificando se o número 45 é maior que 5  ' > ': " + (numero1 > numero2));

        //Operador <
        //Realizando a Comparação deos valores utilizando o Simbolo ( < - Menor)
        System.out.println("Verificando se o número 45 é menor que 5  ' < ': " + (numero1 < numero2));

        //Operador >=
        //Realizando a Comparação deos valores utilizando o Simbolo ( >= - Maior ou Igual)
        System.out.println("Verificando se o número 45 é maior ou igual que 5  ' >= ': " + (numero1 >= numero2));

        //Operador <=
        //Realizando a Comparação deos valores utilizando o Simbolo ( <= - Menor ou Igual)
        System.out.println("Verificando se o número 45 é menor ou igual que 5  ' <= ': " + (numero1 <= numero2));

        // Lógicos
        //Operador &&(E) - Retornos ( 1 - Verdadeiro e 1 - Verdedeiro = TRUE , 1 - Verdadeiro e 1 - Falso = FALSE , 1 - Falso e 1 - Falso = FALSE, 1 - Falso e 1 - Verdadeiro = FALSE )
        System.out.println("Realizando duas compração para ser um valor Verdadeiro &&(E): " +(10> 5 && 35 >12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro &&(E): " +(10> 5 && 35 <12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro &&(E): " +(35< 5 && 104 <12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro &&(E): " +(35< 5 && 104 >12));

        //Operador || (OU) - Retornos ( 1- Veradeiro e 1 - Verdadeiro = TRUE, 1 - Verdadeiro e 1 - Falso = TRUE , 1 - Falso e 1 - Falso = FALSE, 1- Falso e 1-Verdadeiro = TRUE )
        System.out.println("Realizando duas compração para ser um valor Verdadeiro || (OU): " +(10> 5 || 35 >12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro || (OU): " +(10> 5 || 35 <12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro || (OU): " +(35< 5 || 104 <12));
        System.out.println("Realizando duas compração para ser um valor Verdadeiro || (OU): " +(35< 5 || 104 >12));

        //Operador !(Não) - Inverte o valor da expressão TRUE pasas para FALSE , FALSE passa para TRUE
        System.out.println("Invertando o Retorno de uma Operação aonde o Retorno é TRUE para FALSE utilizando - ! (NÃO): " +(!(10 > 5)));
        System.out.println("Invertando o Retorno de uma Operação aonde o Retorno é FALSE para TRUE utilizando - ! (NÃO): " +(!(10 < 5)));

        //Incremento e Descremento (++, --)
        //Incremento ++
        int incremento = 10;
        System.out.println("Incrementando mais 1 no valor da Váriavel com ++: " + (++incremento));

        //Descremento --
        int decremento = 10;
        System.out.println("Decrementando menos 1 no valor da Váriavel com --: " + (--decremento));

        //Controle de Fluxo IF e Else
        System.out.println("Digite sua Idade: ");
        int idade = sc.nextInt();
        if(idade >= 18){
            System.out.println("Maior de Idade");
        }else{
            System.out.println("Menor de Idade");
        }

        //Swicth Case
        System.out.println("Digite um dia: ");
        int dia = sc.nextInt();

        switch (dia){
            case 1:
                System.out.println("Dia 1 - Domingo ");
                break;
            case 2 :
                System.out.println("Dia 2 - Segunda Feira");
                break;
            case 3:
                System.out.println("Dia 3 - Terça Feira");
                break;
            case 4:
                System.out.println("Dia 4 - Quarta Feira");
                break;
            case 5:
                System.out.println("Dia 5 - Quinta Feira");
                break;
            case 6:
                System.out.println("Dia 6 - Sexta Feira");
                break;
            case 7:
                System.out.println("Dia 7 - Sábado");
                break;
            default:
                System.out.println("Sem dia Digitado");


        }

        //Estrutura de Repetição
        //FOR, WHILE DO WHILE

        //FOR
        for(int i =0 ;  i< 5; i++){
            System.out.println("Laço FOR: " + i);
        }

        //WHILE
        int x = 0;
        while (x <10){
            System.out.println("Laço WHILE: "+x);
            x++;
        }

        //DO WHILE
        do {
            System.out.println("Laço DO WHILE: "+x);
            x++;
        }while (x <10);




    }
}

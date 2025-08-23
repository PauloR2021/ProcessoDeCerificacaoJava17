package Semana1;

import java.text.BreakIterator;

public class TiposDados {

    //Tipos de dados Primitivos que existe em Java

    //Byte - Armazena Inteiros de 8 Bits com valores -128 a 127
    //Short - Armazena Inteiros de 16 Bits com valores -32.768 a 32.767
    //Int - Armazena Inteiros de 32 bits com valores de intervalo grande de valores (-2.147.483.648 a 2.147.483.647).
    //Long - Utilizado para números inteiros muitos grandes, 64 Bits
    //Float - Para númeors decimais ponto fluantes com preccisão de 32 Bits
    //Double - Para ponto flutuante de 64 Bits
    //Char - Aramzena um único caractere dentro do espaço de mémoria
    //Boolen - Armazena um Valor lógico que pode ser apenas True ou False
    //String - Armazena Texto


    private byte idade;
    private short ano;
    private int numero;
    private long populacao;
    private float preco;
    private double pi;
    private char iniciaNome;
    private boolean comparacao;

    public byte suaIdade(byte varIdade){
        this.idade = varIdade;
        return idade;
    }

    public short seuAnoNascimento(short varAno){
        this.ano = varAno;
        return ano;
    }

    public int numeroQualquer(int varNumero){
        this.numero = varNumero;
        return numero;
    }
    public long numeroPopulacao(long varPopulacao){
        this.populacao = varPopulacao;
         return populacao;
    }

    public double numeroPi(double varPi){
        this.pi = varPi;
        return pi;
    }

    public char digiteCaracter(char varCaracter){
        this.iniciaNome = varCaracter;
        return iniciaNome;
    }

    public boolean verificaComparacao(boolean varComparacao){
        this.comparacao= varComparacao;
        return comparacao;
    }


}

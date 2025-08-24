package Semana2;

/*
* Uma classe é um molde ou modelo que define as caracterisitcas atributos e comportamentos de um tipo de objeto.
* Ele não ocupa espaço em memoria até que seja criado.
* */

public class Carro {

    String modelo;
    String cor;
    int ano;


    void acelerar(){
        System.out.println("O Carro está acelerando");
    }

    void mostrarCarro(){
        System.out.println("Modelo: " + this.modelo + " COR: " + this.cor + " ANO: "+this.ano);
    }
}

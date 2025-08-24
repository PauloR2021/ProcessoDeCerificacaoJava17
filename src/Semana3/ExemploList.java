package Semana3;

import java.util.*;

public class ExemploList {

    /*
    * Uma List é uma coleção ordenada que permite elementos duplicados e acesso por índice.
    */

    public static void main(String[] args){

        List<String> nomes = new ArrayList<>();
        nomes.add("Paulo");
        nomes.add("Amanda");
        nomes.add("Fernanda");
        nomes.add("Maria");

        //Percorrendo a Lista Mostrando a Posição do Elemento e o Nome do elemento
        for (int i=0; i<nomes.size(); i++){
            System.out.println("Index: "+i + " Nome: " + nomes.get(i));

        }

        //Set - Não permite elementos Duplicado dentro da lista
        Set<String> frutas = new HashSet<String>();
        frutas.add("Maça");
        frutas.add("Laranja");
        frutas.add("Banana");
        frutas.add("Banana");

        for (String fruta : frutas){
            System.out.println("Frutas: " + fruta);
        }


        // Map - armazena pares chave → valor.  As chaves são únicas, mas os valores podem se repetir.

        Map<String,Integer> estoque = new HashMap<>();

        //Adicionando Elementos
        estoque.put("Teclado",10);
        estoque.put("Mouse",10);
        estoque.put("Monitor",10);
        estoque.put("Mouse",25); //Sobrescreve o Valor Anterior

        for (String produto : estoque.keySet()){
            System.out.println(produto +" > " +estoque.get(produto) );
        }

    }
}

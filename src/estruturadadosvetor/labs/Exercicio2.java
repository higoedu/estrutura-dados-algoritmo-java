package estruturadadosvetor.labs;

import estruturadadosvetor.Lista;

import java.util.ArrayList;

/*
Melhore a classe Lista e implemente o método ultimoIndice,
semelhante ao método lastIndexOf da classe ArrayList
*/
public class Exercicio2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(5);

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("A");

        System.out.println(arrayList.lastIndexOf("A"));

        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("A");

        System.out.println(lista.ultimoIndice("A"));
    }
}

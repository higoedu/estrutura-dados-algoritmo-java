package estruturadadosvetor.labs;

import estruturadadosvetor.Lista;
/*
Melhore a classe Lista e implemente o método contém,
semelhante ao método contains da classe ArrayList
*/
public class Exercicio1 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");

        System.out.println(lista.contem("A"));
        System.out.println(lista.contem("B"));
        System.out.println(lista.contem("E"));
    }
}

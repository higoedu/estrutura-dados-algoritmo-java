package estruturadadosvetor.labs;

import estruturadadosvetor.Lista;

/*
Melhore a classe Lista e implemente o método remove (T elemento),
onde será possível remover um elemento da lista passando o mesmo como parâmetro
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>(5);

        lista.adiciona("A");
        lista.adiciona("B");
        lista.adiciona("C");
        lista.adiciona("D");
        lista.adiciona("E");

        System.out.println(lista);

        lista.remove("A");

        System.out.println(lista);

        lista.remove("E");

        System.out.println(lista);

        lista.remove("C");

        System.out.println(lista);
    }
}

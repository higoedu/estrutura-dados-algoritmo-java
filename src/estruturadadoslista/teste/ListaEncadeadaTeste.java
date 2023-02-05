package estruturadadoslista.teste;

import estruturadadoslista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);

        System.out.println("Tamanho = " + listaEncadeada.getTamanho());
        System.out.println(listaEncadeada);

        listaEncadeada.adiciona(2);

        System.out.println(listaEncadeada);

        listaEncadeada.adiciona(3);

        System.out.println(listaEncadeada);

        listaEncadeada.limpa();

        System.out.println(listaEncadeada);
    }
}

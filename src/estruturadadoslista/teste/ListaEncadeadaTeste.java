package estruturadadoslista.teste;

import estruturadadoslista.ListaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> listaEncadeada = new ListaEncadeada<>();

        listaEncadeada.adiciona(1);

        System.out.println(listaEncadeada);
    }
}

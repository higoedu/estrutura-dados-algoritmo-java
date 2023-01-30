package estruturadadospilha.labs;

import estruturadadosvetor.Pilha;

/*
Utilize a classe Pilha (criada durante as aulas) e desenvolva os seguintes itens:
1. Crie uma pilha com capacidade para 20 livros;
2. Insira 6 livros na pilha;
Cada livro contém nome, isbn, ano de lançamento e autor.
3. Crie um exemplo para utilizar cada método da classe Pilha.
*/
public class Exercicio3 {
    public static void main(String[] args) {
        Pilha<Livro> pilha = new Pilha<Livro>(20);
        Livro livro1 = new Livro();

        livro1.setNome("Learning JavaScript Data Structures and Algorithms");
        livro1.setAutor("Loiane Groner");
        livro1.setAnoLancamento(2014);
        livro1.setIsbn("1783554878");

        Livro livro2 = new Livro();

        livro2.setNome("Ext Js 4 First Look");
        livro2.setAutor("Loiane Groner");
        livro2.setAnoLancamento(2011);
        livro2.setIsbn("1849516669");

        Livro livro3 = new Livro();

        livro3.setNome("Mastering Ext JS Second Edition");
        livro3.setAutor("Loiane Groner");
        livro3.setAnoLancamento(2015);
        livro3.setIsbn("1784390453");

        Livro livro4 = new Livro();

        livro4.setNome("JavaScript Regular Expressions (English Edition)");
        livro4.setAutor("Loiane Groner");
        livro4.setAnoLancamento(2015);
        livro4.setIsbn("B00YHBVHGO");

        System.out.println("Pilha de livros criado, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Empilhando livros na pilha:");

        pilha.empilha(livro1);
        pilha.empilha(livro2);
        pilha.empilha(livro3);
        pilha.empilha(livro4);

        System.out.println(pilha.tamanho() + " livros foram empilhados:");
        System.out.println(pilha);
        System.out.println("Pilha de livros criado, pilha está vazia? " + pilha.estaVazia());
        System.out.println("Espiando o topo da pilha: " + pilha.topo());
        System.out.println("Desempilahndo livros da pilha:");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando livro: " + pilha.desempilha());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.estaVazia());
    }
}

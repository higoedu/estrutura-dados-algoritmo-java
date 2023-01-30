package estruturadadospilha.labs;

import estruturadadosvetor.Pilha;

import java.util.Stack;

/*
Repita o mesmo processo do exercício anterior,
porém utilizando a classe Stack da API Java.
1. Crie uma pilha com capacidade para 20 livros
2. Insira 6 livros na pilha;
Cada livro contém nome, isbn, ano de lançamento e autor.
3. Crie um exemplo para utilizar cada método da classe Pilha.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<Livro>();
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

        System.out.println("Pilha de livros criado, pilha está vazia? " + pilha.isEmpty());
        System.out.println("Empilhando livros na pilha:");

        pilha.push(livro1);
        pilha.push(livro2);
        pilha.push(livro3);
        pilha.push(livro4);

        System.out.println(pilha.size() + " livros foram empilhados:");
        System.out.println(pilha);
        System.out.println("Pilha de livros criado, pilha está vazia? " + pilha.isEmpty());
        System.out.println("Espiando o topo da pilha: " + pilha.peek());
        System.out.println("Desempilahndo livros da pilha:");

        while (!pilha.isEmpty()){
            System.out.println("Desempilhando livro: " + pilha.pop());
        }

        System.out.println("Todos os livros foram desempilhados, pilha vazia: " + pilha.isEmpty());
    }
}

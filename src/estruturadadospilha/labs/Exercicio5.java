package estruturadadospilha.labs;

import estruturadadosvetor.Pilha;

/*
Escreva um programa que teste se uma sequência de caracteres pelo usuário é um palíndromo,
ou seja, é uma palavra cuja primeira metade é simétrica à segunda metade.
Veja alguns exemplos:
- AABCCBAA - sim
- ADDFDDA - sim
- ABFBB - não
*/
public class Exercicio5 {
    public static void main(String[] args) {
        imprimeResultado("ADA");
        imprimeResultado("ABCD");
        imprimeResultado("ADBCCBA");
        imprimeResultado("Maria");
    }

    public static void imprimeResultado(String palavra){
        System.out.println(palavra + " é palíndromo? " + testaPalindromo(palavra));
    }

    public static boolean testaPalindromo(String palavra){
        Pilha<Character> pilha = new Pilha<Character>();

        for (int i = 0; i < palavra.length(); i++){
            pilha.empilha(palavra.charAt(i));
        }

        String palavraInversa = "";

        while (!pilha.estaVazia()){
            palavraInversa += pilha.desempilha();
        }

        if (palavraInversa.equalsIgnoreCase(palavra)){
            return true;
        }

        return false;
    }
}

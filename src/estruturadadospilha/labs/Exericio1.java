package estruturadadospilha.labs;

import estruturadadosvetor.Pilha;

import java.util.Scanner;

/*
Escreva um programa que leia 10 números.
Para cada número lido,
verifique e codifique de acordo com as regras a seguir:
- Se o número for par, empilhe na pilha;
- Se o número for ímpar, desempilhe um número da pilha.
Caso a pilha esteja vazia,
mostre uma mensagem
- Se ao final do programa a pilha não estiver vazia,
desempilhe todos os elementos,
imprima-os na tela
*/
public class Exericio1 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um número:");

            int numero = scanner.nextInt();

            if(numero % 2 == 0){
                System.out.println("Empilhendo o número " + numero);

                pilha.empilha(numero);
            }
            else {
                Integer desempilhando = pilha.desempilha();

                if(desempilhando == null){
                    System.out.println("Pilha está vazia");
                }
                else {
                    System.out.println("Número ímpar, desempilhando elemento da pilha " + desempilhando);
                }
            }
        }

        System.out.println("Todos os números foram lidos, desempilhando números da pilha");

        while (!pilha.estaVazia()){
            System.out.println("Desempilhando elemento da pilha " + pilha.desempilha());
        }

        System.out.println("todos os elementos foram desempilhados");
    }
}

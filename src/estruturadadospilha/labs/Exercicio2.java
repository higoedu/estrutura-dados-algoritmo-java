package estruturadadospilha.labs;

import estruturadadosvetor.Pilha;

import java.util.Scanner;

/*
Escreva um programa que leia 10 números.
Para cada número lido,
verifique e codifique de acordo com as regras a seguir:
- Se o número for par,
empilhe na pilha chamada par;
- Se o número for ímpar,
empilhe na pilha chamada ímpar;
- Se o número for zero (0),
desempilhe um elemento de cada pilha.
Caso alguma pilha esteja vazia,
mostre uma mensagem de erro na tela.
Ao final do programa desempilhe todos os elementos das duas pilhas,
imprimindo-os na tela
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Pilha<Integer> par = new Pilha<Integer>();
        Pilha<Integer> impar = new Pilha<Integer>();
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 10; i++){
            System.out.println("Entre com um número: ");

            int numero = scanner.nextInt();

            if(numero == 0){
                //pilha par
                Integer desempilhando = par.desempilha();

                if(desempilhando == null){
                    System.out.println("Pilha par vazia");
                }
                else {
                    System.out.println("Desempilhando da pilha par: " + desempilhando);
                }

                //pilha ímpar
                desempilhando = impar.desempilha();

                if(desempilhando == null){
                    System.out.println("Pilha ímpar vazia");
                }
                else {
                    System.out.println("Desempilhando da pilha ímpar: " + desempilhando);
                }
            }
            else if(numero % 2 == 0){
                System.out.println("Número par, empilhando na pilha par " + numero);

                par.empilha(numero);
            }
            else{
                System.out.println("Número ímpar, empilhando na pilha ímpar " + numero);

                impar.empilha(numero);
            }
        }

        System.out.println("Desempilhando todos os número da pilha par");

        while (!par.estaVazia()){
            System.out.println("Desempilhando da pilha par " + par.desempilha());
        }

        System.out.println("Desempilhando todos os número da pilha ímpar");

        while (!impar.estaVazia()){
            System.out.println("Desempilhando da pilha ímpar " + impar.desempilha());
        }
    }
}

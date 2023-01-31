package estruturadadospilha.labs;

import java.util.Stack;

/*
Usando a classe Pilha ou Stack,
desenvolva um algoritmo que resolva o quebra cabeça Torre de Hanoi.
*/
public class Exercicio8 {
    public static void main(String[] args) {
        Stack<Integer> original = new Stack<>();
        Stack<Integer> destino = new Stack<>();
        Stack<Integer> auxiliar = new Stack<>();

        original.push(4);
        original.push(3);
        original.push(2);
        original.push(1);

        torreDeHanoi(original.size(), original, destino, auxiliar);
    }

    public static void torreDeHanoi(int numero, Stack<Integer> original,
                                    Stack<Integer> destino, Stack<Integer> auxiliar) {
        if(numero > 0){
            torreDeHanoi(numero - 1, original, auxiliar, destino);
            destino.push(original.pop());

            System.out.println("---------------");
            System.out.println("Original: " + original);
            System.out.println("Destino: " + destino);
            System.out.println("Auxiliar: " + auxiliar);

            torreDeHanoi(numero - 1, auxiliar, destino, original);
        }
    }
}

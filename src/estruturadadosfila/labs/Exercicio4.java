package estruturadadosfila.labs;

import estruturadadosfila.Fila;

import java.util.Random;

/*
Escreva um programa usando Filas que simule a brincadeira da "Batata Quente".
A brincadeira consiste de um grupo de crianças que fica em círculo, sentados ou em pé.
Uma criança fica fora da roda, de costas ou com os olhos vendados, dizendo a frase:
"Batata quente, quente, quente... queimou!"
Enquanto isso, os demais vão passando a bola de mão em mão até ouvirem a palavra "queimou".
Quem estiver com a bola nesse momento sai da roda. Ganha o último que sobrar.
*/
public class Exercicio4 {
    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<>();

        for(int i = 0; i < 10; i++){
            fila.enfileira(i);
        }

        Random aleatorio = new Random();
        int numero = 0;

        while (numero == 0){
            numero = aleatorio.nextInt(10);
        }

        System.out.println("Número = " + numero);

        while (fila.tamanho() > 1){
            for (int i = 0; i < numero; i++){
                fila.enfileira(fila.desenfileira());
            }

            System.out.println("Eliminando = " + fila.desenfileira());
        }

        System.out.println("Ganhador: " + fila.desenfileira());
    }
}

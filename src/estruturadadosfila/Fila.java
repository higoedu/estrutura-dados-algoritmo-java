package estruturadadosfila;

import estruturadadosvetor.EstruturaEstatica;
//Filas - Queues
public class Fila<T> extends EstruturaEstatica<T> {
    public Fila(){
        super();
    }

    public Fila(int capacidade){
        super(capacidade);
    }

    public void enfileira(T elemento){
        //this.elementos[this.tamanho] = elemento;
        //this.tamanho++;

        //this.elementos[this.tamanho++] = elemento;

        this.adiciona(elemento);
    }

    public T espiar(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[0];
    }

    public T desenfileira(){
        final int POSICAO = 0;

        if(this.estaVazia()){
            return null;
        }

        T elementoASerRemovido = this.elementos[POSICAO];

        this.remove(POSICAO);
        /*
        for(int i = POSICAO; i < tamanho - 1; i++){
            elementos[i] = elementos[i + 1];
        }

        tamanho++;
        */

        return elementoASerRemovido;
    }
}

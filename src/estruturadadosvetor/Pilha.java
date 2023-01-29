package estruturadadosvetor;

/*
comportamento de uma pilha
LIFO
Last In First Out
Último a entrar, primeiro a sair
*/
public class Pilha<T> extends EstruturaEstatica<T> {
    public Pilha(){
        super();
    }

    public Pilha(int capacidade){
        super(capacidade);
    }

    public void empilha(T elemento){
        //this.aumentaCapacidade();
        //this.elementos[tamanho++] = elemento;
        //tamanho++;
        super.adiciona(elemento);
    }

    public T topo(){
        if(this.estaVazia()){
            return null;
        }

        return this.elementos[tamanho - 1];
    }

    public T desempilha(){
        if(this.estaVazia()){
            return null;
        }

        /*
        T elemento = this.elementos[tamanho - 1];

        tamanho--;

        return elemento;
        */

        return this.elementos[--tamanho];
    }
}

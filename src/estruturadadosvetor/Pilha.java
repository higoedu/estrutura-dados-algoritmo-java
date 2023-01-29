package estruturadadosvetor;

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
}

package estruturadadoslista;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho = 0;

    public void adiciona(T elemento){
        No<T> celula = new No<T>(elemento);

        if(this.tamanho == 0){
            this.inicio = celula;
        }
        else {
            this.ultimo.setProximo(celula);
        }

        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho(){
        return this.tamanho;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("[");

        //[1, 2, 3, 4,]
        if(this.tamanho == 0){
            return "[]";
        }

        //stringBuilder.append("ListaEncadeada [inicio=").append(inicio).append("]");

        No<T> atual = this.inicio;

        for(int i = 0; i < this.tamanho - 1; i++){
            stringBuilder.append(atual.getElemento()).append(", ");

            atual = atual.getProximo();
        }

        stringBuilder.append(atual.getElemento()).append("]");

        /*
        stringBuilder.append(atual.getElemento()).append(", ");

        while (atual.getProximo() != null){
            atual = atual.getProximo();

            stringBuilder.append(atual.getElemento()).append(", ");
        }
        */

        return stringBuilder.toString();
    }
}

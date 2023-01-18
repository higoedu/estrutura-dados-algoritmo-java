package estruturadadosvetor;

import java.lang.reflect.Array;

/*
- definir tipo de vetor dinamicamente
*/
//generics
//class Type T
//classe genérica, que vai comportar elementos do mesmo tipo
public class Lista<T> {
    private T[] elementos;

    //controla o tamanho real do vetor
    private int tamanho;

    //construtor
    public Lista(int capacidade){
        //atributo elemento foi instanciado e teve 5 posições
        this.elementos = (T[]) new Object[capacidade];//solução livro effective Java
        this.tamanho = 0;
    }

    public Lista(int capacidade, Class<T> tipoClasse){
        //atributo elemento foi instanciado e teve 5 posições
        //reflection
        this.elementos = (T[]) Array.newInstance(tipoClasse, capacidade);
        this.tamanho = 0;
    }

    /*
    retorna um booleano
    (opção 3)
    não gera exceção
    */
    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    /*
    fazer overloaging
    sobrecarregar o método adiciona
    modificando a sua assinatura
    0 1 2 3 4 5 6 = tamanho é 5
    B C E F G + +
    */
    public boolean adiciona(int posicao, T elemento) {
        //verifica se a posição é válida
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();

        //lógica para mover todos os elementos
        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
            for(int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public T busca(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            //tipo de argumentos inválidos
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    /*
    sobreescrever o método busca
    mofificando a assinatura do método
    */
    //public boolean busca(String elemento){
    public int busca(T elemento){
        //verifica se o elemento existe ou não
        //algoritmo de busca sequencial
        for(int i = 0; i < this.tamanho; i++){
            if(this.elementos[i].equals(elemento)){
                //return true;
                return i;
            }
        }
        //return false;
        return -1;
    }

    public boolean contem(T elemento){
        /*
        int pos = busca(elemento);
        if(pos > -1){
            return true;
        }
        return false;
        */
        return busca(elemento) > -1;//>=0
    }

    //B G D E F -> posição a ser removida é 1 (G)
    //0 1 2 3 4 -> tamanho é 5
    //vetor[1] = vetor[2]
    //vetor[2] = vetor[3]
    //vetor[3] = vetor[4]
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for(int i = 0; i < this.tamanho - 1; i++){
            this.elementos[i] = this.elementos[i + 1];
        }
        this.tamanho--;
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){
        //deixa o código mais eficiente
        StringBuilder s = new StringBuilder();

        //String s = "[";
        s.append("[");

        for(int i = 0; i < this.tamanho - 1; i++){
            //s += this.elementos[i];
            s.append(this.elementos[i]);
            //s += ", ";
            s.append(", ");
        }

        if(this.tamanho() > 0){
            //s += this.elementos[this.tamanho - 1];
            s.append(this.elementos[this.tamanho - 1]);
        }

        //s += "]";
        s.append("]");

        //return Arrays.toString(elementos);
        return s.toString();
    }
}

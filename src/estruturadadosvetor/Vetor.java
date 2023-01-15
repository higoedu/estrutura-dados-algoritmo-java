package estruturadadosvetor;

import java.util.Arrays;

/*
um vetor (ou array) é a estrutura de dados mais simples que existe
um vetor armazena uma sequência de valores onde todos são do mesmo tipo

- criou a classe vetor
- criou um construtor, para poder inicializar o vetor

- criou método para adicionar um elemento

- adicionou o tamanho
- inicializou o tamanho no construtor
- criou método adicionar (opção 2)
- criou método adicionar (opção 3)

- obter elemento de uma determinada posição

- descobrir ou verificar se um determinado elemento existe no vetor
*/
public class Vetor {
    private String[] elementos;

    //controla o tamanho real do vetor
    private int tamanho;

    //construtor
    public Vetor(int capacidade){
        //atributo elemento foi instanciado e teve 5 posições
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    //adicionar um elemento no final do vetor
    /*
    public void adiciona(String elemento){
        for(int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
    */

    /*
    precisa adicionar o throw exception na assinatura do método
    (opção 2)
    dispara exceção
    */
    /*
    public void adiciona(String elemento) throws Exception {
        //verifica se o tamanho é menor que a capacidade do vetor de elementos
        //se sim, consigo adicionar mais elementos no vetor
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
        else {
            //dispara uma exceção
            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
        }
    }
    */

    /*
    retorna um booleano
    (opção 3)
    não gera exceção
    */
    public boolean adiciona(String elemento) {
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
    public boolean adiciona(int posicao, String elemento) {
        //verifica se a posição é válida
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        //lógica para mover todos os elementos
        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;

        return true;
    }

    /*
    public void adiciona(int posicao, String elemento) {
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }

        this.elementos[posicao] = elemento;
        this.tamanho++;
    }
    */

    public String busca(int posicao){
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
    public int busca(String elemento){
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

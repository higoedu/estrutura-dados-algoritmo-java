package estruturadadosvetor;
/*
um vetor (ou array) é a estrutura de dados mais simples que existe
um vetor armazena uma sequência de valores onde todos são do mesmo tipo
*/
public class Vetor {
    private String[] elementos;
    //construtor
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
    }
}

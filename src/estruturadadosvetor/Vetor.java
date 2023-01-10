package estruturadadosvetor;
/*
um vetor (ou array) é a estrutura de dados mais simples que existe
um vetor armazena uma sequência de valores onde todos são do mesmo tipo

- criou a classe vetor
- criou um construtor, para poder inicializar o vetor
*/
public class Vetor {
    private String[] elementos;
    //construtor
    public Vetor(int capacidade){
        //atributo elemento foi instanciado e teve 5 posições
        this.elementos = new String[capacidade];
    }
}

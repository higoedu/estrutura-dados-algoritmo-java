package estruturadadosvetor;
/*
um vetor (ou array) é a estrutura de dados mais simples que existe
um vetor armazena uma sequência de valores onde todos são do mesmo tipo

- criou a classe vetor
- criou um construtor, para poder inicializar o vetor

- criou método para adicionar um elemento
*/
public class Vetor {
    private String[] elementos;
    //construtor
    public Vetor(int capacidade){
        //atributo elemento foi instanciado e teve 5 posições
        this.elementos = new String[capacidade];
    }

    //adicionar um elemento no final do vetor
    public void adiciona(String elemento){
        for(int i = 0; i < this.elementos.length; i++){
            if(this.elementos[i] == null){
                this.elementos[i] = elemento;
                break;
            }
        }
    }
}

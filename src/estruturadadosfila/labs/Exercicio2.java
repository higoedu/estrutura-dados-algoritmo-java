package estruturadadosfila.labs;

import estruturadadosfila.Fila;

/*
Escreva um programa que simule a distribuição de senhas de atendimento a um grupo de pessoas.
Cada pessoa pode receber uma senha prioritária ou uma senha normal.
O progrma deve obedecer os seguintes critérios:
- Existe apenas 1 atendente;
- 1 pessoa com senha normal deve ser atendida a cada 3 pessoas com senha prioritária;
- Não havenoo prioridades, as pessoas com senha normal podem ser atendidas.
*/
public class Exercicio2 {
    public static void main(String[] args) {
        Fila<String> regular = new Fila<>();
        Fila<String> prioridade = new Fila<>();

        final int MAXIMA_PRIORIDADE = 3;

        regular.enfileira("Pessoa 1");
        regular.enfileira("Pessoa 2");
        regular.enfileira("Pessoa 3");
        prioridade.enfileira("Pessoa 1P");
        prioridade.enfileira("Pessoa 2P");
        prioridade.enfileira("Pessoa 3P");
        prioridade.enfileira("Pessoa 4P");
        prioridade.enfileira("Pessoa 5P");
        regular.enfileira("Pessoa 4");
        regular.enfileira("Pessoa 5");
        regular.enfileira("Pessoa 6");
        regular.enfileira("Pessoa 7");
        regular.enfileira("Pessoa 8");

        while (!regular.estaVazia() || !prioridade.estaVazia()){

            int contador = 0;

            while (!prioridade.estaVazia() && contador < MAXIMA_PRIORIDADE){
                atendePessoa(prioridade);

                contador++;
            }

            if(!regular.estaVazia()){
                atendePessoa(regular);
            }

            if(prioridade.estaVazia()){
                while (!regular.estaVazia()){
                    atendePessoa(regular);
                }
            }
        }
    }

    public static void atendePessoa(Fila<String> fila) {
        String pessoaAtendida = fila.desenfileira();

        System.out.println(pessoaAtendida + " foi atendida.");
    }
}

package estruturadadosfila.labs;

import estruturadadosfila.Fila;
/*
Usando a estrutura de dados Fila,
crie uma fila de documentos que precisam ser impressos.
Cada documento é composto de nome e quantidade de folhas a serem impressas.
O programa deve:
Enfileirar os documentos;
E seguindo a ordem, o programa deve "imprimir" cada documento,
desenfilierando da fila.
Se desejar pode usar Threads para esperar a impressão de acordo com o número de folhas a serem impressas.
*/
public class Exercicio1 {
    public static void main(String[] args) {
        Fila<Documento> filaImpressora = new Fila<>();

        filaImpressora.enfileira(new Documento("A", 1));
        filaImpressora.enfileira(new Documento("B", 2));
        filaImpressora.enfileira(new Documento("C", 3));
        filaImpressora.enfileira(new Documento("D", 7));
        filaImpressora.enfileira(new Documento("E", 9));

        while (!filaImpressora.estaVazia()){
            Documento documento = filaImpressora.desenfileira();

            System.out.println("Imprimindo documento " + documento.getNome());

            try {
                Thread.sleep(200 * documento.getNumeroFolhas());
            }
            catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        }

        System.out.println("todos os documentos foram impressos.");
    }
}

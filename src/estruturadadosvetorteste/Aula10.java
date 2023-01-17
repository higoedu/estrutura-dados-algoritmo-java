package estruturadadosvetorteste;

import estruturadadosvetor.VetorObjetos;

public class Aula10 {
    public static void main(String[] args) {
        VetorObjetos vetorObjetos = new VetorObjetos(3);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");
        Contato c2 = new Contato("Contato 2", "2345-6789", "contato2@email.com");
        Contato c3 = new Contato("Contato 3", "3456-7890", "contato3@email.com");
        Contato c4 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetorObjetos.adiciona(c1);
        vetorObjetos.adiciona(c2);
        vetorObjetos.adiciona(c3);

        System.out.println("Tamanho = " + vetorObjetos.tamanho());

        int pos = vetorObjetos.busca(c1);
        if(pos > -1){
            System.out.println("Elemento existe no vetor");
        }
        else{
            System.out.println("Elemento não existe no vetor");
        }

        System.out.println(vetorObjetos);
    }
}

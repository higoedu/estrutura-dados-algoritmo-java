package estruturadadosvetorteste;

import estruturadadosvetor.Lista;
import estruturadadosvetor.VetorObjetos;
public class Aula11 {
    public static void main(String[] args) {
        /*
        VetorObjetos vetorObjetos = new VetorObjetos(2);

        vetorObjetos.adiciona(1);
        vetorObjetos.adiciona("Elemento do tipo string");

        System.out.println(vetorObjetos);
         */
        //Lista<String> vetor = new Lista<String>(1);

        //vetor.adiciona("Elemento");

        Lista<Contato> vetor = new Lista<Contato>(1);

        Contato c1 = new Contato("Contato 1", "1234-4567", "contato1@email.com");

        vetor.adiciona(c1);
    }
}

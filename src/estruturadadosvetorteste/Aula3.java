package estruturadadosvetorteste;

import estruturadadosvetor.Vetor;

public class Aula3 {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(2);

        /*
        (opção 2)
        try {
            vetor.adiciona("elemento 1");
            vetor.adiciona("elemento 2");
            vetor.adiciona("elemento 3");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        */

        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
    }
}

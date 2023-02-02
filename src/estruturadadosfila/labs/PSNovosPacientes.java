package estruturadadosfila.labs;

import estruturadadosfila.FilaComPrioridade;

import java.util.Random;

public class PSNovosPacientes implements Runnable{
    private FilaComPrioridade<Pessoa> fila;
    private int contador = 7;
    private Random prioridade = new Random();

    public PSNovosPacientes(FilaComPrioridade<Pessoa> fila) {
        super();
        this.fila = fila;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8; i++){
            try {
                Thread.sleep(8000);
                Pessoa pessoa = new Pessoa("" + contador, prioridade.nextInt(3));

                fila.enfileira(pessoa);
                contador++;

                System.out.println(pessoa + " enfileirada.");
            }
            catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        }
    }
}

package estruturadadosfila.teste;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Aula25 {
    public static void main(String[] args) {
        /*
        Queue<Integer> filaComProioridade = new PriorityQueue<Integer>();

        filaComProioridade.add(2);
        filaComProioridade.add(1);
        */
        Queue<Paciente> filaComProioridade = new PriorityQueue<>(
                new Comparator<Paciente>() {
                    @Override
                    public int compare(Paciente o1, Paciente o2) {
                        /*
                        if(o1.getPrioridade() > o2.getPrioridade()){
                            return 1;
                        } else if (o1.getPrioridade() < o2.getPrioridade()){
                            return -1;
                        }
                        return 0;
                        */
                        return Integer.valueOf(o1.getPrioridade()).compareTo(o2.getPrioridade());
                    }
                }
        );

        filaComProioridade.add(new Paciente("A",2));
        filaComProioridade.add(new Paciente("B",1));

        System.out.println(filaComProioridade);
    }
}

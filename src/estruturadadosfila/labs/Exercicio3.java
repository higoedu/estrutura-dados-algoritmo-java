package estruturadadosfila.labs;

import estruturadadosfila.FilaComPrioridade;

/*
Utilize a classe Fila para simular um sistema de senhas de um pronto Socorro.
Cada pessoa pode ser classificada com 3 códigos: vermelho - de prioridade maior,
amarelo - prioridade média e verde - quando a simulação não é grave e a pessoa pode esperar mais tempo.
O programa deve obedecer às seguintes condições:
Enfileire 6 pessoa na fila inicial.
Pessoas com prioridade vermelha devem ser atendidas primeiro;
Cada consulta dura cerca de 5 segundos, e depois o próximo da fila é chamado.
A cada 4 segundos, uma pessoa chega no pronto socorro com prioridade aleatória
(crie um código java para criar a aleatoriedade).
*/
public class Exercicio3 {
    public static final int VERDE = 2;
    public static final int AMARELO = 1;
    public static final int VERMELHO = 0;

    public static void main(String[] args) {
        FilaComPrioridade<Pessoa> fila = new FilaComPrioridade<>();

        fila.enfileira(new Pessoa("1", VERDE));
        fila.enfileira(new Pessoa("2", AMARELO));
        fila.enfileira(new Pessoa("3", VERMELHO));
        fila.enfileira(new Pessoa("4", VERDE));
        fila.enfileira(new Pessoa("5", VERDE));
        fila.enfileira(new Pessoa("6", VERMELHO));

        PSAtendimento atendimento = new PSAtendimento(fila);
        PSNovosPacientes pacientes = new PSNovosPacientes(fila);
        Thread t1 = new Thread(atendimento);
        Thread t2 = new Thread(pacientes);

        t1.start();
        t2.start();
    }
}

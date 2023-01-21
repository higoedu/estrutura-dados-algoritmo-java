package estruturadadosvetor.labs;

import estruturadadosvetor.Lista;
import estruturadadosvetorteste.Contato;

import java.lang.invoke.StringConcatException;
import java.util.Scanner;

/*
Ulitize a classe Lista ou Vetor e classe Contato (criada durante as aulas) e desenvolva os seguintes itens:
1. Crie um vetor com capacidade para 20 contatos;
2. Insira 30 contatos no vetor (isso é possível ser feito através de um loop);
Crie um exemplo para utilizar cada método da classe Lista;
*/
public class Exercicio6 {
    public static void main(String[] args) {
        //criação das variáveis
        Scanner scanner = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        Lista<Contato> lista = new Lista<Contato>(20);

        //criar e adicionar 30 contatos
        criarContatosDinamicamente(5, lista);

        //criar um menu para que o usuário escolha a opção
        int opcao = 1;
        while (opcao != 0) {
            opcao = obterOpcaoMenu(scanner);

            switch (opcao){
                case 1:
                    adicionarContatoFinal(scanner, lista);
                    break;
                case 2:
                    adicionarContatoPosicao(scanner, lista);
                    break;
                case 3:
                    obtemContatoPosicao(scanner, lista);
                    break;
                case 4:
                    obtemContato(scanner, lista);
                    break;
                case 5:
                    pesquisarUltimoIndice(scanner, lista);
                    break;
                case 6:
                    pesquisarContatoExiste(scanner, lista);
                    break;
                case 7:
                    excluirPorPosicao(scanner, lista);
                    break;
                case  8:
                    excluirContato(scanner, lista);
                    break;
                case 9:
                    imprimeTamanhoVetor(lista);
                    break;
                case 10:
                    limparVetor(lista);
                    break;
                case 11:
                    imprimirVetor(lista);
                default:

                    break;
            }
        }

        System.out.println("Usuário digitou 0, programa terminado");
    }

    private static void imprimirVetor(Lista<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(Lista<Contato> lista) {
        lista.limpar();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(Lista<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.tamanho());
    }

    private static void excluirContato(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try{
            Contato contato = lista.busca(posicao);

            lista.remove(contato);

            System.out.println("Contato excluído");
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try{
            lista.remove(posicao);

            System.out.println("Contato excluído");
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.busca(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);

            boolean existe = lista.contem(contato);

            if(existe){
                System.out.println("Contato existe, seguem dados");
                System.out.println(contato);
            }
            else {
                System.out.println("Contato não existe");
            }
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarUltimoIndice(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.busca(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado");

            lista.ultimoIndice(contato);

            System.out.println("Contato encontrado na posição " + posicao);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.busca(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado");

            lista.busca(contato);

            System.out.println("Contato encontrado na posição " + posicao);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.busca(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.adiciona(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, Lista<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", scanner);

        try {
            lista.adiciona(posicao, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        }
        catch (Exception exception){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static String leInformacao(String mensagem, Scanner scanner) {
        System.out.println(mensagem);

        String entrada = scanner.nextLine();

        return entrada;
    }

    private static int leInformacaoInt(String mensagem, Scanner scanner) {
        boolean entradaValida = false;
        int numero = 0;

        while (!entradaValida){
            try {
                System.out.println(mensagem);

                String entrada = scanner.nextLine();
                numero = Integer.parseInt(entrada);

                entradaValida = true;
            }
            catch (Exception exception){
                System.out.println("Entrada inválida, digite novamente");
            }
        }

        return numero;
    }

    private static int obterOpcaoMenu(Scanner scanner) {
        boolean entradaValida = false;
        String entrada;
        int opcao = 0;

        while (!entradaValida){
            System.out.println("Digite a opção desejada");
            System.out.println("1: Adiciona contato no final do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Obtem contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último índice do contato");
            System.out.println("6: Verifica se contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Excluir todos os contatos do vetor");
            System.out.println("11: Imprime vetor");
            System.out.println("0: Sair");

            try{
                entrada = scanner.nextLine();
                opcao = Integer.parseInt(entrada);

                if(opcao >= 0 && opcao <= 11){
                    entradaValida = true;
                }
                else{
                    throw new Exception();
                }
            }
            catch (Exception exception){
                System.out.println("Entrada inválida, digite novamente\n\n");
            }
        }

        return opcao;
    }

    private static void criarContatosDinamicamente(int quantidade, Lista<Contato> lista) {
        Contato contato = new Contato();
        for(int i = 1; i <= quantidade; i++){
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111 " + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.adiciona(contato);
        }
    }
}

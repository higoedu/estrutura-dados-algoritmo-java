package estruturadadosvetor.labs;

import estruturadadosvetorteste.Contato;

import java.util.ArrayList;
import java.util.Scanner;
/*
Utilize a classe ArrayList e desenvolva os seguintes itens:
1. Crie uma lista utilizando a classe ArrayList da API do Java;
2. Passe todos os contatos do vetor para o ArrayList;
3. Crie um exemplo para utilizar cada método da classe ArrayList
(somente os métodos que implementamos de forma similar na classe Lista);
*/
public class Exercicio7 extends Exercicio6{
    public static void main(String[] args) {
        //criação das variáveis
        Scanner scanner = new Scanner(System.in);

        //criar vetor com 20 de capacidade
        ArrayList<Contato> lista = new ArrayList<Contato>(20);

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

    private static void imprimirVetor(ArrayList<Contato> lista) {
        System.out.println(lista);
    }

    private static void limparVetor(ArrayList<Contato> lista) {
        lista.clear();

        System.out.println("Todos os contatos do vetor foram excluídos");
    }

    private static void imprimeTamanhoVetor(ArrayList<Contato> lista) {
        System.out.println("Tamanho do vetor é de: " + lista.size());
    }

    private static void excluirContato(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try{
            Contato contato = lista.get(posicao);

            lista.remove(contato);

            System.out.println("Contato excluído");
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void excluirPorPosicao(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser removida", scanner);

        try{
            lista.remove(posicao);

            System.out.println("Contato excluído");
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void pesquisarContatoExiste(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.get(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);

            boolean existe = lista.contains(contato);

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

    private static void pesquisarUltimoIndice(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.get(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do último índice do contato encontrado");

            lista.lastIndexOf(contato);

            System.out.println("Contato encontrado na posição " + posicao);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContato(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.get(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
            System.out.println("Fazendo pesquisa do contato encontrado");

            lista.indexOf(contato);

            System.out.println("Contato encontrado na posição " + posicao);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void obtemContatoPosicao(Scanner scanner, ArrayList<Contato> lista) {
        int posicao = leInformacaoInt("Entre com a posição a ser pesquisada", scanner);

        try{
            Contato contato = lista.get(posicao);

            System.out.println("Contato existe, seguem dados");
            System.out.println(contato);
        }
        catch (Exception exception){
            System.out.println("Posição inválida!");
        }
    }

    private static void adicionarContatoFinal(Scanner scanner, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefone, email);

        lista.add(contato);

        System.out.println("Contato adicionado com sucesso!");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner scanner, ArrayList<Contato> lista) {
        System.out.println("Criando um contato, entre com as informações:");

        String nome = leInformacao("Entre com o nome", scanner);
        String telefone = leInformacao("Entre com o telefone", scanner);
        String email = leInformacao("Entre com o email", scanner);

        Contato contato = new Contato(nome, telefone, email);

        int posicao = leInformacaoInt("Entre com a posição a adicionar o contato", scanner);

        try {
            lista.add(posicao, contato);

            System.out.println("Contato adicionado com sucesso!");
            System.out.println(contato);
        }
        catch (Exception exception){
            System.out.println("Posição inválida, contato não adicionado");
        }
    }

    private static void criarContatosDinamicamente(int quantidade, ArrayList<Contato> lista) {
        Contato contato = new Contato();
        for(int i = 1; i <= quantidade; i++){
            contato.setNome("Contato " + i);
            contato.setTelefone("1111111 " + i);
            contato.setEmail("contato" + i + "@email.com");

            lista.add(contato);
        }
    }
}

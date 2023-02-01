package estruturadadosfila.labs;

public class Documento {
    private String nome;
    private int numeroFolhas;

    public Documento(String nome, int numeroFolhas){
        super();
        this.nome = nome;
        this.numeroFolhas = numeroFolhas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFolhas() {
        return numeroFolhas;
    }

    public void setNumeroFolhas(int numeroFolhas) {
        this.numeroFolhas = numeroFolhas;
    }
}

package graph;

public class Vertice implements Comparable<Vertice> {

    private String nome;

    public Vertice(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return this.getNome();
    }

    public int compareTo(Vertice vertice) {
        return this.getNome().compareTo(vertice.getNome());
    }

}

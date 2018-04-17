package graph;

public class Vertice implements Comparable<Vertice> {

    private String nome;
    private boolean visit;

    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }
    
    

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

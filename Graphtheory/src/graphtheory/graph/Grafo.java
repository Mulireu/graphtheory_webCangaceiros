package graph;

import java.util.HashSet;
import java.util.Set;

import graph.interfaces.IGrafo;
import java.util.Stack;


public class Grafo implements IGrafo {

    private Set<Vertice> vertices = new HashSet<Vertice>();
    private Set<Aresta> arestas = new HashSet<Aresta>();

    public Grafo(Set<Vertice> vertices, Set<Aresta> arestas) {
        this.vertices = vertices;
        this.arestas = arestas;
    }

    @Override
    public boolean ehCompleto() {
        for (Vertice vertice: this.vertices){
        if (getAdjacentes(vertice).size() == vertices.size() - 1) {
            
        }else
        return false;
    }
        return true;
}
    @Override
    public Set<Vertice> getAdjacentes(Vertice v) {
        Set<Vertice> adjacentes = new HashSet<Vertice>();

        for(Aresta aresta: this.arestas) {
            if(aresta.getA().equals(v)) {
                adjacentes.add(aresta.getB());
            }

            if(aresta.getB().equals(v)) {
                adjacentes.add(aresta.getA());
            }
        }
        return adjacentes;

    }

    @Override
    public boolean ehConexo() {
        for(Vertice vertice: vertices){
            if(getAdjacentes(vertice).isEmpty()){
       
    }else
        return true;
    }
    return false;
}    
    
    @Override
    public boolean ehRegular() {
        for(Vertice verticeA: vertices){
            for(Vertice verticeB: vertices){
                if(getAdjacentes(verticeA).size() == getAdjacentes(verticeB).size()){
                
                }else
                    return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {

        String retorno = "";

        for(Vertice v: vertices) {
            retorno += v.toString() + "[ ";

            Set<Vertice> adjacentes = this.getAdjacentes(v);

            for(Vertice adj: adjacentes) {
                retorno += adj.toString() + " ";
            }

            retorno += "]\n";


        }

        return retorno;
    }


}

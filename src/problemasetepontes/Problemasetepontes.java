package problemasetepontes;

public class Problemasetepontes {

    
    public static void main(String[] args) {
         Grafo grafo = new Grafo();
        
        grafo.adicionarBairro("A");
        grafo.adicionarBairro("B");
        grafo.adicionarBairro("C");
        grafo.adicionarBairro("D");
        
        grafo.adicionarPonte("A", "B");
        grafo.adicionarPonte("A", "C");
        grafo.adicionarPonte("B", "C");
        grafo.adicionarPonte("C", "D");
        
        grafo.encontrarCaminho();
    }
}
      

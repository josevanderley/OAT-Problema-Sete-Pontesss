package problemasetepontes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Grafo {
    public final Map<String, List<String>> adjacencias;

    public Grafo() {
        this.adjacencias = new HashMap<>();
    }

    public void adicionarBairro(String bairro) {
        adjacencias.put(bairro, new ArrayList<>());
    }

    public void adicionarPonte(String bairroOrigem, String bairroDestino) {
        adjacencias.get(bairroOrigem).add(bairroDestino);
        adjacencias.get(bairroDestino).add(bairroOrigem);
    }

    public void encontrarCaminho() {
        List<String> caminho = new ArrayList<>();
        List<String> todosBairros = new ArrayList<>(adjacencias.keySet());

        dfs(todosBairros.get(0), caminho);

       
        MatrizAdjacencia.imprimirMatriz(todosBairros, adjacencias);

        
        InformacoesViagem.imprimirCaminho(caminho);
        InformacoesViagem.imprimirQuantidadePassos(caminho);
    }

    public void dfs(String bairro, List<String> caminho) {
        List<String> pontes = adjacencias.get(bairro);

        for (int i = 0; i < pontes.size(); i++) {
            String destino = pontes.get(i);
            pontes.remove(i);
            adjacencias.get(destino).remove(bairro);

            dfs(destino, caminho);
        }

        caminho.add(bairro);
    }
}


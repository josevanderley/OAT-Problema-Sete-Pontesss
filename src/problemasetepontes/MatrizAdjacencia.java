package problemasetepontes;

import java.util.List;
import java.util.Map;

public class MatrizAdjacencia {

    public static void imprimirMatriz(List<String> todosBairros, Map<String, List<String>> adjacencias) {
        System.out.println("Matriz de Adjacência:");
        for (String origem : todosBairros) {
            for (String destino : todosBairros) {
                if (adjacencias.get(origem).contains(destino)) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

package problemasetepontes;

import java.util.List;

public class InformacoesViagem {

    public static void imprimirCaminho(List<String> caminho) {
        System.out.println("Caminho: " + caminho);
    }

    public static void imprimirQuantidadePassos(List<String> caminho) {
        System.out.println("Quantidade total de passos realizados: " + caminho.size());
    }
}

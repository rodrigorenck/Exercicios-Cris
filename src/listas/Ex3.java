package listas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Ordenar a lista [ 10, 15, 6, 12, 90, 800, 1, 25, 400, 2, 9, 2] de forma decrescente
 */
public class Ex3 {
    public static void main(String[] args) {
        List<Integer> listaOriginal = Arrays.asList(10, 15, 6, 12, 90, 800, 1, 25, 400, 2, 9, 2);

        listaOriginal.sort((numero1, numero2) -> numero1.compareTo(numero2)*-1);

        System.out.println(listaOriginal);
    }
}

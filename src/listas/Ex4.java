package listas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Ordenar a lista [PEDRO, ANA, LUCAS, MARIA, TALITA, JHONSON, AMANDA, JOICE, MARIO, CARLOS, JENIFER] na ordem alfabética
 */
public class Ex4 {
    public static void main(String[] args) {
        List<String> listaOriginal = Arrays.asList("PEDRO", "ANA", "LUCAS", "MARIA", "TALITA", "JHONSON", "AMANDA", "JOICE", "MARIO", "CARLOS", "JENNIFER");

        listaOriginal.sort(Comparator.naturalOrder());

        System.out.println(listaOriginal);
    }
}

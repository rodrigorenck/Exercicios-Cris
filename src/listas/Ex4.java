package listas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex4 {

    public static void main(String[] args) {
        List<String> listaOriginal = Arrays.asList("PEDRO", "ANA", "LUCAS", "MARIA", "TALITA", "JHONSON", "AMANDA", "JOICE", "MARIO", "CARLOS", "JENNIFER");

        listaOriginal.sort(Comparator.naturalOrder());

        System.out.println(listaOriginal);
    }
}

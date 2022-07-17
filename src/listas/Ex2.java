package listas;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Em uma lista contendo os seguintes nome [PEDRO, ANA, LUCAS, MARIA, TALITA, JHONSON, AMANDA, JOICE, MARIO, CARLOS, JENIFER]
 * você deve separar os nomes em duas listas on, uma lista contém os nome que iniciam com vogais e a outra contém os nomes que iniciam com consoantes.
 */
public class Ex2 {

    public static void main(String[] args) {
        //lista imutavel
        List<String> listaOriginal = Arrays.asList("PEDRO", "ANA", "LUCAS", "MARIA", "TALITA", "JHONSON", "AMANDA", "JOICE", "MARIO", "CARLOS", "JENNIFER");

        //aqui criamos o nosso filtro
        Predicate<String> predicado = (nome) -> nome.startsWith("A") || nome.startsWith("E") || nome.startsWith("I") || nome.startsWith("O") || nome.startsWith("U");


        List<String> listaVogais = listaOriginal.stream()
                .filter(predicado)
                .collect(Collectors.toList());


        //lista mutavel
        List<String> listaConsoantes = new ArrayList<>(listaOriginal);
        listaConsoantes.removeAll(listaVogais);

        System.out.println("[LISTA VOGAIS]");
        System.out.println(listaVogais);

        System.out.println();

        System.out.println("[LISTA CONSOANTES]");
        System.out.println(listaConsoantes);
    }

}


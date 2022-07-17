package listas;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Foi selecionado algumas frases de um livro e gostaríamos de saber quais destas frases são palíndromos.
 *
 * 	FRASES
 *
 * A base do teto desaba
 * A batata e o tabaco
 * Acuda cadela da Leda caduca
 * Vida vivida
 * Anotaram a data da maratona
 * A torre da derrota
 * A casa esta casada
 * O galo ama o lago
 * Oito Morros Altos
 */
public class Ex1 {

    public static boolean verificaPalindroma(String frase){
        String fraseMinuscula = frase.toLowerCase();
        String tudoJunto = fraseMinuscula.replaceAll(" " , "");
        String aoContrario = "";
        for(int i = tudoJunto.length() - 1; i>=0; i--){
            aoContrario += tudoJunto.charAt(i);
        }
        if(aoContrario.equals(tudoJunto)){
            return true;
        }
        return false;
    }


    public static void main(String[] args) {

        List<String> frases = Arrays.asList("A base do teto desaba", "A batata e o tabaco", "Acuda cadela da Leda caduca",
                "Vida vivida", "Anotaram a data da maratona", "A torre da derrota", "A casa esta casada", "O galo ama o lago",
                "Oito Morros Altos");


        //Aqui criamos um Map de frases true ou false para o nosso metodo
        Map<Boolean, List<String>> collect = frases.stream()
                .collect(Collectors.groupingBy(s -> verificaPalindroma(s)));

        List<List<String>> frasesPalindromas = Arrays.asList(collect.get(true));
        List<String> listPalindromas = frasesPalindromas.get(0);


        System.out.println("[FRASES PALINDROMAS]");
        listPalindromas.forEach(System.out::println);

        System.out.println();

        List<List<String>> frasesNaoPalindromas = Arrays.asList(collect.get(false));
        List<String> listNaoPalindromas = frasesNaoPalindromas.get(0);


        System.out.println("[FRASES NAO PALINDROMAS]");;
        listNaoPalindromas.forEach(System.out::println);


    }
}

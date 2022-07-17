package loops.e1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Ex1 {

    public static void main(String[] args) {

        List<Integer> listaDivisiveis = new ArrayList<>();

        for(int i = 0; i<=5000; i++){
            if(i%5==0){
                listaDivisiveis.add(i);
            }
        }

        long count = listaDivisiveis.stream()
                .count();


        Optional<Integer> max = listaDivisiveis.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Numero de valores divisiveis por 5 entre 0 e 5000: " + count);

        System.out.println("O maior valor é: " + max.get());



    }
}

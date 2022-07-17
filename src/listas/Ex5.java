package listas;

import java.sql.Array;
import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex5 {


    public static int acharPosicaoDeCaracter(List<String> list, String caracter){
        for(int i = 0; i<list.size();i++){
            if(list.get(i).equals(caracter)) return i;
        }
        return -1;
    }

    public static void main(String[] args) throws FileNotFoundException {
        //criamos nossa lista inicial a partir de um arquivo com as letras em ordem alfabetica
        try (BufferedReader br = new BufferedReader(new FileReader("alfabeto.txt"))) {
            ArrayList<String> listAlfabeto = new ArrayList<>();
            String linha = br.readLine();
            while(linha != null){
                listAlfabeto.add(linha);
                linha = br.readLine();
            }
            System.out.println(listAlfabeto); //printa lista inicial em ordem alfabetica
            System.out.println(listAlfabeto.size());

            Scanner sc = new Scanner(System.in);
            System.out.print("Informe um numero inteiro: "); //pede um numero inteiro para cifrarmos
            int chave = sc.nextInt();

            List<String> listHelloWorld = Arrays.asList("h", "e", "l", "l", "o", "w", "o", "r", "l", "d");
            StringBuilder helloWorldCifrado = new StringBuilder();
            for (int i = 0; i<listHelloWorld.size();i++){
                int posicao = acharPosicaoDeCaracter(listAlfabeto, listHelloWorld.get(i));
                int novaPosicao = (posicao + chave) % 26;
                String novoCaractere = listAlfabeto.get(novaPosicao);
                helloWorldCifrado.append(novoCaractere);
            }
            System.out.println(helloWorldCifrado);
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}

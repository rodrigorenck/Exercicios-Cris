package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Ex1 {

    public static void main(String[] args) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("responce.txt"))) {
            try (BufferedReader br = new BufferedReader(new FileReader("request.txt"));) {
                String linha = br.readLine();
                while (linha != null) {
                    String[] elementos = linha.split(":");
                    int salario = Integer.parseInt(elementos[1]);
                    String profissao = elementos[2];
                    if (salario < 3000 && profissao.equals("funcionario")) {
                        bw.write(elementos[0]);
                        bw.newLine();
                    }
                    linha = br.readLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
}

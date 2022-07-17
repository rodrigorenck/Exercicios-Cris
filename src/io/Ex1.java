package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Ler o arquivo Request.txt que estará na raiz do projeto
 * 	Request.txt
 * 		Pedro:2500:funcionario
 * 		Lucia:4000:tercerizado
 * 		Paulo:12000:funciario
 * 		Maria: 6000:funcionario
 * 		Angela:2000:tercerizado
 * 		Marcelo: 1500: Funcionario
 * Escrever no Responce.txt que também estará na raiz do projeto o nome dos funcionários que ganham menos de 3000 por mes
 * Response.txt
 * 		Pedro
 * 		Marcelo
 */
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

package io;

import java.io.*;
import java.util.Timer;
import java.util.TimerTask;

//Ler a cada 10 seg o arquivo in.txt, limpar o arquivo in.txt e enviar as informações do mesmo para o arquivo out.txt na raiz
public class Ex3 {
    private static void cleanFile(File file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            bw.write("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        File inTxt = new File("in.txt");

        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                readInWriteOut(inTxt);
            }
        },0 , 10000);
    }

    private static void readInWriteOut(File inTxt) {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"))){
            try(BufferedReader br = new BufferedReader(new FileReader(inTxt))){
                String linha = br.readLine();
                while(linha != null){
                    bw.write(linha);
                    bw.newLine();
                    linha = br.readLine();
                }
                cleanFile(inTxt);
            }catch (Exception e){
                e.printStackTrace();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}


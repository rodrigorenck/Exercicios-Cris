package io;

import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;

/**
 * Ler todos os arquivos que estão na raiz do projeto com extensão ".rodrigo" e salvar em Agrupamento.txt que estara na raiz do projeto também
 *
 * 	File_A.rodrigo
 * 		AAA
 * 		AAAzzz
 * 		AAA111444
 * 	File_B.rodrigo
 * 		BBB
 * 		BBBzzz
 * 		BBB111444
 * 	File_C.rodrigo
 * 		CCC
 * 		CCCzzz
 * 		CCC111444
 */
public class Ex2 {
    public static void main(String[] args) throws IOException {
        //como ler todos arquivos com determinada extensao
        String dir = "C:\\Users\\Rodrigo\\IdeaProjects\\exercicios-cris";

        File file = new File(dir);
        File[] list = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".rodrigo");
            }
        });

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("agrupamento.txt"))){
            for (File f :
                    list) {
                try(BufferedReader br = new BufferedReader(new FileReader(f))){
                    String linha = br.readLine();
                    while(linha != null){
                        bw.write(linha);
                        bw.newLine();
                        linha = br.readLine();
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }


        System.out.println(file);




    }

}

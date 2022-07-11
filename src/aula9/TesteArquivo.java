/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mari
 */
public class TesteArquivo {

    public static void main(String[] args) {

        try {
            FileWriter fileWriter = new FileWriter("teste.txt");
            BufferedWriter bufferWriter = new BufferedWriter(fileWriter);
            bufferWriter.write("Olá\n");
            bufferWriter.write("Linha 2\n");
            bufferWriter.close();
            fileWriter.close();

            FileReader fileReader = new FileReader("teste.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String leitura;

            do {
                leitura = bufferedReader.readLine();
               
                System.out.println(leitura);
            } while (leitura != null);

            System.out.println("Terminou de ler o arquivo");

        } catch (IOException ex) {
            System.out.println("Erro ao criar arquivo:" + ex.getMessage());
        }
    }
}

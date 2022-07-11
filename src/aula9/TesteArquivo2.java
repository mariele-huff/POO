/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula9;

import Ferramentas.Arquivo;

/**
 *
 * @author mari
 */
public class TesteArquivo2 {

    public static void main(String[] args) {

        Arquivo objArquivo = new Arquivo("teste.txt");
        String linha;
        boolean retorno = objArquivo.abrirLeitura();
        if (retorno == true) {
            do {
                linha = objArquivo.lerLinha();
                System.out.println(linha);
            } while (linha!=null);
            objArquivo.fecharArquivo();
        } else {
            System.out.println("O arquivo não pode ser carregado!");
        }

        objArquivo = new Arquivo("teste2.txt");
        retorno = objArquivo.abrirEscrita();
        if(retorno==true){
          objArquivo.escreverLinha("Mariele");
          objArquivo.fecharArquivo();
           
        }else{ 
            System.out.println("O arquivo não pode ser carregado!");
        }
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ferramentas;

import java.awt.Image;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author mari
 */import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Globais {
  public static int gerarNumero(int max) {
        try {

            Random rand = new Random(); //instance of random class
            int upperbound = max;
            //generate random values from 0-max
            int int_random = rand.nextInt(upperbound);
            
            return int_random + 1;

        } catch (Exception ex) {
            return 0;
        }
    } public static void exibirMensagem (String mensagem){
        JOptionPane.showMessageDialog(null, mensagem);
    }
    public static String gerarMD5(String texto){
    try {
        String retorno = "";
        if(!texto.equals("")){
            MessageDigest m;

            m = MessageDigest.getInstance("MD5");
            m.update(texto.getBytes(),0, texto.length());
            retorno = new BigInteger(1,m.digest()).toString(16);
        }
        return retorno;
        
        } catch (NoSuchAlgorithmException ex) {
        System.out.println("Erro ao gerar MD5");
        return "";
    }
}

    public static void ajustarImagem(String caminho, JLabel label) {
        try {

            ImageIcon imageIcon = new ImageIcon(caminho);
            Image img = imageIcon.getImage();
            Image imgScale = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon scaledimageIcon = new ImageIcon(imgScale);
            label.setIcon(scaledimageIcon);

        } catch (Exception ex) {

        }
    }

    public static class ajustarImagem {

        public ajustarImagem() {
        }
    }
    
     public static int gerarNumero1(int max) {
         int numero = 0;
         int recebe =0;
         int vet [] = new int [max];
         numero = gerarNumero(100);
         for (int i = 0; i < vet.length; i++) {
             if(numero != vet[i]){
                 numero = recebe;
             }
         }
      return recebe;
         
     }
}


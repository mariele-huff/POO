/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula5;

/**
 *
 * @author mari
 */
public class TesteDebug {
    public static void main(String[] args) {
        try{
        int n1 = 1;
        int n2 = 2;
        int n3 = 5;

        if (n1 >= n2) {
            n3=n1;
        }else if (n2 > n1) {
            n3=n2;
        }
        }catch ( Exception ex){
            System.out.println("Erro");
        }

        String nome = "Mari";
    }
}

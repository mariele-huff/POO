/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula2;

/**
 *
 * @author mari
 */
public class CompartilharString {

    static String nome1 = "Mariele";
    static String nome2 = "MARIELE";

    public static void main(String[] args) {
        if (nome1.equals(nome2)) {
            System.out.println("Os nomes são iguais");
        } else if (nome1.equalsIgnoreCase(nome2)){
            System.out.println("Os nomes são iguais com captalizações diferentes");
        } else { 
            System.out.println("Os nomes são diferentes");
        }
        
    }
       

    }


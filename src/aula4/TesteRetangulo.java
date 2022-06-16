/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author mari
 */
public class TesteRetangulo {
    public static void main(String[] args) {
       Area objArea = new Area();
       
       objArea.setAltura(2);
       objArea.setBase(2.5);
       
       
        System.out.println("Area = " + objArea.calcularAreaRetangulo());
} 
}

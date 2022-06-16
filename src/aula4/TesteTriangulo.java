/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

/**
 *
 * @author mari
 */
public class TesteTriangulo {
    public static void main(String[] args) {
        Area objtriangulo = new Area();
    
    objtriangulo.setBase(3);
    objtriangulo.setAltura(3);
    
     System.out.println("Area = " + objtriangulo.calcularAreaTriangulo());
    }
    
}

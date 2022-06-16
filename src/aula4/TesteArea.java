/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import Ferramentas.Entrada;

/**
 *
 * @author mari
 */
public class TesteArea {
    public static void main(String[] args) {
       double aQuadrado = 0, lado1=0, lado2=0;
       
       lado1=Entrada.leiaDouble("Digite o valor da base do quadrado em cm");
       lado2= Entrada.leiaDouble("Digite o valor da altura do quadrado em cm");
       
       aQuadrado = valorArea (lado1,lado2);
        System.out.printf("A area do quadrado é de: %.0f ",aQuadrado);
                System.out.print("cm");
       
    } public static double valorArea ( double l1, double l2  ){
        double resposta = l1 * l2;
        return resposta;
    } 
            
}

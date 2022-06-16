/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import Modelos.Aluno;

/**
 *
 * @author mari
 */
public class ExerciciosAluno {

    public static void main(String[] args) {

        Aluno objaluno1 = new Aluno();
        objaluno1.setNome("Mariele");
        objaluno1.setIdade(21);
        objaluno1.setAltura(1.70);
        objaluno1.setDataNascimento("11/11/2000");

        
        Aluno objaluno2 = new Aluno();
        objaluno2.setNome("Mariele");
        objaluno2.setIdade(21);
        objaluno2.setAltura(1.70);
        objaluno2.setDataNascimento("11/11/2000");
        
         if (objaluno1 == objaluno2){
             System.out.println("Os alunos são iguais!!!");
             
         } else if  (objaluno1 != objaluno2 ){
             System.out.println("Os alunos são diferentes!!!");
         }
         
        objaluno1.imprimir();
        objaluno2.imprimir();

    }

}

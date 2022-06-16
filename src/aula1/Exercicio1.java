/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula1;

/**
 *
 * @author mari
 */
public class Exercicio1 {

    
     //public = É um modificdor de acesso que deixa o método visivel para utiliza-lo em outras classes.
    //provate= Permite que seja visivel  apenas na  própria class.
     //static = permite que o mpetodo seja invocado sem necessidade de criar uma nova intância.
     // void = o método em questão nao tem retorno.
    
    public static void main(String[] args) {
        int variavel1 =27;
        int variavel2= 74;
    
    
    
    //String resultadoFinal = imprimeExemplos (variavel1 ,variavel2);
        //System.out.println(resultadoFinal);
        
        Operacoes operacoes = new Operacoes();
        
        int resultado = operacoes.somar(variavel1, variavel2);
    } 
     
    private static String imprimeExemplos (int var1, int var2 ) {
        StringBuilder resultadoFinal = new StringBuilder ();
    resultadoFinal.append("var 1 = ");
    resultadoFinal.append(var1);
    resultadoFinal.append("\n");


    resultadoFinal.append("var 2 = ");
    resultadoFinal.append(var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 == var2 -> ");
    resultadoFinal.append(var1 == var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 != var2 -> ");
    resultadoFinal.append(var1 != var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 < var2 -> ");
    resultadoFinal.append(var1 < var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 > var2 -> ");
    resultadoFinal.append(var1 > var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 <= var2 -> ");
    resultadoFinal.append(var1 <= var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("var 1 >= var2 -> ");
    resultadoFinal.append(var1 >= var2);
    resultadoFinal.append("\n");
    
     resultadoFinal.append("usando negação : !(var 1 != var2)");
    resultadoFinal.append(!(var1 != var2));
    resultadoFinal.append("\n");
  
    return resultadoFinal.toString();
    
    }
    }
    


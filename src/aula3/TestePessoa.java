/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

import Ferramentas.Entrada;


/**
 *
 * @author mari
 */
public class TestePessoa {
    public static void main(String[] args) {
          Pessoa objpessoa = new Pessoa ();
          Pessoa objpessoa2 = new Pessoa ();
          
          objpessoa.setNome(Entrada.leiaString("Digite o nome:"));
          objpessoa.setIdade(Entrada.leiaInt("Digite a idade:"));
          objpessoa.setData_nascimento(Entrada.leiaString("Digite a data de nascimento:"));
          objpessoa.setProfissao(Entrada.leiaString("Digite a sua profissão:"));
          
          objpessoa2.setNome(Entrada.leiaString("Digite o nome:"));
          objpessoa2.setIdade(Entrada.leiaInt("Digite a idade:"));
          objpessoa2.setData_nascimento(Entrada.leiaString("Digite a data de nascimento:"));
          objpessoa2.setProfissao(Entrada.leiaString("Digite a sua profissão:"));
          
          System.out.println(objpessoa.toString());
          System.out.println(objpessoa2.toString());
          
          String retorno = nomePessoas (objpessoa, objpessoa2);
         
          System.out.println("------------------------------------------------");
          
          if (objpessoa.getNome().length()==(objpessoa2.getNome().length())){
              System.out.println("O nome das pessoas são iguais!");
          } else if (objpessoa.getNome().length()-1> objpessoa2.getNome().length()-1) {
              System.out.println("O nome da pessoa 1 tem o maior numero de letras que o nome 2!");
          } else {
               System.out.println("O nome da pessoa 2 tem o maior numero de letras que o nome 1!");
          }
          
          
          
          if (objpessoa.getIdade()==objpessoa2.getIdade()){
              System.out.println("A idade das pessoas tem o mesmo número de letras!");
          } else if ( objpessoa.getIdade()>objpessoa2.getIdade()){
              System.out.println("A idade da pessoa 1 é maior que a idade da pessoa 2!");
          } else{
              System.out.println("A idade da pessoa 2 é maior que a idade da pessoa 1!");
 
          }
    }
          public static String nomePessoas (Pessoa obj1, Pessoa obj2){
          if(obj1.getNome().equals(obj2.getNome())){
             return("O nome das pessoas são iguais!");
           }else{
             return("O nome das pessoas são diferentes!"); 
          }  
          }
          
          
          
    }
  
    
    
    
    





/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula4;

import Ferramentas.Entrada;
import Modelos.ContaBanco;

/**
 *
 * @author mari
 */
public class TesteConta1 {

    public static void main(String[] args) {
        ContaBanco objconta1 = new ContaBanco();
        objconta1.setAgencia(Entrada.leiaString("Dígite o número da sua agência: "));
        objconta1.setConta(Entrada.leiaString("Dígite o número da sua conta: "));
        objconta1.setTitular(Entrada.leiaString("Dígite o nome do titular: "));
        objconta1.setSaldo(Entrada.leiaDouble("Dígite o valor do seu saldo: "));
        objconta1.setChequeEspecial(Entrada.leiaDouble("Digite o limite do seu cheque especial"));
        System.out.println(objconta1);

        objconta1.saque(Entrada.leiaDouble("Digíte o valor que você deseja sacar: "));

       

        objconta1.deposito(Entrada.leiaDouble("Digíte o valor que você deseja depositar: "));
       
       
        
        
        
        
        ContaBanco objconta2 = new ContaBanco();
        objconta2.setAgencia(Entrada.leiaString("Dígite o número da sua agência: "));
        objconta2.setConta(Entrada.leiaString("Dígite o número da sua conta: "));
        objconta2.setTitular(Entrada.leiaString("Dígite o nome do titular: "));
        objconta2.setSaldo(Entrada.leiaDouble("Dígite o valor do seu saldo: "));
        objconta1.setChequeEspecial(Entrada.leiaDouble("Digite o limite do seu cheque especial"));

        System.out.println(objconta1);

        objconta2.saque(Entrada.leiaDouble("Digíte o valor que você deseja sacar: "));

        

        objconta2.deposito(Entrada.leiaDouble("Digíte o valor que você deseja depositar: "));
       
 
        objconta1.transferir( objconta2 , Entrada.leiaDouble("Dígite o valor que você deseja transferir: "));
         System.out.println(objconta1 +"\n"+ objconta2);
        
    }
}

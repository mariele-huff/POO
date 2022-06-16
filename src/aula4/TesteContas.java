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
public class TesteContas {

    public static void main(String[] args) {
        ContaBanco[] objconta = new ContaBanco[3];
        ContaBanco pessoa1 = new ContaBanco();
        ContaBanco pessoa2 = new ContaBanco();

        objconta[0] = pessoa1;
        objconta[1] = pessoa2;
        for (int i = 0; i < objconta.length; i++) {

            objconta[i].setAgencia(Entrada.leiaString("Dígite o número da sua agência: "));
            objconta[i].setConta(Entrada.leiaString("Dígite o número da sua conta: "));
            objconta[i].setTitular(Entrada.leiaString("Dígite o nome do titular: "));
            objconta[i].setSaldo(Entrada.leiaDouble("Dígite o valor do seu saldo: "));
            objconta[i].setChequeEspecial(Entrada.leiaDouble("Digite o limite do seu cheque especial"));
            int op = 0;
            while (op == 5) {
                op = Entrada.leiaInt("Digite o numero da operação que deseja fazer : \n"
                        + "[1] Saque \n"
                        + "[2] Deposito\n"
                        + "[3] Ver saldo \n"
                        + "[4] Transferir \n"
                        + "[5] Sair");
                        

                if (op == 1) {
                    objconta[i].saque(Entrada.leiaDouble("Digíte o valor que você deseja sacar: "));

                } else if (op == 2) {
                    objconta[i].deposito(Entrada.leiaDouble("Digíte o valor que você deseja depositar: "));

                } else if (op == 3) {
                    System.out.println(objconta[i]);

                } else if (op == 4) {
                    objconta[i].transferir( objconta[1] , Entrada.leiaDouble("Dígite o valor que você deseja transferir: "));
         System.out.println(objconta[i] +"\n"+ objconta[1]);;
                }

            }

        }
    }
}

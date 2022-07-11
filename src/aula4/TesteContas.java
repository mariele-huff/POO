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
        ContaBanco pessoa1 = new ContaBanco("1111", "222", "A", 1000, 300, "12345678", "");
        ContaBanco pessoa2 = new ContaBanco("1112", "223", "B", 700, 300, "12345679", "");
        ContaBanco pessoa3 = new ContaBanco("1113", "224", "C", 700, 300, "12345677", "");

        objconta[0] = pessoa1;
        objconta[1] = pessoa2;
        objconta[2] = pessoa3;
        for (int i = 0; 1 == 1; i++) {
            String contaOrigem = Entrada.leiaString("Digite a sua conta:");
            ContaBanco rContaOrigem = localizarContaOrigem(objconta, contaOrigem);
            String contaEx = localizarContaExistente(objconta, contaOrigem);

            if (contaOrigem.equals(contaEx)) {

                //objconta[i].setAgencia(Entrada.leiaString("Dígite o número da sua agência: "));
                //objconta[i].setConta(Entrada.leiaString("Dígite o número da sua conta: "));
                //objconta[i].setTitular(Entrada.leiaString("Dígite o nome do titular: "));
                //objconta[i].setSaldo(Entrada.leiaDouble("Dígite o valor do seu saldo: "));
                //objconta[i].setChequeEspecial(Entrada.leiaDouble("Digite o limite do seu cheque especial"));
                //objconta[i].setChavePIX(Entrada.leiaString("Digite a sua chave pix:"));
                int op = 0;
                while (op != 6) {

                    op = Entrada.leiaInt("Digite o numero da operação que deseja fazer : \n"
                            + "[1] Saque \n"
                            + "[2] Deposito\n"
                            + "[3] Ver saldo \n"
                            + "[4] Transferir \n"
                            + "[5] PIX\n"
                            + "[6] Sair");

                    if (op == 1) {
                        objconta[i].saque(Entrada.leiaDouble("Digíte o valor que você deseja sacar: "));

                    } else if (op == 2) {
                        objconta[i].deposito(Entrada.leiaDouble("Digíte o valor que você deseja depositar: "));

                    } else if (op == 3) {
                        System.out.println(objconta[i]);

                    } else if (op == 4) {
                        objconta[i].transferir(objconta[1], Entrada.leiaDouble("Dígite o valor que você deseja transferir: "));
                        System.out.println(objconta[i] + "\n" + objconta[1]);
                    } else if (op == 5) {
                        String contaDestino = Entrada.leiaString("Dígite a chave pix para qual deseja transferir:");
                        ContaBanco rContaDestino = localizarContaDestino(objconta, contaDestino);

                        objconta[i].transferenciaPIX(Entrada.leiaDouble("Dígite o valor da transferencia Pix"), rContaDestino);

                    }
                }
            } else {
                System.out.println("Conta inexistente!");
            }
        }
    }

    private static ContaBanco localizarContaDestino(ContaBanco[] contas, String contaD) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getChavePIX().equals(contaD)) {
                return contas[i];
            }

        }
        return null;

    }

    private static ContaBanco localizarContaOrigem(ContaBanco[] contas, String contaO) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getConta().equals(contaO)) {

                return contas[i];
            }

        }
        return null;
    }

    private static String localizarContaExistente(ContaBanco[] contas, String contaE) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i].getConta().equals(contaE)) {

                return contaE;
            }
        }
        return null;
    }
}

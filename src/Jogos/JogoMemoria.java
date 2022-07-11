/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogos;

import Ferramentas.Entrada;

/**
 *
 * @author mari
 */
public class JogoMemoria {

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int numSort = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                numSort = (int) (Math.random() * 8) + 1;
                matriz[i][j] = numSort;
                int retornoN = Verificacao(numSort, matriz);
                if (retornoN < 2) {
                    matriz[i][j] = numSort;
                }

            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\n");
            }

        }
    }

    private static int Verificacao(int numS, int mat[][]) {
        int cont = 0;
        int temp = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {

                if (numS == mat[i][j]) {
                    cont++;
                   
                }

            }
        }
        
            return cont;

        
        }
    }


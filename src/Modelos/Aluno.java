/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author mari
 */
public class Aluno {
    
    private String nome;
    private int idade;
    private double altura;
    private String dataNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public void fazainversario(){
        idade = idade + 1 ;
    }
    public void imprimir() {
            System.out.println(" O nome do aluno é " + nome + ", nasceu em "+ dataNascimento +", tem " + idade + " anos" + " e sua altura é: " + altura + " m." );
    
}
}

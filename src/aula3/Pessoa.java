/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author mari
 */
public class Pessoa {
    private String nome;
    private int idade;
    private String data_nascimento;
    private String profissao;

    public Pessoa(){
        
    }
    
    public Pessoa(String nome, int idade, String data_nascimento, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.data_nascimento = data_nascimento;
        this.profissao = profissao;
    }

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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    @Override
    public String toString() {
        return( "Nome: " + nome +" \nIdade: "+ idade +"\nData de nascimento: " + data_nascimento + " \nProfissão: "+ profissao);
    }
    
    

}
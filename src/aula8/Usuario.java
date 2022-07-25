/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula8;

/**
 *
 * @author mari
 */
public class Usuario {
   private int id;
   private String usuario;
   private String senha;
   private String email;

    public Usuario(int id, String usuario, String senha, String email) {
        this.usuario = usuario;
        this.senha = senha;
        this.id=id;
        this.email=email;
    }
public Usuario(){
    
}
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
   
   
}

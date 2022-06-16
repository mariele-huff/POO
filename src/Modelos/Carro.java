/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author mari
 */
public class Carro {
    private String numeroChassi;
    private String cor;
    private String marca;
    private String modelo;
    private int anoModelo;
    private int anoFabricacao;

    public Carro(String numeroChassi, String cor, String marca, String modelo, int anoModelo, int anoFabricacao, double notaBeleza) {
        this.numeroChassi = numeroChassi;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.anoModelo = anoModelo;
        this.anoFabricacao = anoFabricacao;
    }

 
  
      
        
        
    
    public String getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(String numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabircalcao) {
        this.anoFabricacao = anoFabircalcao;
    }

    @Override
    public String toString() {
        return ( "Marca: " + marca +"\n" + "Modelo: "+ modelo +"\n"+ "Cor: "+ cor +"\n"+ "Ano de fabricação: "+ anoFabricacao); 
    
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author mari
 */
public class ContaBanco {
    private String agencia;
    private String conta;
    private String titular;
    private double saldo;
    private double chequeEspecial;
    private String chavePIX;
   
    public ContaBanco(){
        
    }

    

  
    public ContaBanco(String agencia, String conta, String titular, double saldo, double chequeEspecial, String chavePIX) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.chavePIX = chavePIX;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public String getChavePIX() {
        return chavePIX;
    }

    public void setChavePIX(String chavePIX) {
        this.chavePIX = chavePIX;
    }
    
    
    
    
    public void saque ( double valorSaque){
        if (this.saldo + this.chequeEspecial>=valorSaque){
        this.saldo -= valorSaque;
                    System.out.println("Saque efetuado com sucesso");

        }else{
            System.out.println("Saque não efetuado, saldo insuficiente");
        }  
    }
    
    public void deposito ( double valorDeposito){
        this.saldo += valorDeposito;
     System.out.println("Depósito efetuado com sucesso");

    }
    
    public void transferir ( ContaBanco contaRecebimento, double valorTransferencia){
        if (this.saldo + this.chequeEspecial>=valorTransferencia){
            this.saldo-=valorTransferencia;
            contaRecebimento.saldo += valorTransferencia;
            System.out.println("Transferencia efetuada com sucesso");
        }else {
            System.out.println("Saldo insuficiente, transferencia não efetuada");
        }
    }
    
    public void transferenciaPIX (  double valorTransferenciaPIX, ContaBanco contaRecebimento){
            if (this.saldo + this.chequeEspecial>=valorTransferenciaPIX){
            this.saldo-=valorTransferenciaPIX;
            contaRecebimento.saldo += valorTransferenciaPIX;
            System.out.println("PIX efetuado com sucesso");
        }else {
            System.out.println("Saldo insuficiente, PIX não efetuado");
        }
    }
    
    
    //  public void transferir ( ContaBanco contaRecebimento, double valorTransferencia){
    // if (saque (valorTransferencia)== True){
    // contaRecebimento.deposito(valorTransferencia);
    // System.out.println("Transferencia efetuada com sucesso");


    @Override
    public String toString() {
        return "-----------"+"\n" +"Agencia: " + agencia + "\n" + "Conta: " +  conta+ "\n" + "Saldo: " + saldo;
            
    }

    
    
}

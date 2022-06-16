/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author mari
 */
public class Questionario {
    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private char respostaCorreta;

    public Questionario(){
    
}
    public Questionario(String pergunta, String respostaA, String respostaB, String respostaC, char respostaCorreta) {
        this.pergunta = pergunta;
        this.respostaA = respostaA;
        this.respostaB = respostaB;
        this.respostaC = respostaC;
        this.respostaCorreta = respostaCorreta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(char respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

   
    
    public  String realizarPergunta(){
return pergunta +"\nQual a Alternativa correta?\n"
+ "a) " + respostaA + "\n" + "b) "+ respostaB + "\n" +"c) " +respostaC;
        
        
        }
}

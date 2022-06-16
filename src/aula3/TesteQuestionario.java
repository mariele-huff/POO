/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

import Ferramentas.Entrada;



/**
 *
 * @author mari
 */
public class TesteQuestionario {
    public static void main(String[] args) {
       Questionario [] vetorquestao  = new Questionario [3];
      
       Questionario questao1 = new Questionario();
       questao1.setPergunta("Qual o menor planeta do sistema solar?");
       questao1.setRespostaA("Júpiter");
       questao1.setRespostaB("Mercúrio");
       questao1.setRespostaC("Vênus");
       questao1.setRespostaCorreta('b');
       
       Questionario questao2 = new Questionario();
       questao2.setPergunta("Qual o maior planeta do sistema solar?");
       questao2.setRespostaA("Júpiter");
       questao2.setRespostaB("Mercúrio");
       questao2.setRespostaC("Vênus");
       questao2.setRespostaCorreta('a');
       
       
        Questionario questao3 = new Questionario();
       questao3.setPergunta("Qual o maior planeta com o tamanho mais parecido com o tamanho da Terra?");
       questao3.setRespostaA("Júpiter");
       questao3.setRespostaB("Mercúrio");
       questao3.setRespostaC("Vênus");
       questao3.setRespostaCorreta('c');
    
       
        vetorquestao[0] = questao1;
        vetorquestao[1] = questao2;
       vetorquestao[2] = questao3;
       
       realizarQuestionario(vetorquestao);
    }
    public static void realizarQuestionario ( Questionario []questoes ){
            int acertos = 0;
            for (int i = 0; i < questoes.length; i++) {
            char resposta = Entrada.leiaChar(questoes[i].realizarPergunta());
    if (resposta == questoes[i].getRespostaCorreta()){
        System.out.println("A resposta está correta");
        acertos++;
        
    }else{
        System.out.println("A resposta está incorreta");
    }
               
        } System.out.println("Você acertou: " + acertos + " questões!");
    System.exit(0);
    }
}
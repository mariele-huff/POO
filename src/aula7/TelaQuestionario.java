/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aula7;

import Ferramentas.Entrada;
import Ferramentas.Globais;
import aula3.Questionario;

/**
 *
 * @author mari
 */
public class TelaQuestionario extends javax.swing.JFrame {
  Questionario [] vetorquestao  = new Questionario [3];
  int cont = -1;
  int acertos=0;
    /**
     * Creates new form TelaQuestionario
     */
    public TelaQuestionario() {
        initComponents();
        
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
       questao3.setPergunta("Qual é o planeta com o tamanho mais parecido com o da Terra?");
       questao3.setRespostaA("Júpiter");
       questao3.setRespostaB("Mercúrio");
       questao3.setRespostaC("Vênus");
       questao3.setRespostaCorreta('c');
    
       
        vetorquestao[0] = questao1;
        vetorquestao[1] = questao2;
       vetorquestao[2] = questao3;
     fazerPergunta();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        bntAvancar = new javax.swing.JButton();
        rbtnA = new javax.swing.JRadioButton();
        rbtnB = new javax.swing.JRadioButton();
        rbtnC = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Questionário");

        lblPergunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPergunta.setText("Perguntas");

        bntAvancar.setText("Avançar");
        bntAvancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntAvancarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnA);
        rbtnA.setText("Questão A");
        rbtnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnB);
        rbtnB.setText("Questão B");

        buttonGroup1.add(rbtnC);
        rbtnC.setText("Questão C");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bntAvancar)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtnC)
                    .addComponent(rbtnB)
                    .addComponent(rbtnA))
                .addContainerGap(423, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPergunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPergunta)
                .addGap(18, 18, 18)
                .addComponent(rbtnA)
                .addGap(18, 18, 18)
                .addComponent(rbtnB)
                .addGap(18, 18, 18)
                .addComponent(rbtnC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(bntAvancar)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntAvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAvancarActionPerformed
      
      
        boolean altA = rbtnA.isSelected();
       boolean altB = rbtnB.isSelected();
       boolean altC = rbtnC.isSelected();

       if(altA || altB || altC){
       
        if(altB && vetorquestao[cont].getRespostaCorreta() == 'b'){
                Globais.exibirMensagem("Acertou");
              
            }else if(altA && vetorquestao[cont].getRespostaCorreta() == 'a'){
                Globais.exibirMensagem("Acertou");
                acertos++;
            }else if(altC && vetorquestao[cont].getRespostaCorreta() == 'c'){
                Globais.exibirMensagem("Acertou");
                acertos++;
            }else{
                 Globais.exibirMensagem("Errou");
            }fazerPergunta();  
            
       }else{
           Globais.exibirMensagem("Escolha uma alternativa");

       
            }
       
    }//GEN-LAST:event_bntAvancarActionPerformed
    private void fazerPergunta() {
        buttonGroup1.clearSelection();
       cont++;
       if(cont<vetorquestao.length){
        
      lblPergunta.setText( vetorquestao[cont].getPergunta());
        rbtnA.setText(vetorquestao[cont].getRespostaA());
        rbtnB.setText(vetorquestao[cont].getRespostaB());
        rbtnC.setText(vetorquestao[cont].getRespostaC());
       }else{
         Globais.exibirMensagem("Total de acertos: " + vetorquestao.length+"/"+ acertos );  
         System.exit(0);
       }
        
  
     
    }
    
    private void rbtnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnAActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaQuestionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaQuestionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntAvancar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JRadioButton rbtnA;
    private javax.swing.JRadioButton rbtnB;
    private javax.swing.JRadioButton rbtnC;
    // End of variables declaration//GEN-END:variables
}

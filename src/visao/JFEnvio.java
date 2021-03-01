/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visao;
 
import static java.awt.EventQueue.invokeLater;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.Integer.valueOf;
import static java.lang.String.valueOf;
import static java.lang.String.valueOf;
import static java.lang.System.exit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static java.util.logging.Logger.getLogger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.KeyStroke.getKeyStroke;
import static javax.swing.KeyStroke.getKeyStroke;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import recursos.Email;


public class JFEnvio extends javax.swing.JFrame {
    private static final long serialVersionUID = 1L;
    MinhasConfiguracoes mc;
    static final String PADRAODATA = "dd/MM/yyyy";
    JFileChooser fc = new JFileChooser();
    List<String> emails;
    Email email;
    Thread tcomeco;
    Thread tenvio[];
    /**
     * Creates new form JFEnvio
     */
    public JFEnvio() {
        initComponents();
        timer1.start();
        setExtendedState(MAXIMIZED_BOTH);
        tcomeco = new Thread(new Runnable() {
            @Override
            public void run() {
                emails = new ArrayList<>(300);
                mc = new MinhasConfiguracoes().getObjeto("C:/envio_massa/minhas_configuracoes");
                if(mc != null && mc.getEmail() != null && mc.getHost() != null){
                    email = new Email(mc.getHost(), valueOf(465), mc.getEmail(), mc.getSenha());
                }else{
                    email = new Email();
                }
            }
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timer1 = new org.netbeans.examples.lib.timerbean.Timer();
        ldata = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        benviar = new javax.swing.JButton();
        bsair = new javax.swing.JButton();
        bprocurar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        bprocurar1 = new javax.swing.JButton();
        larquivo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        timer1.addTimerListener(new org.netbeans.examples.lib.timerbean.TimerListener() {
            public void onTime(java.awt.event.ActionEvent evt) {
                timer1OnTime(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Best Envio de E-mails");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ldata.setText("Data e hora");

        jLabel2.setText("Assunto");

        jLabel3.setText("E-mail p/ retorno");

        jLabel4.setText("E-mails");

        jLabel5.setText("Texto");

        jScrollPane1.setViewportView(jEditorPane1);

        benviar.setText("Enviar");
        benviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                benviarActionPerformed(evt);
            }
        });

        bsair.setText("Sair");
        bsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsairActionPerformed(evt);
            }
        });

        bprocurar.setText("Procurar");
        bprocurar.setToolTipText("Procurar para ler arquivos com e-mail");
        bprocurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprocurarActionPerformed(evt);
            }
        });

        jLabel6.setText("Enviando:");

        jLabel7.setText("0");

        jLabel8.setText("Anexo");

        bprocurar1.setText("Procurar");
        bprocurar1.setToolTipText("Procurar para ler arquivos com e-mail");
        bprocurar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bprocurar1ActionPerformed(evt);
            }
        });

        larquivo.setText("Caminho do arquivo");

        jMenu1.setText("Envio");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Novo");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Configurações");

        jMenuItem3.setText("Configurar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(ldata, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel8))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bprocurar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bprocurar1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(larquivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGap(66, 66, 66))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 530, Short.MAX_VALUE)
                        .addComponent(benviar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bsair)
                        .addGap(98, 98, 98))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bprocurar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(bprocurar1)
                    .addComponent(larquivo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(benviar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bsair, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ldata)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void timer1OnTime(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timer1OnTime
        ldata.setText(mascaraData(PADRAODATA, new Date()));
    }//GEN-LAST:event_timer1OnTime

    private void bsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bsairActionPerformed
        dispose();
    }//GEN-LAST:event_bsairActionPerformed

    private void bprocurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprocurarActionPerformed
        bprocurar.setEnabled(false);
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int res = fc.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            Thread tabre = new Thread(new Runnable() {
                @Override
                public void run() {
                    int qtd = 0;
                    try (FileReader reader = new FileReader(fc.getSelectedFile()); BufferedReader leitor = new BufferedReader(reader)) {
                        bprocurar.setToolTipText("Começando leitura do arquivo");
                        while(leitor.ready()) {
                            emails.add(leitor.readLine());
                            qtd++;
                        }
                        tenvio = new Thread[qtd];
                        bprocurar.setToolTipText("Achou " + qtd + " e-mails");                            
                        leitor.close();
                        reader.close();      
                    } catch (FileNotFoundException ex) {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado!Causado por:" + ex, "Erro:", JOptionPane.ERROR_MESSAGE);
                    }catch (IOException ex) {
                        JOptionPane.showMessageDialog(null, "Arquivo não encontrado!Causado por:" + ex, "Erro:", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            tabre.start();
        }else{
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum arquivo", "Erro:", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bprocurarActionPerformed

    private void benviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_benviarActionPerformed
    Thread tabre = new Thread(new Runnable() {
        @Override
        public void run() {
            final int qtd = emails.size();
            if(qtd > 0){
                int qtdt = tenvio.length;
                for(int i = 0; i < qtdt; i++){
                    tenvio[i] = new Thread(enviar(i));
                }  
                for(int i = 0; i < qtdt; i++){
                    tenvio[i].start();
                }                 
            }else{
                JOptionPane.showMessageDialog(null, "Escolha primeiro uma listagem de e-mails", "ERRO:", JOptionPane.ERROR_MESSAGE);
            }                    
        }
    });
    tabre.start();
    }//GEN-LAST:event_benviarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tcomeco.start();
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new JFConfigurar().setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bprocurar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bprocurar1ActionPerformed
        JFileChooser fclocal = new JFileChooser();
        fclocal.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int res = fclocal.showOpenDialog(null);
        
        if(res == JFileChooser.APPROVE_OPTION){
            final String arquivo = fclocal.getSelectedFile().getPath();
            Thread tabre = new Thread(new Runnable() {
                @Override
                public void run() {
                    larquivo.setText(arquivo);
                }
            });
            tabre.start();
        }else{
            JOptionPane.showMessageDialog(null, "Você não selecionou nenhum arquivo", "Erro:", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_bprocurar1ActionPerformed

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
            java.util.logging.Logger.getLogger(JFEnvio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEnvio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEnvio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEnvio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JFEnvio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton benviar;
    private javax.swing.JButton bprocurar;
    private javax.swing.JButton bprocurar1;
    private javax.swing.JButton bsair;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel larquivo;
    private javax.swing.JLabel ldata;
    private org.netbeans.examples.lib.timerbean.Timer timer1;
    // End of variables declaration//GEN-END:variables

    public Runnable enviar(int indice){
        int qtd = emails.size();
        for(int i = (qtd * indice); i < (qtd * (indice + 1)); i++){
            if(larquivo.getText() != null && !larquivo.getText().isEmpty() && !larquivo.getText().equals("Caminho do arquivo")){
                email.arquivo = larquivo.getText();
            }
            email.sendMail(jTextField2.getText(), emails.get(i), jTextField3.getText(), jEditorPane1.getText());
            int qtd2 = Integer.valueOf(jLabel7.getText()) + 1;
            jLabel7.setText(String.valueOf(qtd2));
        }        
        return null;
    }
    
    public String mascaraData(String formato, Date data){
        return new SimpleDateFormat(formato).format(data);
    }    
    

  public void criaDiretorio(String novoDiretorio){
      String nomeDiretorio; 
      String separador     = java.io.File.separator; 
      try {     
           nomeDiretorio = "C:" + separador + novoDiretorio; 
           if (!new File(nomeDiretorio).exists()) { // Verifica se o diretório existe. 
               (new File(nomeDiretorio)).mkdir();   // Cria o diretório 
           } 
      } catch (Exception ex) { 
           JOptionPane.showMessageDialog(null,"Erro","Erro ao criar o diretório causado por:" + ex.toString(),JOptionPane.ERROR_MESSAGE); 
      }
  }     
}
package Telas;

import HenriFarmas.Funcionario;
import HenriFarmas.FuncionarioJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatórioFuncionarios extends javax.swing.JFrame {

   
    public RelatórioFuncionarios() {
        initComponents();
        List<Funcionario> lista = FuncionarioJPA.listar();
        preencherTabela(lista);
    }
    public void  preencherTabela(List<Funcionario> funcionario){
        String colunas[] = {"ID","Nome","CPF","Cargo"};
        String dados[][] = new String[funcionario.size()][colunas.length];
        int i = 0;
        for(Funcionario f: funcionario){
            dados[i] = new String[]{
                String.valueOf(f.getId()),
                f.getNome(),
                f.getCpf(),
                f.getCargo()
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados,colunas);
        tabelaFuncionarios.setModel(model);
    }  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaFuncionarios = new javax.swing.JTable();
        ButtonRemover = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Relatório de Funcionários");

        tabelaFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        tabelaFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaFuncionarios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        tabelaFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaFuncionarios);

        ButtonRemover.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRemover.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonRemover.setForeground(new java.awt.Color(0, 0, 0));
        ButtonRemover.setText("Remover");
        ButtonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRemoverActionPerformed(evt);
            }
        });

        ButtonCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonCadastrar.setText("Cadastrar");
        ButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(461, 461, 461)
                                .addComponent(ButtonRemover)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ButtonCadastrar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(18, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonCadastrar)
                            .addComponent(ButtonRemover))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(350, 350, 350))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        TelaAdicionarFuncionario f = new TelaAdicionarFuncionario();
        f.setVisible(true);
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoverActionPerformed
        try{
            if(tabelaFuncionarios.getSelectedRow()>=0){
                String id = (String) tabelaFuncionarios.getValueAt(tabelaFuncionarios.getSelectedRow(),0);
                int respota = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o registro " + id + "?");
                if(respota ==0){
                    FuncionarioJPA fun = new FuncionarioJPA();
                    fun.excluir(Integer.parseInt(id));
                    JOptionPane. showMessageDialog(this, "Registro excluído com sucesso");
                    List<Funcionario> lista = FuncionarioJPA.listar();
                    preencherTabela(lista);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_ButtonRemoverActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatórioFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonRemover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaFuncionarios;
    // End of variables declaration//GEN-END:variables
}

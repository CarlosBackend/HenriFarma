package Telas;

import HenriFarmas.Cliente;
import HenriFarmas.ClienteJPA;
import HenriFarmas.Produto;
import HenriFarmas.ProdutoJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RelatorioProdutos extends javax.swing.JFrame {

   
    public RelatorioProdutos() {
        initComponents();
        List<Produto> listar = ProdutoJPA.listar();
        preencherTabela(listar);
    }

   public void preencherTabela(List<Produto> produto){
       String colunas[] = {"ID","Nome","Preco","Quantidade","Validade"};
        String dados[][] = new String[produto.size()][colunas.length];
        int i = 0;
        for(Produto p: produto){
            dados[i] = new String[]{
                String.valueOf(p.getId()),
                p.getNome(),
                String.valueOf(p.getPreco()),
                String.valueOf(p.getQuantidade()),
                String.valueOf(p.getValidade())
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados,colunas);
        tabelaProdutos.setModel(model);
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProdutos = new javax.swing.JTable();
        ButtonRemover = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        buttonEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório Produtos");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Relatório dos Produtos");

        tabelaProdutos.setBackground(new java.awt.Color(255, 255, 255));
        tabelaProdutos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaProdutos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaProdutos.setForeground(new java.awt.Color(0, 0, 0));
        tabelaProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaProdutos);

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

        buttonEditar.setBackground(new java.awt.Color(255, 255, 255));
        buttonEditar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonEditar.setForeground(new java.awt.Color(0, 0, 0));
        buttonEditar.setText("Editar");
        buttonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonEditar)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonRemover)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCadastrar)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(336, 336, 336))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonRemover)
                    .addComponent(buttonEditar))
                .addGap(18, 26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        TelaAdicionarProdutos p = new TelaAdicionarProdutos();
        p.setVisible(true);
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoverActionPerformed
        try{
            if(tabelaProdutos.getSelectedRow()>=0){
                String id = (String) tabelaProdutos.getValueAt(tabelaProdutos.getSelectedRow(),0);
                int respota = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o Produto selecionado " + id + "?");
                if(respota ==0){
                    ProdutoJPA.excluir((Integer.parseInt(id)));
                    JOptionPane. showMessageDialog(this, "Registro excluído com sucesso");
                    List<Produto> lista = ProdutoJPA.listar();
                    preencherTabela(lista);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_ButtonRemoverActionPerformed

    private void buttonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEditarActionPerformed
       AlterarProduto a = new AlterarProduto();
       a.setVisible(true);
    }//GEN-LAST:event_buttonEditarActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonRemover;
    private javax.swing.JButton buttonEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaProdutos;
    // End of variables declaration//GEN-END:variables
}

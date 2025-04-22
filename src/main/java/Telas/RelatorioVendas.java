package Telas;
import HenriFarmas.Venda;
import HenriFarmas.VendaJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class RelatorioVendas extends javax.swing.JFrame {

    
    public RelatorioVendas() {
        initComponents();
        List<Venda> listar= VendaJPA.listar();
        preencher(listar);
    }
    public void preencher(List<Venda> vendas){
        String coluna[] = {"ID","Data","TOTAL","CLIENTE"};
        String dados[][] = new String[vendas.size()][coluna.length];
        int i = 0;
        for(Venda v : vendas){
            dados[i] = new String[]{
                String.valueOf(v.getId()),
                String.valueOf(v.getData()),
                String.valueOf(v.getTotal()),
                v.getCliente().getNome()
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados,coluna);
        tabelaVendas.setModel(model);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVendas = new javax.swing.JTable();
        ButtonRemover = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatorio Vendas");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Relatório Vendas");

        tabelaVendas.setBackground(new java.awt.Color(255, 255, 255));
        tabelaVendas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tabelaVendas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabelaVendas.setForeground(new java.awt.Color(0, 0, 0));
        tabelaVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabelaVendas);

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ButtonRemover)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonCadastrar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addGap(168, 168, 168)))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ButtonRemover)
                            .addComponent(ButtonCadastrar))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(336, 336, 336))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCadastrarActionPerformed
        TelaAdicionarVenda v = new TelaAdicionarVenda();
        v.setVisible(true);
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoverActionPerformed
        try{
        int linha = tabelaVendas.getSelectedRow();
        if(linha >= 0){
            String id = (String) tabelaVendas.getValueAt(linha, 0);
            int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir a venda de ID " + id + "?");
            if(resposta == 0){
                VendaJPA.excluir(Integer.parseInt(id));
                JOptionPane.showMessageDialog(this, "Venda excluída com sucesso!");
                List<Venda> listar= VendaJPA.listar();
                preencher(listar); 
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma venda para remover.");
        }
    } catch(Exception e){
        JOptionPane.showMessageDialog(this, "Erro ao excluir venda:\n" + e.getMessage());
    }
    }//GEN-LAST:event_ButtonRemoverActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioVendas().setVisible(true);
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
    private javax.swing.JTable tabelaVendas;
    // End of variables declaration//GEN-END:variables
}

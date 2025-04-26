package Telas;
import HenriFarmas.Cliente;
import HenriFarmas.ClienteJPA;
import HenriFarmas.Funcionario;
import HenriFarmas.FuncionarioJPA;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class RelatorioClientes extends javax.swing.JFrame {

    public RelatorioClientes() {
        initComponents();
        List<Cliente> lista = ClienteJPA.listarClientes();
        preencherTabela(lista);
    }
    public void  preencherTabela(List<Cliente> cliente){
        String colunas[] = {"ID","Nome","CPF","Endereco","Telefone"};
        String dados[][] = new String[cliente.size()][colunas.length];
        int i = 0;
        for(Cliente c: cliente){
            dados[i] = new String[]{
                String.valueOf(c.getId()),
                c.getNome(),
                c.getCpf(),
                c.getEndereco(),
                c.getTelefone()
            };
            i++;
        }
        DefaultTableModel model = new DefaultTableModel(dados,colunas);
        TabelaCliente.setModel(model);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaCliente = new javax.swing.JTable();
        ButtonRemover = new javax.swing.JButton();
        ButtonCadastrar = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatória de Clientes");

        jPanel1.setBackground(new java.awt.Color(0, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Historic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Relatório Clientes");

        TabelaCliente.setBackground(new java.awt.Color(255, 255, 255));
        TabelaCliente.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TabelaCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TabelaCliente.setForeground(new java.awt.Color(0, 0, 0));
        TabelaCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TabelaCliente);

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

        ButtonAlterar.setBackground(new java.awt.Color(255, 255, 255));
        ButtonAlterar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ButtonAlterar.setForeground(new java.awt.Color(0, 0, 0));
        ButtonAlterar.setText("Editar");
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 45, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ButtonRemover)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ButtonAlterar)
                            .addGap(18, 18, 18)
                            .addComponent(ButtonCadastrar))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(336, 336, 336))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(119, 119, 119)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonRemover)
                    .addComponent(ButtonCadastrar)
                    .addComponent(ButtonAlterar))
                .addGap(14, 56, Short.MAX_VALUE))
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
        TelaAdicionarClientes c = new TelaAdicionarClientes();
        c.setVisible(true);
        List<Cliente> lista = ClienteJPA.listarClientes();
        preencherTabela(lista);
    }//GEN-LAST:event_ButtonCadastrarActionPerformed

    private void ButtonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRemoverActionPerformed
        try{
            if(TabelaCliente.getSelectedRow()>=0){
                String id = (String) TabelaCliente.getValueAt(TabelaCliente.getSelectedRow(),0);
                int respota = JOptionPane.showConfirmDialog(this, "Deseja mesmo excluir o Cliente selecionado " + id + "?");
                if(respota ==0){
                    ClienteJPA.removerCliente((Integer.parseInt(id)));
                    JOptionPane. showMessageDialog(this, "Registro excluído com sucesso");
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Ocorreu uma falha:\n" + e.getMessage());
        }
    }//GEN-LAST:event_ButtonRemoverActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        AlterarCliente c = new AlterarCliente();
        c.setVisible(true);
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RelatorioClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonCadastrar;
    private javax.swing.JButton ButtonRemover;
    private javax.swing.JTable TabelaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

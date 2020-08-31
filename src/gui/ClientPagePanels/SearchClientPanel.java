/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui.ClientPagePanels;

import Controllers.ClientController;
import Entities.Client;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TabExpander;

/**
 *
 * @author User
 */
public class SearchClientPanel extends javax.swing.JPanel {
    
    private static int limiter1 = 0;
    Table tab = new Table();
   // private JTable table = new JTable();

    /**
     * Creates new form SearchClientPanel
     */
    public SearchClientPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        FirstNameField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        tablePanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();

        jLabel1.setText("First Name");

        searchButton.setText("search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Last Name");

        tablePanel.setLayout(new java.awt.BorderLayout());

        editBtn.setText("edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(editBtn)
                .addGap(18, 18, 18)
                .addComponent(deleteBtn)
                .addContainerGap(248, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        tablePanel.add(jPanel1, java.awt.BorderLayout.PAGE_END);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LastNameField))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(searchButton)
                            .addGap(18, 18, 18)
                            .addComponent(cancelButton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        limiter1 = 0;
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String firstName = FirstNameField.getText();
        String lastName = LastNameField.getText();
        if (firstName != null && firstName.trim().isEmpty()) {
            firstName = null;
            lastName = null;
        }
        if (lastName != null && lastName.trim().isEmpty()) {
            lastName = null;
        }
        new SearchClientPerformed(firstName,lastName).execute();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here
        int i = tab.table.getSelectedRow();
        if(i == -1)return;
        
        String s = (String)tab.table.getValueAt(i, 0);
        Client cl = new Client(Integer.parseInt(s));
        new DeleteStudentWorker(cl).execute();
     
        ((DefaultTableModel)tab.table.getModel()).removeRow(i);
        tablePanel.removeAll();
        tablePanel.add(tab);
        tablePanel.add(jPanel1,BorderLayout.PAGE_END);
        tablePanel.repaint();
        tablePanel.revalidate();
        
        
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        int i = tab.table.getSelectedRow();
        if(i == -1)return;
        
        String s = (String)tab.table.getValueAt(i, 0);
        Client cl = new Client(Integer.parseInt(s),(String)tab.table.getValueAt(i, 1),(String)tab.table.getValueAt(i, 2),(String)tab.table.getValueAt(i, 3),(String)tab.table.getValueAt(i, 4));
       // System.out.println(cl);
        
        editClient editClientFrame = new editClient(cl);
        editClientFrame.setVisible(true);
    }//GEN-LAST:event_editBtnActionPerformed
private class SearchClientPerformed extends SwingWorker<List<Client>, Void> {

        private final String fName;
        private final String lName;

        public SearchClientPerformed(String firstName,String lastName) {
            this.fName = firstName;
            this.lName = lastName;
        }

        @Override
        protected List<Client> doInBackground() throws Exception {
            return ClientController.instance.findByLike(fName , lName);
        }

        @Override
        public void done() {
            //Table tab = new Table();
            try {
                if(get() == null){
                    return;
                }else{
                    tab= new Table(get());
                    
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(SearchClientPanel.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(SearchClientPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (limiter1 == 0) {
            
            tablePanel.add(tab);
            tablePanel.repaint();
            tablePanel.revalidate();
            limiter1++;
            }else{
                limiter1 = 0;
                tablePanel.removeAll();
                tablePanel.add(tab);
                tablePanel.add(jPanel1,BorderLayout.PAGE_END);
                tablePanel.repaint();
                tablePanel.revalidate();
            }
            
           
        }
    }
public class Table extends JPanel{
    public JTable table;

    public Table(List<Client> ls ){

        String [] header={"id","first name","last name","phone","location"};
        List<String[]> values = new ArrayList<String[]>();
        
        for (Client cl : ls) {
            values.add(new String[] {String.valueOf(cl.getId()),cl.getFirstName(),cl.getLastName(),cl.getPhone(),cl.getLocation()});
        }


        DefaultTableModel model = new DefaultTableModel(values.toArray(new Object[][] {}),header);

        table = new JTable(model);

        table.setPreferredScrollableViewportSize(new Dimension(450,100));
        table.setFillsViewportHeight(true);

        JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        add(js);

    }
     public Table(){
    }
}
private class DeleteStudentWorker extends SwingWorker<String, Void> {

        private Client std;

        public DeleteStudentWorker(Client std) {
            this.std = std;
        }

        @Override
        protected String doInBackground() throws Exception {
            ClientController.instance.deleteByKey(std);
            return null;
        }

        @Override
        public void done() {
            try {
                if (get() == null) {
                   
                }
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(SearchClientPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton searchButton;
    private javax.swing.JPanel tablePanel;
    // End of variables declaration//GEN-END:variables
}

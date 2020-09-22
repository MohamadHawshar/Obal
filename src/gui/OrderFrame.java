/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Controllers.AnalyseController;
import Controllers.ClientController;
import Controllers.DoctorController;
import Controllers.OrderController;
import Entities.Analysis;
import Entities.Client;
import Entities.Doctor;
import Entities.Order;
import static com.sun.webkit.perf.WCGraphicsPerfLogger.reset;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.MediaSize;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingWorker;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import utilities.AnalysisTableModel;
import utilities.AutoCompletion;
import utilities.ClientsTableModel;
import utilities.DataSource;

/**
 *
 * @author lenovo
 */
public class OrderFrame extends javax.swing.JPanel {

    private Client currentCient = null;
    private Order currentOrder = null;
    public Order listOrder=null;
    private final ClientsTableModel clientModel = new ClientsTableModel();
    private final DefaultComboBoxModel doctorModel = new DefaultComboBoxModel();
    private final DefaultComboBoxModel analyseModel = new DefaultComboBoxModel();
    private final AnalysisTableModel analysisTableModel=new AnalysisTableModel();
    private static int idOrder=43;
    public Object shared=new Object();
    /**
     * Creates new form OrderFrame
     */
    public OrderFrame() {

        initComponents();
        setVisible(true);
        initialize();
    }

    private void initialize() {
        clientsTable.setModel(clientModel);
        clientsTable.getColumnModel().getColumn(0).setMinWidth(256);
        clientsTable.getColumnModel().getColumn(0).setMaxWidth(256);
        clientsTable.getColumnModel().getColumn(1).setMinWidth(128);
        clientsTable.getColumnModel().getColumn(1).setMaxWidth(128);
        new InitializeDoctorsComboBox().execute();
        AutoCompletion.enable(doctorComboBox);
        new InitializeAnalysisComboBox().execute();
        AutoCompletion.enable(analysisComboBox);
        analysisTable.setModel(analysisTableModel);
        /*       clientsTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

         @Override
         public void valueChanged(ListSelectionEvent e) {
                  
         }
         });*/
    }
     private void clear(){
     
         clientModel.removeAll();
         doctorModel.setSelectedItem(doctorModel.getElementAt(0));
         analysisTableModel.removeAll();
         
     }
     
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        saveBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        analysisTable = new javax.swing.JTable();
        analysisComboBox = new javax.swing.JComboBox();
        addAnalysisBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        firstNameField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        clientsTable = new javax.swing.JTable();
        doctorComboBox = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        lastNameField = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        editBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        saveBtn.setText("Save Order");
        saveBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                saveBtnMousePressed(evt);
            }
        });

        deleteBtn.setText("Delete Order");
        deleteBtn.setEnabled(false);
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        analysisTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        analysisTable.setPreferredSize(new java.awt.Dimension(900, 250));
        jScrollPane1.setViewportView(analysisTable);

        analysisComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        addAnalysisBtn.setText("ADD TEST");
        addAnalysisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAnalysisBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("First name");

        firstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameFieldActionPerformed(evt);
            }
        });

        clientsTable.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        clientsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        clientsTable.setRowHeight(25);
        clientsTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(clientsTable);
        clientsTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (clientsTable.getColumnModel().getColumnCount() > 0) {
            clientsTable.getColumnModel().getColumn(0).setResizable(false);
            clientsTable.getColumnModel().getColumn(1).setResizable(false);
            clientsTable.getColumnModel().getColumn(2).setResizable(false);
        }

        doctorComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchButton.setText("SEARCH");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jButton5.setText("Remove test");

        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("First name");

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        jSeparator1.setBorder(new javax.swing.border.MatteBorder(null));

        jLabel4.setText("Search Clients ");

        editBtn.setText("Edit Order");
        editBtn.setEnabled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(analysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addAnalysisBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(doctorComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 121, Short.MAX_VALUE)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(editBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jButton5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(13, 13, 13)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                    .addComponent(firstNameField)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchButton)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lastNameField))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(doctorComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addAnalysisBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(analysisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
        new OrderFrame.DeleteOrderPerformed(listOrder).execute();
        
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void addAnalysisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAnalysisBtnActionPerformed
        // TODO add your handling code here:
            
        Analysis a=(Analysis) analysisComboBox.getSelectedItem();
        if(!analysisTableModel.contains(a))
            analysisTableModel.add(a);
            
            
    }//GEN-LAST:event_addAnalysisBtnActionPerformed

    private void firstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        clientModel.removeAll();
        new SearchClientPerformed(firstName, lastName).execute();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveBtnMousePressed
        // TODO add your handling code here:
        
        Client client ;
        if(clientsTable.getSelectedRow()==-1){
             JOptionPane.showMessageDialog(OrderFrame.this,
                            "Please Select a Client",
                            "Adding Failed ",
                            JOptionPane.INFORMATION_MESSAGE);
                  return;
        }
        if(doctorComboBox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(OrderFrame.this,
                            "Please Select a Doctor",
                            "Adding Failed ",
                            JOptionPane.INFORMATION_MESSAGE);
                  return;
        }
        Doctor doctor = (Doctor) doctorComboBox.getSelectedItem();
        client=clientModel.get
        (clientsTable.getSelectedRow());
        LocalDate date = LocalDate.now();
        List<Analysis> list=analysisTableModel.getAll();
        Order order = new Order();
        order.setClient(client);
        order.setDoctor(doctor);
        order.setDate(date);
        order.setPaid(false);
        order.setListOrders(list);
        order.setId(idOrder);
        currentOrder = order;
        new OrderFrame.SaveOrderPerformed(currentOrder).execute();
        idOrder++;

        
    }//GEN-LAST:event_saveBtnMousePressed

    private class SearchClientPerformed extends SwingWorker<List<Client>, Void> {

        private final String fName;
        private final String lName;

        public SearchClientPerformed(String firstName, String lastName) {
            this.fName = firstName;
            this.lName = lastName;
        }

        @Override
        protected List<Client> doInBackground() throws Exception {
            return ClientController.instance.findByLike(fName, lName);
        }

        @Override
        public void done() {
            //Table tab = new Table();
            try {
                clientModel.set(get());
                clientsTable.setModel(clientModel);
                repaint();
            } catch (InterruptedException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    
    public JButton getDelete(){
        return deleteBtn;
    }
    public JButton getSave(){
        return saveBtn;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAnalysisBtn;
    private javax.swing.JComboBox analysisComboBox;
    private javax.swing.JTable analysisTable;
    private javax.swing.JTable clientsTable;
    public javax.swing.JButton deleteBtn;
    private javax.swing.JComboBox doctorComboBox;
    public javax.swing.JButton editBtn;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables

    private class SaveOrderPerformed extends SwingWorker<String, Void> {

        private Order order;

        public SaveOrderPerformed(Order order) {
            this.order = order;
        }

        @Override
        protected String doInBackground() throws Exception {
            try {
                OrderController.instance.create(order);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage() );
                return ex.getMessage();
            }
            return null;
        }

        @Override
        public void done() {
            try {
            
                get();
                    JOptionPane.showMessageDialog(OrderFrame.this,
                            " has been added successfully",
                            "Successful adding",
                            JOptionPane.INFORMATION_MESSAGE);
                  
                    reset();
                
            } catch (InterruptedException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(Order.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    private class DeleteOrderPerformed extends SwingWorker<String, Void> {

        private Order order;

        public DeleteOrderPerformed(Order order) {
            this.order = order;
        }

        @Override
        protected String doInBackground() throws Exception {
            OrderController.instance.delete(order);
            return null;
        }

        @Override
        public void done() {
            try {
                if (get() == null) {
                    //clear screen
                     JOptionPane.showMessageDialog(OrderFrame.this,
                            "Order has been deleted successfully",
                            "Successful delete",
                            JOptionPane.INFORMATION_MESSAGE);
                             reset();
                } else {
                    JOptionPane.showMessageDialog(OrderFrame.this,
                            order.toString() + " has errors",
                            "entry error",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class InitializeDoctorsComboBox extends SwingWorker<List<Doctor>, Void> {

        @Override
        protected List<Doctor> doInBackground() throws Exception {
            return DoctorController.instance.findAll();
        }

        @Override
        public void done() {
            //Table tab = new Table();
            try {
                if (get() == null) {
                    return;
                } else {
                    doctorModel.addElement("Select a Doctor");
                    List<Doctor> list;
                    list = get();
                    for (Doctor d : get()) {
                        doctorModel.addElement(d);
                    }
                    doctorComboBox.setModel(doctorModel);

                }
            } catch (InterruptedException | ExecutionException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    private class InitializeAnalysisComboBox extends SwingWorker<List<Analysis>, Void> {

        @Override
        protected List<Analysis> doInBackground() throws Exception {
            return AnalyseController.instance.findAll();
        }

        @Override
        public void done() {
            try {
                if (get() == null) {
                    return;
                } else {
                    List<Analysis> list;
                    list = get();
                    for (Analysis a : get()) {
                        analyseModel.addElement(a);
                    }
                    analysisComboBox.setModel(analyseModel);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ExecutionException ex) {
                Logger.getLogger(OrderFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    
    
    
    
    
    

}

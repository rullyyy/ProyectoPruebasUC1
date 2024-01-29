/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import dominio.Task;
import java.time.LocalDateTime;
import javax.swing.JOptionPane;
import negocio.TaskBusiness;

/**
 *
 * @author xfs85
 */
public class EditTaskFrm extends javax.swing.JFrame {

    Task taskForEditMethod;
    TaskBusiness taskBs = new TaskBusiness();

    /**
     * Creates new form EditTaskFrm
     */
    public EditTaskFrm(Task taskToEdit) {
        initComponents();
        this.taskForEditMethod = taskToEdit;
        txtName.setText(taskToEdit.getName());
        dateTimePicker1.setDateTimeStrict(taskToEdit.getFinalDate());
        this.taskForEditMethod = taskToEdit;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        dateTimePicker1 = new com.github.lgooddatepicker.components.DateTimePicker();
        cmbColor = new javax.swing.JComboBox<>();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Editar Tarea");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(dateTimePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        cmbColor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin color", "Rojo", "Azul", "Verde", "Amarillo", "Morado", "Rosa", "Naranja" }));
        jPanel1.add(cmbColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 250, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/EditTask.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 400, 300));

        cancelBtn.setBorderPainted(false);
        cancelBtn.setContentAreaFilled(false);
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(cancelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 110, 30));

        editBtn.setBorderPainted(false);
        editBtn.setContentAreaFilled(false);
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });
        jPanel1.add(editBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 243, 110, 30));

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
public boolean verificaFormatosVacios() {
        String nombreTarea = txtName.getText().trim();

        if (nombreTarea.isBlank()) {
            JOptionPane.showMessageDialog(null, "Debe proporcionar un nombre de tarea válido");
            return false;
        }

        return true;
    }

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        if(verificaFormatosVacios() == true){
        if (verificarFecha() == true) {
            this.taskForEditMethod.setName(this.txtName.getText().trim());
            this.taskForEditMethod.setColor(this.cmbColor.getSelectedItem().toString());
            this.taskForEditMethod.setFinalDate(this.dateTimePicker1.getDateTimeStrict());

            taskBs.edit(this.taskForEditMethod);
            this.dispose();
            new ToDoFrm().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fecha valida");
        }

        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        this.dispose();
        new ToDoFrm().setVisible(true);
    }//GEN-LAST:event_cancelBtnActionPerformed
    public boolean verificarFecha() {
        LocalDateTime fechaSeleccionada = dateTimePicker1.getDateTimeStrict();
        LocalDateTime fechaActual = LocalDateTime.now();

        if (fechaSeleccionada == null) {
            return true;
        } else if (fechaSeleccionada.isBefore(fechaActual) || fechaSeleccionada.equals(fechaActual)) {
            return false;
        }

        return true;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> cmbColor;
    private com.github.lgooddatepicker.components.DateTimePicker dateTimePicker1;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

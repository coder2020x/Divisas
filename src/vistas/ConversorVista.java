/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistas;
import java.awt.Color;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListCellRenderer;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
/**
 *
 * @author braya
 */
public class ConversorVista extends javax.swing.JFrame {

    /**
     * Creates new form ConversorVista
     */
    public ConversorVista() {
        initComponents();
         comboadd();
    }
    private void comboadd() {
             try {
             JSONParser parser = new JSONParser();
             JSONObject json = (JSONObject) parser.parse(new FileReader("src/json/data.json")); 
             JSONObject symbols = (JSONObject) json.get("symbols");
             Iterator<Map.Entry<String, String>> iterator = symbols.entrySet().iterator();
             while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                String key = entry.getKey();
                String value = entry.getValue();
                SeleccionO.addItem(key + ": " + value);  
                SeleccionD.addItem(key + ": " + value);
            }
            SeleccionO.setBackground(Color.BLUE);
            SeleccionO.setForeground(Color.WHITE);
            SeleccionO.setRenderer(new CustomComboBoxRenderer());
            SeleccionD.setBackground(Color.BLUE);
            SeleccionD.setForeground(Color.WHITE);
            SeleccionD.setRenderer(new CustomComboBoxRenderer());
            jPanel1.setBorder(new LineBorder(Color.GRAY, 2));
            jPanel1.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.2f));
        
            } catch (IOException | ParseException e) {
            } 
    }
     private static class CustomComboBoxRenderer extends DefaultListCellRenderer {
        @Override
        public java.awt.Component getListCellRendererComponent(javax.swing.JList<?> list,
                                                               Object value,
                                                               int index,
                                                               boolean isSelected,
                                                               boolean cellHasFocus) {
            java.awt.Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            // Personaliza el aspecto aquí (por ejemplo, cambia la fuente o el color de fondo)
            // Ejemplo: component.setFont(new Font("Arial", Font.BOLD, 14));
            // Ejemplo: component.setBackground(Color.YELLOW);            component.setBackground(Color.GRAY);
            if (isSelected) {
                this.setForeground(Color.BLUE);
                this.setBackground(Color.WHITE);
            } else {
                this.setBackground(Color.GRAY);
                this.setForeground(Color.WHITE);
            }
            return this;
        }
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
        nameConsulta = new javax.swing.JLabel();
        textConsulta = new javax.swing.JTextField();
        BotonConsulta = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        SeleccionO = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        SeleccionD = new javax.swing.JComboBox<>();
        loader = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nameConsulta.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nameConsulta.setText("Conversor de Moneda");
        jPanel1.add(nameConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 199, 272, 40));

        textConsulta.setForeground(new java.awt.Color(204, 204, 204));
        textConsulta.setText("Ingrese un valor a consultar");
        textConsulta.setBorder(null);
        textConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                textConsultaMousePressed(evt);
            }
        });
        textConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textConsultaActionPerformed(evt);
            }
        });
        jPanel1.add(textConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 245, 358, 43));

        BotonConsulta.setBackground(new java.awt.Color(0, 134, 190));
        BotonConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BotonConsultaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonConsultaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BotonConsultaMousePressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CONSULTAR");

        javax.swing.GroupLayout BotonConsultaLayout = new javax.swing.GroupLayout(BotonConsulta);
        BotonConsulta.setLayout(BotonConsultaLayout);
        BotonConsultaLayout.setHorizontalGroup(
            BotonConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonConsultaLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        BotonConsultaLayout.setVerticalGroup(
            BotonConsultaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BotonConsultaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(BotonConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(143, 394, -1, -1));

        SeleccionO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moneda de Origen" }));
        SeleccionO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionOActionPerformed(evt);
            }
        });
        jPanel1.add(SeleccionO, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 314, 148, 40));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 291, 368, 11));

        SeleccionD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Moneda de Cambio" }));
        jPanel1.add(SeleccionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 314, 150, 40));

        loader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/loader.gif"))); // NOI18N
        jPanel1.add(loader, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 71, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionOActionPerformed

    private void BotonConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConsultaMousePressed
        textConsulta.setText("Ingrese un valor a consultar");
        textConsulta.setForeground(new Color(204,204,204));
        loader.setIcon(new ImageIcon("src/images/wait.gif"));
        loader.setHorizontalAlignment(JLabel.CENTER);
        loader.setVerticalAlignment(JLabel.CENTER);
        textConsulta.setVisible(false);
    }//GEN-LAST:event_BotonConsultaMousePressed

    private void BotonConsultaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConsultaMouseExited
        BotonConsulta.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_BotonConsultaMouseExited

    private void BotonConsultaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonConsultaMouseEntered
        BotonConsulta.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_BotonConsultaMouseEntered

    private void textConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textConsultaActionPerformed

    private void textConsultaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textConsultaMousePressed
        textConsulta.setText("");
        textConsulta.setForeground(Color.black);
        //textConsulta.setText("Ingrese un valor a consultar");
    }//GEN-LAST:event_textConsultaMousePressed

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
            java.util.logging.Logger.getLogger(ConversorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConversorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConversorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConversorVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConversorVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BotonConsulta;
    private javax.swing.JComboBox<String> SeleccionD;
    private javax.swing.JComboBox<String> SeleccionO;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel loader;
    private javax.swing.JLabel nameConsulta;
    private javax.swing.JTextField textConsulta;
    // End of variables declaration//GEN-END:variables
}

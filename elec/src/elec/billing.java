/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package elec;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;




/**
 *
 * @author Harshal
 */
public class billing extends javax.swing.JFrame {

    /**
     * Creates new form billing
     */
    public billing() {
        initComponents();
         Color c =new Color(135, 206, 235);
                getContentPane().setBackground(c);
             
        
        
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","HLmali27");
           Statement s=con.createStatement();
            ResultSet rs = s.executeQuery("select * from customer");
            while(rs.next()) {
                meter.addItem(rs.getString("meter_no"));
            }
        } catch (Exception e) {
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

        meter = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        unit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        bill = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cal = new javax.swing.JButton();
        send = new javax.swing.JButton();
        fetch = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Meter No");

        jLabel2.setText("name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Unit");

        jLabel4.setText("Bill");

        jLabel5.setText("Mob No.");

        cal.setBackground(new java.awt.Color(255, 255, 102));
        cal.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cal.setText("CALCULATE");
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });

        send.setBackground(new java.awt.Color(255, 255, 102));
        send.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        send.setText("SEND");
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });

        fetch.setBackground(new java.awt.Color(255, 255, 102));
        fetch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fetch.setText("FETCH");
        fetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetchActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel9.setText("BILLING PAGE");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/elec/elec_1.jpg"))); // NOI18N
        jLabel8.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(fetch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(cal)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(name)
                                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mob)
                                    .addComponent(bill)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(meter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cal, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(send, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fetch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void fetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetchActionPerformed

         if(evt.getSource()==fetch)
        {
            
               try {
              Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs?zeroDateTimeBehavior=CONVERT_TO_NULL","root","HLmali27");
           Statement s=con.createStatement();
    ResultSet rs = s.executeQuery("SELECT * FROM meter WHERE meter_no='" + meter.getSelectedItem().toString() + "'");
            while(rs.next()) {
              name.setText(rs.getString("name"));
              unit.setText(rs.getString("unit"));
              
                               JOptionPane.showMessageDialog(null, "Fetched!");
                
                
            }
        } catch (Exception e) {
        }
            
        }
 
    }//GEN-LAST:event_fetchActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
      
        int unit1 = Integer.parseInt(unit.getText());
        
        
            double rate;
            if (unit1 <= 100) {
                rate = 7.0;
            } else {
                rate = 10.0;
            }

            double billAmount = unit1 * rate;
            
            bill.setText(String.valueOf(billAmount));
             JOptionPane.showMessageDialog(this, "Calculated!!");
        
    }//GEN-LAST:event_calActionPerformed

    private void sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendActionPerformed
        

    String message = "Hello " + name.getText()+ ",\n\n";
    message += "Your meter number: " + meter.getSelectedItem().toString() + "\n";
    message += "Units consumed: " + unit.getText() + "\n";
    message += "Your bill amount: " + bill.getText() + "/-\n\n";
    message += "Thank you for using our service!";
  
    
    
    try
    {
    
    String phone = mob.getText();
		String username = "abcd";
		String password = "1234";
		String address = "http://192.168.59.226";
		String port = "8090";
		
		URL url = new URL(
				address+":"+port+"/SendSMS?username="+username+"&password="+password+
				"&phone="+phone+"&message="+URLEncoder.encode(message,"UTF-8"));
		
		URLConnection connection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		while((inputLine = bufferedReader.readLine()) !=null){
			System.out.println(inputLine);
		}
		bufferedReader.close();
                
                  JOptionPane.showMessageDialog(this, "Message Sent Successfully!!!");
                
                
		
    
    }catch(Exception e)
    {
        System.out.println(e);
    }
    
    


        
        
        
        
        
        
        
    }//GEN-LAST:event_sendActionPerformed

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
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bill;
    private javax.swing.JButton cal;
    private javax.swing.JButton fetch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> meter;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField name;
    private javax.swing.JButton send;
    private javax.swing.JTextField unit;
    // End of variables declaration//GEN-END:variables
}

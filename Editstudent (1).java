/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package feereportmanagement;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
 class Editstudent extends javax.swing.JFrame {
        static Editstudent frame;
    /**
     * Creates new form Editstudent
     */
    public Editstudent() {
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
         jPanel1 = new javax.swing.JPanel();
jPanel1.setBackground(new java.awt.Color(0, 204, 204));	


        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rollnotext = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nametext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addresstext = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        mailidtext = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        contacttext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tutiontext = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        booktext = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        deptcombo = new javax.swing.JComboBox();
        yearcombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        messtext = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        depttext = new javax.swing.JTextField();
        Updatebtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cgpatext = new javax.swing.JTextField();
        submitbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(242, 37, 199));
        jLabel1.setForeground(new java.awt.Color(0, 39, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEPCO SCHLENK ENGINEERING COLLEGE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Student");

        jLabel3.setText("Roll no:");

        jLabel4.setText("Name:");

        jLabel5.setText("Department:");

        jLabel6.setText("Year:");

        jLabel7.setText("Address:");

        jLabel8.setText("Mail Id:");

        jLabel9.setText("Contact no:");

        jLabel10.setText("Tution Fees:");

        jLabel11.setText("Book Fees:");

        deptcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CSE", "ECE", "EEE", "MECH", "CIVIL" }));
        deptcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptcomboActionPerformed(evt);
            }
        });

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));

        jLabel12.setText("Mess Fees:");

        jLabel13.setText("Department Fees:");

        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        jLabel14.setText("CGPA:");

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yearcombo, 0, 160, Short.MAX_VALUE)
                            .addComponent(addresstext)
                            .addComponent(mailidtext)
                            .addComponent(contacttext)
                            .addComponent(tutiontext)
                            .addComponent(booktext)
                            .addComponent(messtext)
                            .addComponent(depttext)
                            .addComponent(cgpatext)
                            .addComponent(rollnotext)
                            .addComponent(nametext)
                            .addComponent(deptcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(Updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(submitbtn)))
                .addContainerGap(128, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rollnotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitbtn)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mailidtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(contacttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tutiontext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(booktext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(messtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(depttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cgpatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updatebtn)
                    .addComponent(backbtn))
                .addGap(24, 24, 24))
        );
        javax.swing.GroupLayout layout1 = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout1);
        layout1.setHorizontalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout1.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout1.setVerticalGroup(
            layout1.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout1.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        int rollno=Integer.parseInt(rollnotext.getText());
        String name=nametext.getText();
        String dept=deptcombo.getSelectedItem().toString();
        System.out.println("dept name"+dept);
         String year=yearcombo.getSelectedItem().toString();
         String address=addresstext.getText();
         String mailid=mailidtext.getText();
         String contact=contacttext.getText();
         int tution=Integer.parseInt(tutiontext.getText());
         int book=Integer.parseInt(booktext.getText());
          int mess=Integer.parseInt(messtext.getText());
           int deptfees=Integer.parseInt(depttext.getText());
           float cgpa=Float.parseFloat(cgpatext.getText());
           ArrayList<String> data=new ArrayList<String>();
           int total=tution+book+mess+deptfees;
           int paid=0,due,discount;
           data.add(String.valueOf(rollno));
           data.add(name);
           data.add(dept);
           data.add(year);
           data.add(address);
           data.add(mailid);
           data.add(contact);
           data.add(String.valueOf(tution));
           data.add(String.valueOf(book));
           data.add(String.valueOf(mess));
           data.add(String.valueOf(deptfees));
           data.add(String.valueOf(cgpa));
           if(cgpa>=9)
           {
             discount=10000;
             
            data.add("10000");    
           }
           else if(cgpa>=8 && cgpa<9)
           {
               discount=5000;
                data.add("5000");   
           }
           else
           {
               discount=0;
               data.add("0");  
           }
           data.add(String.valueOf(total));
            data.add(String.valueOf(paid));
           due=total-discount;
            data.add(String.valueOf(due));
           int status=Studentdb.update(data);
           System.out.println(status);
           if(status>0){
	JOptionPane.showMessageDialog(Editstudent.this,"Student details updated successfully!");
	rollnotext.setText("");nametext.setText("");
	addresstext.setText(""); mailidtext.setText("");
        contacttext.setText("");
        
        tutiontext.setText("");
        booktext.setText("");
        messtext.setText("");
        depttext.setText(""); cgpatext.setText("");
        
	}else{
	JOptionPane.showMessageDialog(Editstudent.this,"Sorry, Unable to update student!");
	}
    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void deptcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptcomboActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed

        if("1".equals(s1[0]))
        {
             String s[]={};
       Studentsection.main(s);
       frame.dispose();
        }
        else
        {
        String s[]={};
       Adminsection.main(s);
       frame.dispose();
        }
    }//GEN-LAST:event_backbtnActionPerformed

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitbtnActionPerformed
        int rollno=Integer.parseInt(rollnotext.getText());
       boolean status=Studentdb.validate1(rollno);
			if(status){
				List<String> list=new ArrayList<>();
                                list=Studentdb.getinfo(rollno);
                                nametext.setText(list.get(1));
                                
	addresstext.setText(list.get(4)); mailidtext.setText(list.get(5));
        contacttext.setText(list.get(6));
        
        tutiontext.setText(list.get(7));
        booktext.setText(list.get(8));
        messtext.setText(list.get(9));
        depttext.setText(list.get(10)); cgpatext.setText(list.get(11));
				
			}else{
				JOptionPane.showMessageDialog(Editstudent.this,"SOrry Id not exists","Invalid id!",JOptionPane.ERROR_MESSAGE);
			}
    }//GEN-LAST:event_submitbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        s1=args;
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
            java.util.logging.Logger.getLogger(Editstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame=new Editstudent();
                frame.setVisible(true);
            }
        });
    }
    static String[] s1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Updatebtn;
    private javax.swing.JTextField addresstext;
    private javax.swing.JButton backbtn;
    private javax.swing.JTextField booktext;
    private javax.swing.JTextField cgpatext;
    private javax.swing.JTextField contacttext;
    private javax.swing.JComboBox deptcombo;
    private javax.swing.JTextField depttext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailidtext;
    private javax.swing.JTextField messtext;
    private javax.swing.JTextField nametext;
    private javax.swing.JTextField rollnotext;
    private javax.swing.JButton submitbtn;
    private javax.swing.JTextField tutiontext;
    private javax.swing.JComboBox yearcombo;
      private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

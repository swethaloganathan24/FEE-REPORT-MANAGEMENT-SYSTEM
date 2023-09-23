
package feereportmanagement;

import javax.swing.JOptionPane;
import java.util.Date;

public class Addfees extends javax.swing.JFrame {
    static Addfees frame;
    public Addfees() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
         jPanel1 = new javax.swing.JPanel();
jPanel1.setBackground(new java.awt.Color(0, 204, 204));	


        
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rollnoedit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        yearcombo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        feesdetailscombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        namedit = new javax.swing.JTextField();
        amounttext = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        paymentmodecombo = new javax.swing.JComboBox();
        datetext = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(242, 37, 199));
        jLabel1.setForeground(new java.awt.Color(0, 39, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEPCO SCHLENK ENGINEERING COLLEGE");

        jLabel2.setForeground(new java.awt.Color(255, 51, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Fees");

        jLabel3.setText("Roll no:");

        jLabel4.setText("Amount:");

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));

        jLabel5.setText("Fees Detials:");

        jLabel6.setText("Date");

        feesdetailscombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tution fees", "Book fees", "Mess fees", "Department fees", " " }));

        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setText("Name:");

        jLabel8.setText("Year:");

        jLabel9.setText("Payment Mode:");

        paymentmodecombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Cash", "depitcard", "credit card" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6))
                                        .addGap(72, 72, 72))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(paymentmodecombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(yearcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(namedit)
                                    .addComponent(amounttext)
                                    .addComponent(feesdetailscombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(datetext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rollnoedit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rollnoedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(namedit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(amounttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(feesdetailscombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(paymentmodecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)))
                    .addComponent(datetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rollno=Integer.parseInt(rollnoedit.getText());
        String name=namedit.getText();
        String year=yearcombo.getSelectedItem().toString();
        String amount=amounttext.getText();
        String feesdetails=feesdetailscombo.getSelectedItem().toString();
        String mode=paymentmodecombo.getSelectedItem().toString();
        Date date=datetext.getDate();
         int date1=date.getDate();
        String date2;
        if(date1<10)
            date2="0"+date1;
        else
            date2=""+date1;
            
        int month=date.getMonth()+1;
        String month1;
        if(month<10)
            month1="0"+month;
        else
            month1=""+month;
            
        int year3=date.getYear();
        String year1=""+year3;
        year1="20"+year1.substring(1, 3);
        String datefinal=date2+" "+month1+" "+year1;
        System.out.println(datefinal);
        boolean status1=Studentdb.checkfees(rollno, feesdetails);
        if(status1)
        {
            JOptionPane.showMessageDialog(Addfees.this, feesdetails+" already paid");
        }
        else
        {
        int status=Studentdb.addfees(rollno, name, year, amount, feesdetails, mode, date.toString(),datefinal);
        System.out.println(status);
        if(status>0){
	JOptionPane.showMessageDialog(Addfees.this,"Fees payed successfully!");
	rollnoedit.setText("");namedit.setText("");
	amounttext.setText(""); 
        
	}else{
	JOptionPane.showMessageDialog(Addfees.this,"Sorry, Unable to apay fees!");
	}
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        if("1".equals(s1[0]))
        {
             String s[]={};
       Studentsection.main(s);
       frame.dispose();
        }
        else{
        String s[]={};
       Adminsection.main(s);
       frame.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        s1=args;
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame=new Addfees();
                frame.setVisible(true);
            }
        });
    }
    static String s1[];
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttext;
    private com.toedter.calendar.JDateChooser datetext;
    private javax.swing.JComboBox feesdetailscombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField namedit;
    private javax.swing.JComboBox paymentmodecombo;
    private javax.swing.JTextField rollnoedit;
    private javax.swing.JComboBox yearcombo;
     private javax.swing.JPanel jPanel1;
    // End of variables d
}

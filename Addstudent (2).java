
package feereportmanagement;

import java.util.ArrayList;
import javax.swing.JOptionPane;



 import java.util.regex.Pattern;
class Addstudent extends javax.swing.JFrame {
        static Addstudent frame;
    
    public Addstudent() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
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
        submitbtn = new javax.swing.JButton();
        backbtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        cgpatext = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(242, 37, 199));
        jLabel1.setForeground(new java.awt.Color(0, 39, 239));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MEPCO SCHLENK ENGINEERING COLLEGE");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Add Student");

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
        

        yearcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1st year", "2nd year", "3rd year", "4th year" }));

        jLabel12.setText("Mess Fees:");

        jLabel13.setText("Department Fees:");

        submitbtn.setText("Submit");
        submitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitbtnActionPerformed(evt);
            }
        });

        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                String s[]={};
                Adminsection.main(s);
                frame.dispose();
            }
        });

        jLabel14.setText("CGPA:");

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
                        .addGap(139, 139, 139)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(submitbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rollnotext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitbtn)
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
    }// </editor-fold>                        

    private void submitbtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        String rollno=rollnotext.getText();
        System.out.println("rollno="+rollno);
         
        String name=nametext.getText();
        String dept=deptcombo.getSelectedItem().toString();
        System.out.println("dept name"+dept);
         String year=yearcombo.getSelectedItem().toString();
         String address=addresstext.getText();
         String mailid=mailidtext.getText();
         String contact=contacttext.getText();
         String tution1=tutiontext.getText();
         String book1=booktext.getText();
          String mess1=messtext.getText();
          String deptfees1=depttext.getText();
           String cgpa1=cgpatext.getText();
           String reg = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
	   boolean e = Pattern.compile(reg).matcher(mailid).matches();
            String reg1 = "^[0-9]{10}$";
	   boolean e1 = Pattern.compile(reg1).matcher(contact).matches();    
           int paid=0,due,discount;
           ArrayList<String> data=new ArrayList<String>();
           if(rollno.equals(""))
           {
             JOptionPane.showMessageDialog(Addstudent.this,"Please fill roll no field");  
           }
           else if(name.equals(""))
           {
             JOptionPane.showMessageDialog(Addstudent.this,"Please fill name field");  
           }
           else if(address.equals(""))
           {
                JOptionPane.showMessageDialog(Addstudent.this,"Please fill address field");  
           }
           else if(mailid.equals(""))
           {
                JOptionPane.showMessageDialog(Addstudent.this,"Please fill mailid field");  
           }
           
             else if(e==false)
             {
                 JOptionPane.showMessageDialog(Addstudent.this,"Invalid email id");
             }
           else if(contact.equals(""))
           {
                JOptionPane.showMessageDialog(Addstudent.this,"Please fill contact field");  
           }
           else if(e1==false)
             {
                 JOptionPane.showMessageDialog(Addstudent.this,"Invalid contact no");
             }
            else if(tution1.equals(""))
            {
                 JOptionPane.showMessageDialog(Addstudent.this,"Please fill tuition fee field");  
            }
             else if(book1.equals(""))
             {
                  JOptionPane.showMessageDialog(Addstudent.this,"Please fill book fee field");  
             }
              else if(mess1.equals(""))
              {
                   JOptionPane.showMessageDialog(Addstudent.this,"Please fill mess fee field");  
              }
               else if(deptfees1.equals(""))
               {
                    JOptionPane.showMessageDialog(Addstudent.this,"Please fill dept fee field");  
               }
                else if(cgpa1.equals(""))
                {
                     JOptionPane.showMessageDialog(Addstudent.this,"Please fill cgpa field");  
                }
           else
           {   
           int tution=Integer.parseInt(tution1);
           int book=Integer.parseInt(book1);
           int mess=Integer.parseInt(mess1);
           int deptfees=Integer.parseInt(deptfees1);
           float cgpa=Float.parseFloat(cgpa1);
           int total=tution+book+mess+deptfees;
           data.add(rollno);
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
            
             
            
           int status=Studentdb.save(data);
           System.out.println(status);
           if(status==1){
	JOptionPane.showMessageDialog(Addstudent.this,"Student details added successfully!");
           
          rollnotext.setText("");nametext.setText("");
	addresstext.setText(""); mailidtext.setText("");
        contacttext.setText("");
        
        tutiontext.setText("");
        booktext.setText("");
        messtext.setText("");
        depttext.setText(""); cgpatext.setText("");
           
	}else{
	JOptionPane.showMessageDialog(Addstudent.this,"Sorry, Unable to add student!");
	}
    }                                       
    }
                                          

   
    public static void main(String args[]) {
        
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
             frame= new Addstudent();
            frame.setVisible(true);
            }
        });
    }
                  
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
    // End of variables declaration                   
}

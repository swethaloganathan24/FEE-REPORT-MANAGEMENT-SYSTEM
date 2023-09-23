package feereportmanagement;


import static feereportmanagement.Viewstudent.frame;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;


 class Viewstudent extends JFrame {
	static Viewstudent frame;
	public Viewstudent() {
		//Code to view data in JTable
		List<Student> list=Studentdb.view();
		int size=list.size();
		
		String data[][]=new String[size][16];
		int row=0;
		for(Student a:list){
			data[row][0]=String.valueOf(a.getrollno());
			data[row][1]=a.getName();
                        data[row][2]=a.getdept();
                        data[row][3]=a.getyear();
                        data[row][4]=a.getAddress();
                        data[row][5]=a.getEmail();
			data[row][6]=a.getContactno();
                        data[row][7]=String.valueOf(a.gettution());
                        data[row][8]=String.valueOf(a.getbook());
                        data[row][9]=String.valueOf(a.getmess());
                        data[row][10]=String.valueOf(a.getdeptfees());
                        data[row][11]=String.valueOf(a.getcgpa());
                        data[row][12]=a.gettotal();
                        data[row][13]=a.getpaidfee();
                        data[row][14]=a.getdiscount();
                        data[row][15]=a.getdue();
                       
			
			
			row++;
		}
		String columnNames[]={"Rollno","Name","Department","Year","Address",
                "Mail Id","Contact No","Tution Fees","Book Fees","Mess Fees","Dept Fess","CGPA","Total Amount","Paid amount","Discount","Due Amount"};
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		add(sp);
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 400);
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Viewstudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}


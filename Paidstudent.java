package feereportmanagement;


import static feereportmanagement.Viewstudent.frame;
import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;

import javax.swing.JScrollPane;
import javax.swing.JTable;


public class Paidstudent extends JFrame {
	static Paidstudent frame;
	public Paidstudent() {
		//Code to view data in JTable
		List<Student> list=Studentdb.feereport();
		int size=list.size();
		
		String data[][]=new String[size][8];
		int row=0;
		for(Student a:list){
			data[row][0]=String.valueOf(a.getreceiptno());
			data[row][1]=String.valueOf(a.getrollno());
                        data[row][2]=a.getName();
                        data[row][3]=a.getyear();
                        data[row][4]=a.getamount();
                        data[row][5]=a.getfeesdetails();
			data[row][6]=a.getpaymentmode();
                        data[row][7]=a.getdate();
                        
			
			
			row++;
		}
		String columnNames[]={"Receipt No","Rollno","Name","Year","Amount",
                "Fees Details","Payment mode","Date"};
		
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
					frame = new Paidstudent();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}



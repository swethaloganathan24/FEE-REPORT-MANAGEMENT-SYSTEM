/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package feereportmanagement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
 class Studentdb {
    public static Connection getCon(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mepco","root","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}
    
    public static boolean validate(int rollno,String password){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where rollno=? and password=?");
			ps.setInt(1,rollno);
			ps.setString(2,password);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
     public static boolean checkfees(int rollno,String feesdetails){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where rollno=? and feesdetails=?");
			ps.setInt(1,rollno);
			ps.setString(2,feesdetails);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
    
    public static int changepassword(int rollno,String password){
		int status = 0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("update student set password=? where rollno=?");
			ps.setString(1,password);
			ps.setInt(2,rollno);
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
    
    public static int save(ArrayList<String> a){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into student(rollno,name,department,year,address,mailid,contactno,tutionfees,bookfees,messfees,deptfees,cgpa,password,paid,discount,totalfees,paidfees,Due) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setInt(1,Integer.parseInt(a.get(0)));
                        ps.setString(2,a.get(1));
                        ps.setString(3,a.get(2));
                        ps.setString(4,a.get(3));
                        ps.setString(5,a.get(4));
			ps.setString(6,a.get(5));
                        ps.setString(7,a.get(6));
                        ps.setInt(8,Integer.parseInt(a.get(7)));
                        ps.setInt(9,Integer.parseInt(a.get(8)));
                        ps.setInt(10,Integer.parseInt(a.get(9)));
                        ps.setInt(11,Integer.parseInt(a.get(10)));
                        ps.setFloat(12,Float.parseFloat(a.get(11)));
                         ps.setString(13,a.get(1));
                         ps.setString(14,"unpaid");
                         
                          ps.setString(15,a.get(12));
                          ps.setString(16,a.get(13));
                          ps.setString(17,a.get(14));
                          ps.setString(18,a.get(15));
			
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    
    public static int addfees(int rollno,String name,String year,String amount,String feesdetails,String mode,String date,String date1){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("insert into receipt(receiptno,rollno,name,year,amount,feesdetails,paymentmode,date,date1) values(null,?,?,?,?,?,?,?,?)");
			ps.setInt(1,rollno);
                        ps.setString(2,name);
                        ps.setString(3,year);
                        ps.setString(4,amount);
			ps.setString(5,feesdetails);
                        ps.setString(6,mode);
                        ps.setString(7,date);
                        ps.setString(8, date1);
                        status=ps.executeUpdate();
                       PreparedStatement ps1=con.prepareStatement("select totalfees,paidfees,Due,discount from student where rollno=?");
                        ps1.setInt(1,rollno);
                        ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				int totalfee=Integer.parseInt(rs.getString(1));
                                int paidfee=Integer.parseInt(rs.getString(2));
                                int duefee=Integer.parseInt(rs.getString(3));
                                int discount=Integer.parseInt(rs.getString(4));
                                String paidstatus;
                                int finalfee=totalfee-discount;
                                paidfee=paidfee+Integer.parseInt(amount);
                                duefee=finalfee-paidfee;
                                
                                if(paidfee==finalfee)
                                    paidstatus="paid";
                                else if(paidfee>0 && paidfee<finalfee)
                                     paidstatus="Partially paid"; 
                                else 
                                     paidstatus="Paid";
                                System.out.println(totalfee);
                                System.out.println(paidfee);
                                System.out.println(duefee);
                                System.out.println("status  "+paidstatus);
				PreparedStatement ps2=con.prepareStatement("update student set paidfees=?,Due=?,paid=? where rollno=?");
                                
                        ps2.setString(1,String.valueOf(paidfee));
                       ps2.setString(2,String.valueOf(duefee));
                       ps2.setString(3,paidstatus);
                        ps2.setInt(4,rollno);
			 status=ps2.executeUpdate();	
                        }
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    
    public static int updatefees(int receiptno,String name,String year,String amount,String feesdetails,String mode,String date,String date1){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("update  receipt set name=?,year=?,amount=?,feesdetails=?,paymentmode=?,date=?,date1=? where receiptno=?");
			
                        ps.setString(1,name);
                      
                        ps.setString(2,year);
                        ps.setString(3,amount);
			ps.setString(4,feesdetails);
                        ps.setString(5,mode);
                        ps.setString(6,date);
                        ps.setString(7, date1);
                       ps.setInt(8,receiptno);
			
			
			status=ps.executeUpdate();
                        PreparedStatement ps1=con.prepareStatement("select totalfees,paidfees,Due,discount from student where name=?");
                        ps1.setString(1,name);
                        ResultSet rs=ps1.executeQuery();
			while(rs.next()){
				int totalfee=Integer.parseInt(rs.getString(1));
                                int paidfee=Integer.parseInt(rs.getString(2));
                                int duefee=Integer.parseInt(rs.getString(3));
                                int discount=Integer.parseInt(rs.getString(4));
                                String paidstatus;
                                int finalfee=totalfee-discount;
                                paidfee=paidfee+Integer.parseInt(amount);
                                duefee=finalfee-paidfee;
                                
                                if(paidfee==finalfee)
                                    paidstatus="paid";
                                else if(paidfee>0 && paidfee<finalfee)
                                     paidstatus="Partially paid"; 
                                else 
                                     paidstatus="Paid";
                                System.out.println(totalfee);
                                System.out.println(paidfee);
                                System.out.println(duefee);
                                System.out.println("status  "+paidstatus);
				PreparedStatement ps2=con.prepareStatement("update student set paidfees=?,Due=?,paid=? where name=?");
                                
                        ps2.setString(1,String.valueOf(paidfee));
                       ps2.setString(2,String.valueOf(duefee));
                        ps2.setString(3,paidstatus);
                        ps2.setString(3,name);
			 status=ps2.executeUpdate();	
                        }
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    
    public static List<Student> view(){
		List<Student> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student a=new Student();
				a.setrollno(rs.getInt(1));
				a.setName(rs.getString(2));
                                a.setdept(rs.getString(3));
                                 a.setyear(rs.getString(4));
                                 a.setAddress(rs.getString(5));
                                 a.setEmail(rs.getString(6));
				a.setContactno(rs.getString(7));
				a.settution(rs.getInt(8));
                                a.setbook(rs.getInt(9));
                                a.setmess(rs.getInt(10));
                                a.setdeptfees(rs.getInt(11));
                                a.setcgpa(rs.getFloat(12));
				a.setpassword(rs.getString(13));
                                a.setpaid(rs.getString(14));
                                a.setdiscount(rs.getString(15));
                                a.settotal(rs.getString(16));
                                a.setpaidfee(rs.getString(17));
                                a.setdue(rs.getString(18));
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
    
     public static List<Student> feereport(){
		List<Student> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt");
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student a=new Student();
                                a.setreceiptno(rs.getInt(1));
				a.setrollno(Integer.parseInt(rs.getString(2)));
				a.setName(rs.getString(3));
                               
                                 a.setyear(rs.getString(4));
                                 a.setamount(rs.getString(5));
                                 a.setfeesdetails(rs.getString(6));
				a.setpaymentmode(rs.getString(7));
				a.setdate(rs.getString(8));
                                
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
     
      public static List<Student> feereport1(String rollno){
		List<Student> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where rollno=?");
			ps.setString(1,rollno);
                        ResultSet rs=ps.executeQuery();
			while(rs.next()){
                           
				Student a=new Student();
                                a.setreceiptno(rs.getInt(1));
				a.setrollno(Integer.parseInt(rs.getString(2)));
				a.setName(rs.getString(3));
                               
                                 a.setyear(rs.getString(4));
                                 a.setamount(rs.getString(5));
                                 a.setfeesdetails(rs.getString(6));
				a.setpaymentmode(rs.getString(7));
				a.setdate(rs.getString(8));
                                
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
     public static int update(ArrayList<String> a){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("update student set name=?,"
                                + "department=?,year=?,address=?,mailid=?,contactno=?,tutionfees=?,"
                                + "bookfees=?,messfees=?,deptfees=?,cgpa=?,password=?,paid=?,"
                                + "discount=?,totalfees=?,paidfees=?,Due=? where rollno=?");
			
                        ps.setString(1,a.get(1));
                        ps.setString(2,a.get(2));
                        ps.setString(3,a.get(3));
                        ps.setString(4,a.get(4));
			ps.setString(5,a.get(5));
                        ps.setString(6,a.get(6));
                        ps.setInt(7,Integer.parseInt(a.get(7)));
                        ps.setInt(8,Integer.parseInt(a.get(8)));
                        ps.setInt(9,Integer.parseInt(a.get(9)));
                        ps.setInt(10,Integer.parseInt(a.get(10)));
                        ps.setFloat(11,Float.parseFloat(a.get(11)));
                         ps.setString(12,a.get(1));
                         ps.setString(13,"unpaid");
                         
                          ps.setString(14,a.get(12));
                          
                          ps.setString(15,a.get(13));
                          ps.setString(16,a.get(14));
                          ps.setString(17,a.get(15));
                         
			ps.setInt(18,Integer.parseInt(a.get(0)));
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
    
     public static boolean validate1(int rollno){
		boolean status=false;
                
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where rollno=?");
			ps.setInt(1,rollno);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
     public static boolean validatereceipt(int receiptno){
		boolean status=false;
                
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where receiptno=?");
			ps.setInt(1,receiptno);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
     public static boolean validaterollno(String rollno){
		boolean status=false;
                
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where rollno=?");
			ps.setString(1,rollno);
			
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
        public static List<String> getinfo(int rollno){
		List<String> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from student where rollno=?");
			ps.setInt(1,rollno);
                        ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				
				list.add(String.valueOf(rs.getInt(1)));
                                list.add(rs.getString(2));
                                 list.add(rs.getString(3));
                                  list.add(rs.getString(4));
                                   list.add(rs.getString(5));
                                   list.add(rs.getString(6));
                                   list.add(rs.getString(7));
                                   list.add(String.valueOf(rs.getInt(8)));
                                   list.add(String.valueOf(rs.getInt(9)));
                                   list.add(String.valueOf(rs.getInt(10)));
                                   list.add(String.valueOf(rs.getInt(11)));
                                    list.add(String.valueOf(rs.getFloat(12)));
                                    list.add(String.valueOf(rs.getFloat(15)));
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
        
        public static List<String> getreceiptinfo(int receiptno){
		List<String> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where receiptno=?");
			ps.setInt(1,receiptno);
                        ResultSet rs=ps.executeQuery();
			while(rs.next()){
				
				
				list.add(String.valueOf(rs.getInt(1)));
                                list.add(rs.getString(2));
                                 list.add(rs.getString(3));
                                  list.add(rs.getString(4));
                                   list.add(rs.getString(5));
                                   list.add(rs.getString(6));
                                   list.add(rs.getString(7));
                                   list.add(rs.getString(8));
                                   
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
        
         public static int delete(int rollno){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("delete from student where rollno=?");
                       
                        
			ps.setInt(1,rollno);
                        
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
         public static int deletefees(int receiptno){
		int status=0;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("delete from receipt where receiptno=?");
                       
                        
			ps.setInt(1,receiptno);
                        
			
			status=ps.executeUpdate();
			con.close();
		}catch(Exception e){System.out.println(e);}
		return status;
	}
         public static boolean validatedate(String date){
		boolean status=false;
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where date1=?");
			
			ps.setString(1,date);
			ResultSet rs=ps.executeQuery();
			status=rs.next();
			con.close();
		}catch(Exception e){System.out.println(e);}
		
		
		return status;
	}
         public static List<Student> feereport2(String date){
		List<Student> list=new ArrayList<>();
		try{
			Connection con=getCon();
			PreparedStatement ps=con.prepareStatement("select * from receipt where date1=?");
			ps.setString(1,date);
                        ResultSet rs=ps.executeQuery();
			while(rs.next()){
				Student a=new Student();
                                a.setreceiptno(rs.getInt(1));
				a.setrollno(Integer.parseInt(rs.getString(2)));
				a.setName(rs.getString(3));
                               
                                 a.setyear(rs.getString(4));
                                 a.setamount(rs.getString(5));
                                 a.setfeesdetails(rs.getString(6));
				a.setpaymentmode(rs.getString(7));
				a.setdate(rs.getString(8));
                                
				list.add(a);
			}
			con.close();
		}catch(Exception e){System.out.println(e);}
		return list;
	}
         
}

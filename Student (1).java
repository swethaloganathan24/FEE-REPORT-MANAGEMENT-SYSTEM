package feereportmanagement;

 class Student {
private int rollno,tution,book,mess,deptfees,receiptno;
private float cgpa;
private String name,dept,year,address,mailid,contactno,password,paid,discount;
private String amount,feesdetails,paymentmode,date;
private String total,paidfee,due;
public Student() {}
public Student(int rollno, String name, String dept, String year, 
        String address, String mailid, String contactno,int tution,int book,
        int mess,int deptfees,float cgpa,String password,String paid,
        String discount,String amount,String feesdetails,String paymentmode,
        String date,int receiptno,String total,String paidfee,String due) {
	super();
        this.total=total;
        this.paidfee=paidfee;
        this.due=due;
        this.receiptno=receiptno;
        this.amount=amount;
        this.feesdetails=feesdetails;
        this.paymentmode=paymentmode;
        this.date=date;
        this.rollno=rollno;
	this.name = name;
        this.dept = dept;
        this.year = year;
	this.address = address;
	this.mailid = mailid;
	this.contactno = contactno;
        this.tution=tution;
        this.book=book;
        this.mess=mess;
        this.deptfees=deptfees;
        this.cgpa=cgpa;
        this.password=password;
        this.paid=paid;
        this.discount=discount;
}
public String gettotal() {
	return total;
}
public void settotal(String total) {
	this.total = total;
}
public String getpaidfee() {
	return paidfee;
}
public void setpaidfee(String paidfee) {
	this.paidfee = paidfee;
}
public String getdue() {
	return due;
}
public void setdue(String due) {
	this.due = due;
}
public String getamount() {
	return amount;
}
public void setamount(String amount) {
	this.amount = amount;
}
public String getdate() {
	return date;
}
public void setdate(String date) {
	this.date = date;
}
public String getpaymentmode() {
	return paymentmode;
}
public void setpaymentmode(String paymentmode) {
	this.paymentmode = paymentmode;
}
public String getfeesdetails() {
	return feesdetails;
}
public void setfeesdetails(String feesdetails) {
	this.feesdetails = feesdetails;
}
public int getreceiptno() {
	return receiptno;
}
public void setreceiptno(int receiptno) {
	this.receiptno = receiptno;
}
public String getdiscount() {
	return discount;
}
public void setdiscount(String discount) {
	this.discount = discount;
}
public String getpaid() {
	return paid;
}
public void setpaid(String paid) {
	this.paid = paid;
}
public String getpassword() {
	return password;
}
public void setpassword(String password) {
	this.password = password;
}
public String getyear() {
	return year;
}
public void setyear(String year) {
	this.year = year;
}
public String getdept() {
	return dept;
}
public void setdept(String dept) {
	this.dept = dept;
}
public float getcgpa() {
	return cgpa;
}
public void setcgpa(float cgpa) {
	this.cgpa = cgpa;
}
public int getrollno() {
	return rollno;
}
public void setrollno(int rollno) {
	this.rollno = rollno;
}
public int gettution() {
	return tution;
}
public void settution(int tution) {
	this.tution = tution;
}
public int getbook() {
	return book;
}
public void setbook(int book) {
	this.book = book;
}
public int getmess() {
	return mess;
}
public void setmess(int mess) {
	this.mess = mess;
}
public int getdeptfees() {
	return deptfees;
}
public void setdeptfees(int deptfees) {
	this.deptfees = deptfees;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return mailid;
}
public void setEmail(String mailid) {
	this.mailid = mailid;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}

}


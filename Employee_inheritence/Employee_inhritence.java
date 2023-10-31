import java.util.*;
class Employee{
	String name;
	int age;
	String phno;
	String address;
	int salary;
	void print(){
			
			System.out.print(name + " of age "+age +" from  "+address +" has salary "+salary +" and is a ");		
		}
}
class Officer extends Employee{
	String specialization;
	void prints(){
		System.out.println("officer and is a specialised in "+specialization);
}
}
class Manager extends Employee{
	String department;
		void prints(){
		System.out.println("manager of "+department+" department.");
}
}
class Employee_inhritence{
	public static void main(String args[]){
	Officer ofcr=new Officer();
	Manager mgr=new Manager();
	ofcr.name="akhil";
	ofcr.age=20;
	ofcr.phno="8129085815";
	ofcr.address="kochi";
	ofcr.salary=2000;
	ofcr.specialization="devops";
	ofcr.print();
	ofcr.prints();

	mgr.name="varun";
	mgr.age=20;
	mgr.phno="778236289391";
	mgr.salary=3000;
	mgr.address="thrissur";
	mgr.department="cs";
	mgr.print();
	mgr.prints();
}
}																													

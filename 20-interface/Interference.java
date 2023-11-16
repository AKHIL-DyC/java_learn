import java.util.*;
interface sports{
	final int sportwt=2;
	abstract void putwt();
}
class student{
	Scanner sc=new Scanner(System.in);
		int rollno;
		void getnumber(){
			System.out.println("enter the roll no");
			rollno=sc.nextInt();
		}
		void putnumber(){
			System.out.println("the rollno is "+rollno);
		}
}
class Test extends student{
		int term1;
		int term2;
		void getmarks(){
			System.out.println("enter the marks obtained for term1 and 2");
			term1=sc.nextInt();
			term2=sc.nextInt();
		}
		void putmarks(){
			System.out.println("The mark in term 1 is  "+term1+"and in term 2 is "+term2);
		}
}
class result extends Test implements sports{
	public void putwt(){
	System.out.println(sportwt);
	int total =term1+term2+sportwt;
	System.out.println("total is"+total);
	}
	
}
class interference{
	public static void main(String args[]){
		result obj=new result();
		obj.getnumber();
		obj.putnumber();
		obj.getmarks();
		obj.putmarks();
		obj.putwt();
	}
}

import java.util.*;
class Emplyoee{
	void display(){
	}
	void calc_salary(){
	System.out.println("salary of employee is 1000");
	}
	
}
class Engineer extends Emplyoee{
	void display(){
		System.out.println();
	}
	void calc_salary(){
		super.calc_salary();
		System.out.println("salary of engineer is 2000");
	}
	
}
class Super{
	public static void main(String args[]){
		Engineer obj=new Engineer();
		obj.calc_salary();

	}
}

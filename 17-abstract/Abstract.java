import java.util.*;
abstract class shape{
	abstract void number_Of_sides();
}
class rectangle extends shape{
	void number_Of_sides(){
		System.out.println("number of sides is 4");
	}	
}
class triangle extends shape{
	void number_Of_sides(){
		System.out.println("number of sides is 3");
	}
}
class hexagon extends shape{
	void number_Of_sides(){
		System.out.println("number of sides is 6");
	}
}
class Abstract{
	public static void main(String args[]){
	rectangle ob1=new rectangle();
	triangle ob2=new triangle();
	hexagon ob3=new hexagon();
	ob1.number_Of_sides();
	ob2.number_Of_sides();
	ob3.number_Of_sides();
	}
}

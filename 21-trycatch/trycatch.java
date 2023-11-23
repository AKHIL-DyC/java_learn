import java.util.*;
class  thrower{
	void throwerr(){
	int k=20;
		if(k<18)
			throw new ArithmeticException("not ready");
		else
			System.out.println("ready");
	}
}
class function{
thrower ob=new thrower();
void  error_divider(int a,int b){
		int c= a/b;
		}
void errorfree_divider(int a,int b){
		try{
			int c= a/b;
		}
		catch(ArithmeticException e){
			System.out.println("division by 0 is not possible!!!!");
			}
		finally{
			System.out.println("this will work if there is error or not ");
			ob.throwerr();
			}	
		}
		
}				
class Tc{
	public static void main(String args[]){
	int a =8;
	int b=0;
	function obj=new function();
	obj.errorfree_divider(a,b);
	obj.error_divider(a,b);
	}
}

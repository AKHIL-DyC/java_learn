import java.util.*;
import java.lang.Math;
 class function{
	 void areas(int r){
	System.out.println("the area is "+3.14*r*r);
	}
	 void areas(int l,int b){
	System.out.println("the area is "+l*b);	
	}
	 void areas(int a,int b, int c){
	double s=(a+b+c)/2.0f;
	System.out.println("the area is "+(float)Math.sqrt(s*(s-a)+s*(s-b)+s*(s-c)));	
	}
	}
class Area{

	public static void main(String args[]){
	function fc=new function();
	int l,r,a,b,c;
	Scanner sc =new Scanner(System.in);
	System.out.println("what is the shape \n1)circle\n2)rectangle\n3)triangle");
	int n =sc.nextInt();
	if(n==1){
	System.out.println("enter the radius");
	 r =sc.nextInt();
	fc.areas(r);	
	}
	else if(n==2){
	System.out.println("enter the length followed by width");
	 l =sc.nextInt();
	 b =sc.nextInt();
	fc.areas(l,b);	
	}
	else if(n==3){
	System.out.println("enter the length of the three sides");
	 a =sc.nextInt();
	 b =sc.nextInt();
	 c =sc.nextInt();
	fc.areas(a,b,c);	
	}
	
}}

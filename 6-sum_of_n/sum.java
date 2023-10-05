import java.util.*;
class Sum{
	public static void main(String args[])
	{	int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number n");
		int n=sc.nextInt();
		System.out.println("The number upto n is ");
		for(int i=1;i<=n;i++){
			System.out.println(i+"");
		}
		for(int i=1;i<=n;i++){
			sum=sum+i;
			
		}
		System.out.println("The sum is :\t"+sum);
	}	
}

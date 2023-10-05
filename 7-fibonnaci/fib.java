import java.util.*;
class Fib{
	public static void main(String args[])
		{
			int first =0;
			int second=1;
			int digit;
			System.out.println("enter the number of fibnocci you want >_<");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
				for(int i=0;i<n;i++){
						digit=first+second;
						first=second;
						second=digit;
						System.out.print(digit+" ");
						
						
				
					}
		}
}

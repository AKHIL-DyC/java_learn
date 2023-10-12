import java.util.*;
class Frequency{
	public static void main(String args[])
	{	int frequency=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String s1=sc.nextLine();
		System.out.println("enter the character you need the frequency of:");
		String s2=sc.nextLine();
		for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==s2.charAt(0))
					{
						frequency++;
					}
			
			}
			
				System.out.println("the frequency of "+s2.charAt(0)+" is "+frequency);
		
	}
}

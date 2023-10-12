import java.util.*;
class Palindromes{
public static void main (String args[])
{	int flag=0;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter string");
	String s=sc.nextLine();
		int len=s.length();
		for(int i=0;i<len;i++){
			if (s.charAt(i)!=(s.charAt(len-i-1)))
					{
						System.out.println(" not Palindrome");
						flag++;
						break;
					}
	
				}
				
			if(flag==0){
				System.out.println("palindrome");
			}			
		}

}

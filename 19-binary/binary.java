import java.util.*;
class binary{
public static void main(String args[]){
	int l=0;
	int flag;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		int u=n-1;
		System.out.println("enter the sorted array");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			}
		System.out.println("enter the number to be searched");
		int s=sc.nextInt();
		
	while(l < u){
		int mid=(l+u)/2;
		if(s<arr[mid]){
			if(s==arr[mid]){
			System.out.println("number found");
			flag=2;
			break;
		}
		u=mid-1;
		
	}
	else{
		if(s==arr[mid]){
			System.out.println("number found");
			flag=2;
			break;
			
			}
			l=mid+1;
		}
	}


}
}

import java.util.*;
class Mxproduct{
	public static void main(String args[])
{	
	int sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the rows followed by column of matrix 1 >_<");
	int r1=sc.nextInt();
	int c1=sc.nextInt();
	
	System.out.println("enter the rows followed by column of matrix 2 >_<");
	int r2=sc.nextInt();
	int c2=sc.nextInt();
	
	if(c1!=r2){
		System.out.println("multiplication not possible:");
	}
			else{
					int a[][]=new int[r1][c1],b[][]=new int[r2][c2],c[][]=new int[r1][c2];
					
					System.out.println("enter the first array");
								for(int i=0;i<r1;i++){
									for(int j=0;j<c1;j++){
											a[i][j]=sc.nextInt();
										}
									}
					System.out.println("enter the second array");
								for(int i=0;i<r2;i++){
									for(int j=0;j<c2;j++){
											b[i][j]=sc.nextInt();
										}
									}
					for(int i=0;i<r1;i++){
						for(int j=0;j<c2;j++){
							for(int k=0;k<c1;k++){
								c[i][j]=a[i][k]*b[k][j];
		
								}
							}
						
					}
					
					for(int i=0;i<r1;i++){
						for(int j=0;j<c2;j++){
							System.out.print(c[i][j]+" ");
						}
						System.out.println(" ");
					}								
	
	
			}
		}	
}

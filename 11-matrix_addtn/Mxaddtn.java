import java.util.*;
class Mxaddtn{
		public static void main(String args[])
				{
					Scanner sc= new Scanner(System.in);
					System.out.println("enter the number of rows followed by number of column of matrix 1 >_<");
					int r=sc.nextInt();
					int c=sc.nextInt();
					
					System.out.println("enter the number of rows followed by number of column of matrix 2 >_<");
					int x=sc.nextInt();
					int y=sc.nextInt();
					
					if(r==x&&c==y){
					
					int a[][]=new int[r][c],b[][]=new int[r][c],s[][]=new int[r][c];
						System.out.println("enter the first array");
								for(int i=0;i<r;i++){
									for(int j=0;j<c;j++){
											a[i][j]=sc.nextInt();
										}
									}
						System.out.println("enter the second array");
								for(int i=0;i<r;i++){
									for(int j=0;j<c;j++){
											b[i][j]=sc.nextInt();
										}
									}
						System.out.println("the result is:(); ");
								for(int i=0;i<r;i++){
									for(int j=0;j<c;j++){
											s[i][j]=a[i][j]+b[i][j];
										}
									}
								
			
											for(int i=0;i<r;i++){
												for(int j=0;j<c;j++){
														System.out.print(s[i][j]+" ");
													}
												System.out.println("");	
												}
																		
					}
					else{
						System.out.println("addition not possible");
					}
				}

	}

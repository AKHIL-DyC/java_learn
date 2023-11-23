import java.util.*;
import  java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
class filee{
	public static void main(String args[]){
	int i;
	try{
		File fcreate = new File("./Newfile.txt");
	 	if(fcreate.createNewFile()){
	 		System.out.println("file created succesfully");
	 		}
	 	else{
	 		System.out.println("file already exist");
	 	}
	 	}
	 catch (IOException exception) {  
                          System.out.println("An unexpected error is occurred.");  
                          exception.printStackTrace();
		}
	System.out.println("enter the sentence you want to write ");
	Scanner sc= new Scanner(System.in);
	String data=sc.nextLine();	
	try{
		FileWriter fwrite= new FileWriter("./Newfile.txt");
		fwrite.write(data);
		fwrite.close();
	}
	catch(IOException e){
		System.out.println("error while writing");
	}

		FileReader fread=new FileReader("./about.txt");
		while(i=fread()!=-1)
							System.out.println((char)i);		
		fread.close();
	
		
	}	
}



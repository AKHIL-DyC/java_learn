import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
class fileadd{
    
    public static void main(String args[])throws Exception{
        boolean isfirstline=true;
        BufferedReader reader=new BufferedReader(new FileReader("data.txt"));
        String str;
        while((str=reader.readLine())!=null){
            if(isfirstline){
                isfirstline=false;
                continue;
            }
            String[] parts=str.split("\\s+");
            String name=parts[0];
            int marks=Integer.parseInt(parts[1]);
            int marks2=Integer.parseInt(parts[2]);
            int totatl =marks+marks2;
            System.out.println(name+" total marks:"+totatl);
        }
    }
}
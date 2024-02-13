import java.io.IOException;
import java.io.*;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
class files{
    static void read(){
        try{
            BufferedReader reader=new BufferedReader(new FileReader("output.txt"));
            String temp;
            while((temp=reader.readLine())!=null){
                System.out.println(temp);  
            }
            reader.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String args[]){
        System.out.println("enter your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String address=sc.nextLine();
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sc.close();
        try{
        BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt",true));//this true makes it not overwrite rather append
        writer.write(name);
        writer.write("\n"+address);
        writer.write(String.valueOf(n2));//valueof turns integer into string .
        writer.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        read();
    }
}
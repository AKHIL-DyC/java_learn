import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.*;
class filethr{
    static synchronized void writefile(int i){
        try{
            BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt",true));
            writer.write(String.valueOf(i+"\n"));
            writer.close();
        }
        catch(IOException e){

        }
    }
    public static void main(String args[]){
        File file=new File("output.txt");
        if(file.exists()){
            file.delete();
        }
        Thread t1=new Thread(new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                   writefile(i);
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=10;i<20;i++){
                 writefile(i);
            };
            }
        });
        t1.start();
        t2.start();
    }
}
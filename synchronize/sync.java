class count{
    int flag=0;
    // run this program with and without the synchronized you will see that wihtout it doesnt print 10000,it becasue one thread 
    //is interferring with other when its incrementing.
    synchronized void add(){
        flag=flag+1;
    }
}
class sync{
    public static void main(String args[])throws Exception{
        count c1=new count();
        Thread t1=new Thread(new Runnable() {
            public void run(){
                for(int i=0;i<5000;i++){
                    c1.add();
                }
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                for(int i=0;i<5000;i++){
                    c1.add();
                }
            }
        });
        t1.start();
        //t1.join();
        t2.start();
       // t2.join();

       t1.join();
       t2.join();
        System.out.println(c1.flag);
    }
}
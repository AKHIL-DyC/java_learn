class t1 extends Thread{
  public void run(){
      for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
      }
  }
}
class threads{
    public static void main(String args[])throws Exception{
      System.out.println(Thread.activeCount());
      System.out.println(Thread.currentThread().getName());

      //priority ranges from 0 to 10
      System.out.println(Thread.currentThread().getPriority());
      Thread.currentThread().setPriority(10);
      System.out.println(Thread.currentThread().getPriority());
      
      t1 tt1=new t1();
      tt1.start();
      tt1.join();//waits for tt1 to finish
      for(int i=0;i<5;i++){
        System.out.println(Thread.currentThread().getName());
      }
    }
}
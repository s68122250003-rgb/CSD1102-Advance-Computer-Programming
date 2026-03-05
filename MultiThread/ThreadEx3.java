package MultiThread;

public class ThreadEx3 implements Runnable   {
    public static void main(String arg[]) {
        System.out.println("Main method");
        System.out.println("The main thread is running :"+Thread.currentThread().getName());
        ThreadEx3 obj = new ThreadEx3();
        Thread t1 = new Thread(obj);
        t1.start();
    }
    @Override
    public void run()
    {
       for(int i=1;i<=5;i++){
    System.out.println(Thread.currentThread().getName()+" : "+i);
}

    }
}

package MultiThread;

public class ThreadEx2  {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.start();  // สำคัญ: ต้องใช้ start()
        //t1.join();
        System.out.println("Main ทำงานต่อ");
    }
}


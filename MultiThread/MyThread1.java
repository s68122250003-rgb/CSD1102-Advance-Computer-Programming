package MultiThread;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread กำลังทำงาน: " + i);
            try {
                Thread.sleep(500); // หน่วง 0.5 วินาที
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.start();  // สำคัญ: ต้องใช้ start()
        // t1.join();
        System.out.println("Main ทำงานต่อ");
    }
}

public class TestCounter {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.inc();
        int i = c.getValue();
        System.out.println("i = "+i);
        System.out.println(c.MAX);
        System.out.println(Counter.MAX);
        System.out.println("c = "+c);
        Counter d = new Counter();
        System.out.println("d = "+d);
        System.out.println(d.getValue());
    }
    
}

public class Counter {
    public static final int MAX = 100;
    private int value = 0;

    public void inc(){
        if( value<MAX){
            ++value;
        }
    }
    public int getValue(){
        return value;
    }
}

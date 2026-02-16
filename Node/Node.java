

public class Node {
    private int data;
    private Node next;
    private static int count;

    public Node (int dataValue){
        data =  dataValue;
        next = null;
        ++count;

    }
    public Node (int dataValue,Node nextValue){
        next = nextValue;
        data = dataValue;
        ++count;
    }
    public static int getCount(){
        return count;
    }
    public int getData(){
        return data;
    }
    public void setData(int  dataValue) {
        data = dataValue;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node nextValue) {
        next = nextValue;
    }
    public void Nodedisplay (){
        System.out.println(this.next);

    }
    
}

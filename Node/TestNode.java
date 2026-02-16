public class TestNode {
        public static void main(String[] args) {
        System.out.println("unmber of Ofjects = "+ Node.getCount());
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        System.out.println("Before ");
        System.out.println("n1 = "+n1);
        System.out.println("next of n1 " +n1.getNext());
        System.out.println("n2 = "+n2);
        System.out.println("next of n2 " +n2.getNext());
        System.out.println("After ");
        System.out.println("unmber of Ofjects = "+ Node.getCount());
        n1.setNext(n2);
        System.out.println("unmber of Ofjects = "+ Node.getCount());
        System.out.println("next of n1 = " +n1.getNext());
        System.out.println("next of n2 = " +n2.getNext());
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node temp = n3;
        n2.setNext(n3);
        n3.setNext(n4);
        n2.setNext(n5);
        n5.setNext(n3);
        
        // System.out.println("n1 = "+n1);
        // System.out.println("n2 = "+n2);
        // System.out.println("n3 = "+n3);
        // System.out.println("n4 = "+n4);
        // System.out.println("n5 = "+n5);

        // System.out.println("next of n1 = " +n1.getNext());
        // System.out.println("next of n2 = " +n2.getNext());
        // System.out.println("next of n3 = " +n3.getNext());
        // System.out.println("next of n4 = " +n4.getNext());
        // System.out.println("next of n5 = " +n5.getNext());
        


        Node[] nodes = {n1, n2, n3, n4, n5};
        
        for (int i = 0; i < nodes.length; i++) {
            System.out.println("n" + (i + 1) + " = " + nodes[i]);
        }

        for (int i = 0; i < nodes.length; i++) {
            System.out.println("next of n" + (i + 1) + " = " + nodes[i].getNext());
        }

        
    }
    
}

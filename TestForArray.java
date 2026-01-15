import java.util.Random;
public class TestForArray {
    public static void main(String[] args) {
        // int []t;

        // t = new int[10];

        // for(int v:t){
        //     System.out.print(v+" ");

        // }
        // System.out.println("t = "+t);
        // Random ra = new Random();
        // for(int i = 0; i<t.length;i++){
        //     t[i] = ra.nextInt(51)+50;
        // }
        // int sum = 0;
        // for(int i = 0; i<t.length;i++){
        //     System.out.print(t[i]+"  ");
        //     sum += t[i];
        // }
        // sum = sum/10;

        // System.out.println("\n " +sum);
        int [] t;
        t = new int[10];
        printArray(t);
        System.out.println(" t = "+t);
        randomArray(t);
        printArray(t);
        int m [] = new int[5];
        randomArray(m);
        printArray(m);
        int sum_m = sumArray(m);
        System.out.println("summ of m = "+sum_m);
        System.out.println("average "+average(sum_m));
        int [][] a = new int[5][3];
        randomArray2d(a);
        printArray2d(a);
        sumArray(a);
         
    }
    public static void randomArray(int [] x){
        for (int i = 0; i < x.length; i++){
            x[i] = (int)(49+Math.random()*50);
        }
    }
    public static void printArray(int [] x){
        for (int v:x){
            System.out.print(v+" ");
        }
    }
    public static int sumArray(int [] x){
        int sum =0;
        for (int i = 0; i < x.length; i++) {
            sum = sum+x[i];
        }
        return sum;
    }
    public static int average(int sum){
        int a = sum/10;
        return a;
    }
    public static void randomArray2d(int [][] x){
        for (int i = 0; i < x.length; i++){
            for(int j = 0; j < x[i].length; j++){
                x[i][j] = (int)(49+Math.random()*50);
            }
        }
    }
    public static void printArray2d(int [][] x){
        
        for (int i = 0; i < x.length; i++){
            System.out.print("[");
            for(int j = 0; j < x[i].length; j++){
                System.out.print(x[i][j]+",");
            }
            System.out.print("]");
            System.out.println(" ");
        }
        
    }
    public static void sumArray(int x [][]){
        int sumroll = 0;
        int sumcolumn = 0;
        for (int i = 0; i < x.length; i++){
            
            for(int j = 0; j < x[i].length; j++){
                sumcolumn = sumcolumn + x[i][j];
                System.out.println(sumcolumn+i);
            }
            sumroll = sumroll + x[i][j];
            
            
        }
        
    }


    
}

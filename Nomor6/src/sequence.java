public class sequence {
    public static void main(String[] args) throws Exception {
        int n = 10;
        int fn = 1;
        int fn2 = 0;
        int fn1 = 1;
    
        int i = 1;
        while( i <= n){
            System.out.println("Ini merupakan deret ke-" + i + " dengan nilai fibonaci " + fn);
            fn = fn1 + fn2;
            fn2=fn1;
            fn1=fn;
            i++;
        }
    }
}

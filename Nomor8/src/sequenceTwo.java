public class sequenceTwo {
    public static void main(String[] args) throws Exception {
        int n = 11;
        int fn = 1;
        int fn2 = 0;
        int fn1 = 1;
    
        int i = 1;
            for( i = 1; i <= n; i++){
            System.out.println("Ini merupakan deret ke-" + i + " dengan nilai fibonaci " + fn);
            fn = fn1 + fn2;
            fn2=fn1;
            fn1=fn;
        }
    }
}

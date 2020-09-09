public class RecurstionExample {

    /**
     * n! = n*(n-1)*(n-2)*...*1 5! = 5*4*3*2*1 = 5*4!
     * <p>
     * <p>
     * <p>
     * (n-1) = (n-2)*(n-3)*....*1
     * <p>
     * n! = n * (n-1)!
     */
    public static int factorial(int n) {
        if (n == 1) return 1;
        else return n * factorial(n - 1);
    }

    /**
     * 1, 1, 2, 3, 5, 8, ....
     * <p>
     * fib(1) = 1
     * fib(2) = 1
     * fib(3) = fib(2)+fib(1)
     * fib(n) = fib(n-1)+ fib(n-2)
     */

    public static int fib(int n) {
        if (n <= 2) return 1;
        else return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
//        System.out.println(RecurstionExample.factorial(5));
        int n = 70;

        iterativeFib(n);

        long startingTIme = System.currentTimeMillis();

//        System.out.println(RecurstionExample.fib(n));
//        long endTime = System.currentTimeMillis();
//        System.out.println(endTime - startingTIme);
    }

    private static void iterativeFib(int n) {
        long startingTIme = System.currentTimeMillis();
        int fibn_small = 1;
        int fibn_large = 1;
        for (int i = 2; i < n; i++) {
            int temp = fibn_large;
            fibn_large = fibn_small + fibn_large;
            fibn_small = temp;
        }
        System.out.println(fibn_large);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startingTIme);
    }
}

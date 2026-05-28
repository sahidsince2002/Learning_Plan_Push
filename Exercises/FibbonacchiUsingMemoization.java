class FibbonacchiUsingMemoization {

    static int cache[] = new int[51];

    public static int fibbo(int n) {

        if (n <= 1) {
            return n;
        }

        if (cache[n] != 0) {
            return cache[n];
        }

        cache[n] = fibbo(n - 1) + fibbo(n - 2);

        return cache[n];
    }

    public static void main(String[] args) {

       // System.out.println(fibbo(40));

        // Print sequence
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibbo(i) + " ");
        }
    }
}
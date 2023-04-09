public class P4 {
    private P4(){}

    private static int get_fact(int n) throws NegativeNumber {
        if (n < 0) {
            throw new NegativeNumber("You can't use negative number!");
        }
        if (n == 0) {
            return 1;
        }
        return n * get_fact(n-1);
    }

    public static void print(int n) {
        try {
            System.out.println(get_fact(n));
        } catch (NegativeNumber e) {
            System.out.println(e.getMessage());
        }
    }
}


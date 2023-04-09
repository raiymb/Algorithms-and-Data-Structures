public class P5 {
    private P5(){}

    private static int get_fib(int n) throws NegativeNumber{
        if(n==0 || n==1){
            return n;
        }
        if(n<0){
            throw new NegativeNumber("You can't use negative number in  Fibonacci sequence!");
        }
        // if(n<2){return n}
        return get_fib(n-1)+get_fib(n-2);
    }
    public static void print(int n){
        try {
            System.out.println(get_fib(n));
        }catch (NegativeNumber e){
            System.out.println(e.getMessage());
        }
    }
}

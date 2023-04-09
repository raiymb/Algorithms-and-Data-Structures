import static java.lang.Math.sqrt;
public class P3 {
    private P3(){}

    private static boolean isPrime(int n, int i){
        return (n%i==0)?false:(i>sqrt(n))?true:(n<2)?false:isPrime(n,i+1);
    }
    public static void print(int n){
        boolean prime_checker = isPrime(n,2);
        if(prime_checker){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }
}

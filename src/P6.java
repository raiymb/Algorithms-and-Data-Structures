public class P6 {
    private P6(){}

    private static double my_pow(int n,double a){
        if(n==0){
            return 1;
        }
        if(n>0){
            return a*my_pow(n-1,a);
        }
        else{
            return (1/a)*my_pow(n+1,a);
        }
    }

    public static void print(int n, int a){
        System.out.println(my_pow(n,a));
    }
}

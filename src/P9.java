public class P9 {
    private P9(){}

    private static int get_bin_coeff(int n, int k){
        if(k==0 || k==n){
            return 1;
        }
        else{
            return get_bin_coeff(n-1,k-1)+get_bin_coeff(n-1,k);
        }
    }

    public static void print(int n, int k){
        System.out.println(get_bin_coeff(n,k));
    }
}

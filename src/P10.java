public class P10 {
    private P10(){}

    private static int get_gcd(int a,int b) throws NegativeNumber{
        if(b<0 || a<0){
            throw new NegativeNumber("Numbers cannot be negative");
        }
        if(b>a){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b==0){
            return a;
        }
        else{
            return get_gcd(b,a%b);
        }
    }
    public static void print(int a, int b){
        try {
            System.out.println(get_gcd(a,b));
        }catch (NegativeNumber e){
            System.out.println(e.getMessage());
        }
    }

}

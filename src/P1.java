public class P1 {
    private P1(){}
    private static int get_min_recursively(int i,int[] arr){
        if(arr.length-1==i) return arr[i];
        int min = get_min_recursively(i+1,arr);
        return (arr[i]<min)?arr[i]:min;
        //return (arr[i]<get_min_recursively(i+1,arr))?arr[i]:get_min_recursively(i+1,arr);
        //return Math.min(arr[i], get_min_recursively(i + 1, arr));
    }
    public static void print(int[] arr){
        System.out.println(get_min_recursively(0,arr));
    }
    private static int get_min_recursively2(int n, int[] arr){
        if(n==1){
            return arr[0];
        }
        int min = get_min_recursively2(n-1,arr);
        return (arr[n-1]<min)?arr[n-1]:min;

    }
    public static void print_withN(int n,int[] arr){
        System.out.println(get_min_recursively2(n,arr));
    }
}
public class P2 {
    private P2(){}
    private static double get_average(int[] arr, int i, int n)
    {
        if (i == n-1)
            return arr[i];

        if (i == 0)
            return ((arr[i] + get_average(arr, i+1, n))/n);

        return (arr[i] + get_average(arr, i+1, n));
    }
    public static void print(int[] arr){
        System.out.println(get_average(arr,0,4));
    }
}

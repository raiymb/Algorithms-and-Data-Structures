public class P8 {
    private P8(){}

    private static boolean containsOnlyDigits(String s,int i){
        char[] chars = s.toCharArray();
        if(chars.length-1==i){
            return true;
        }
        //((chars[i]>= 'a' && chars[i] <= 'z') || (chars[i] >= 'A' && chars[i] <= 'Z'))
        if(Character.isLetter(chars[i])){
            return false;
        }
        return containsOnlyDigits(s,i+1);
    }
    public static void print(String s){
        if(containsOnlyDigits(s,0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

public class CheckIfANumIsPowerOfTwo{
    public static boolean isAPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
    public static void main (String args[]){
    System.out.print(isAPowerOfTwo(4));
    }
}
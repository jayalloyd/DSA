public class NumberOddOrEven{
    public static void  oddOrEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Number is even");
        }else{
            System.out.println("number is odd");
        }
    }
    public static void main (String args[])
{
 oddOrEven(3);
 oddOrEven(12);


}}
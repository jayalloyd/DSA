public class UpdateIthBit{
    public static int clearIthBitCode(int n,int i) {
    int bitMask=~(1<<i);
    return n& bitMask;
   }
   
    public static int updateItBitCode(int n,int i,int newBit){
       clearIthBitCode(n,i);
       int  bitMask=newBit<<i;
       return  bitMask | n;
    }
    public static int clearLastIBits(int n,int i){
        int bitMask=(~0)<<i;
        return n& bitMask;
    }
    public static int clearRangeofBits(int n,int i,int j){
        int a=(~0<<(j+1));
        int b=(1<<i)-1;
        int bitMask=a | b;
        return n & bitMask;
    }
    public static void main(String args[]){
    //  System.out.print(updateItBitCode(10,2,1));
    //  System.out.println(clearLastIBits(15,2));
    System.out.println(clearRangeofBits(10,2,4));
    }
}
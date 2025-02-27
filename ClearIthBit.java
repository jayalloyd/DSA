public class ClearIthBit{
   public static int clearIthBitCode(int n,int i) {
    int bitMask=~(1<<i);
    return n& bitMask;
   }
    
    public static void main(String args[]){
  System.out.print(clearIthBitCode(10,1));
    }
}
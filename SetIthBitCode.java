public class SetIthBitCode{
public static int SetIthBit(int n,int i){
    int bitMask=1<<i;
   return n| bitMask;
}
public static void main (String args[]){
 System.out.print(SetIthBit(10,2));
}
}
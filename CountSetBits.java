public class CountSetBits{
    public static  int countSetBit(int n){
        int count=0;
        while (n>0){
            if((n&1)!= 0){//check lsb(least significant bit)
            count++;
            

            }
            n=n>>1;
        }
return count;
    }
    public static void main(String args[]){
   System.out.print(countSetBit(10));
    }
}
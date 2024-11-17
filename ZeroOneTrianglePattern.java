public class ZeroOneTrianglePattern {
    public static void zeroOneTrianglePatternPrint(int totalRows){
        for(int i=1; i<=totalRows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){//matrix form i,j->i+j==0
                    System.out.print(1);
                }else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        zeroOneTrianglePatternPrint(5);
    }
}

public class InvertedRotatedHalfPyramid {
   public static void invertedPyramid(int totalRows){

    for(int i=1;i<=totalRows;i++){
        for(int j=1;j<=totalRows-i;j++){
            System.out.print(" ");
            
        }
    
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }        



    }
    public static void main(String[] args) {
        invertedPyramid(5);
    }
}

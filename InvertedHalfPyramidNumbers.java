public class InvertedHalfPyramidNumbers {
    public static void invertedPyramidNumber(int totalRows){
        for(int i=1;i<=totalRows;i++){
            //inner numbers
            for(int j=1;j<=totalRows-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        invertedPyramidNumber(5);
    }
}

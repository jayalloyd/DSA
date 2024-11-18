public class DiamondStarPattern{
    

    public static void diamondStarPattern(int totalRows){
         for(int i=1;i<=totalRows;i++){
            //spaces
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //stars

            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");//2*i-1->denotes odd numbers of stars
            }
            System.out.println();
         }

         for(int i=totalRows;i>=1;i--){
            //spaces
            for(int j=1;j<=totalRows-i;j++){
                System.out.print(" ");
            }
            //stars

            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");//2*i-1->denotes odd numbers of stars
            }
            System.out.println();
         }
    }
    public static void main(String[] args) {
        diamondStarPattern(4);
        
    }
}
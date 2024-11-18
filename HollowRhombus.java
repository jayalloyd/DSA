public class HollowRhombus{
    public static void hollowRhombusPrint(int totalRows,int totalColumns){
        for(int i=1;i<=totalRows;i++){
                
                //spaces
            for(int j=1;j<=(totalRows-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=totalColumns;j++){
                if(i==1 || i==totalRows || j==1 || j==totalColumns){
                        System.out.print("*");

                    }
                    else
                    {
                        System.out.print(" ");
                    }


            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] args) {
        hollowRhombusPrint(5,9);
    }
}
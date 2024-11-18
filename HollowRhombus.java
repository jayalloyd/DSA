public class HollowRhombus{
    public static void hollowRhombusPrint(int totalRows){
        for(int i=1;i<=totalRows;i++){
                
                //spaces
            for(int j=1;j<=(totalRows-i);j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=totalRows;j++){
                if(i==1 || i==totalRows || j==1 || j==totalRows){
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
        hollowRhombusPrint(5);
    }
}
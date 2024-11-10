import java.util.Scanner;


class ArrayPractice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
       
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
         int[] arr=new int [size];
         System.out.println("Enter array items");
                
         for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            

        
         }
         System.out.println("Enter the target");
         int x=sc.nextInt();
         for(int i=0;i<arr.length;i++){
        
            if(arr[i]==x){
                System.out.println("element is found at index:" +i);
                
            }
            
   
            
          
        } System.out.println("number not found");
        sc.close();
    }
}
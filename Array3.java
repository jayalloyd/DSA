import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
         String[] names=new String[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<size;i++){
          names[i]=sc.next();
        }
        //output
        for(int i=0;i<size;i++){
            
            System.out.println(names[i]);
        }
        sc.close();
    }
}

public class BubbleSort{
public static void main(String[] args) {
    

     System.out.println("Before sorting");
    int nums[]={2,8,6,5,3};
    for(int num: nums){
        System.out.print(num+" ");
    }
    int size=nums.length;
    int i=0;
    int temp=0;
    for(i=0;i<size;i++){
        for(int j=0;j<size-i-1;j++){
            if(nums[j]>nums[j+1]){
            
            temp=nums[j];
            nums[j]=nums[j+1];
            nums[j+1]=temp;
            }
        }
        
    }    
    System.out.println();
        System.out.println("after sorting");
        for(int num:nums){
            System.out.print(num +" ");
        }
    


}}
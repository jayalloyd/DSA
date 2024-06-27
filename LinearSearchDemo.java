public class LinearSearchDemo{
    public static void main(String a[]){
        int nums[]={4,2,6,10,25};
        int target=10;
        int result=LinearSearch(nums,target);
        if(result != -1)
            System.out.println(result);
        }  

    public static int LinearSearch(int[] nums, int target) {
        for(int i=0;i<nums.length; i++){
           if( nums[i]==target){
            return i;
        
           }}
        
        return -1;
    }
    
    }

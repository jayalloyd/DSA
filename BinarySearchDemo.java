public class BinarySearchDemo {
    public static void main(String[] args) {
        
    
    int nums[]={2,4,6,10,25};
    int left=0;
    int right=nums.length;
         int target=;
        int result=BinarySearch(nums,target,left,right);
        if(result != -1)
            System.out.println(result);
        }  

    public static int BinarySearch(int[] nums, int target,int left,int right) {
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
                            }
                            else if(nums[mid]<target)                        
                            {
                                left=mid+1;
                            }
                            else
                            {
                                right=mid-1;
                            }
    


        }
        
        System.out.println("number not found");
        return -1;
    }
    
}


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

//Bubble sort is a simple comparison-based sorting algorithm. It works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

//Here's how bubble sort works:

//Starting from the beginning of the list, compare the first two elements.
//If the first element is greater than the second, swap them.
//Move to the next pair of elements, and repeat step 2.
//Continue this process for each pair of adjacent elements to the end of the list.
//At the end of each pass through the list, the largest element will have "bubbled" up to its correct position at the end of the list.
//Repeat the process for the remaining elements (excluding the last sorted elements) until no more swaps are needed.

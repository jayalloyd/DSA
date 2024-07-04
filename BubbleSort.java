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
    

//Bubble sort is a simple comparison-based sorting algorithm. It works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

//Here's how bubble sort works:

//Starting from the beginning of the list, compare the first two elements.
//If the first element is greater than the second, swap them.
//Move to the next pair of elements, and repeat step 2.
//Continue this process for each pair of adjacent elements to the end of the list.
//At the end of each pass through the list, the largest element will have "bubbled" up to its correct position at the end of the list.
//Repeat the process for the remaining elements (excluding the last sorted elements) until no more swaps are needed.

}}

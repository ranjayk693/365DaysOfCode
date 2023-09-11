/*https://leetcode.com/problems/sort-colors */


class Solution {
    public void swap(int[] arr, int pos1, int pos2)
    {
        int temp=arr[pos1];
        arr[pos1]=arr[pos2];
        arr[pos2]=temp;
    }
    public void sortColors(int[] nums) {
        //sort for 0
        int zeroPointer=-1;
        int currentPointer=0;
        while(currentPointer<nums.length)
        {
            if(nums[currentPointer]==0)
            {
                zeroPointer++;  //first increment and taking the first position for the number0
                swap(nums,zeroPointer,currentPointer);
            }
            currentPointer++;
        }

        //sort for 1
        int onePointer=zeroPointer;   //intilization last 0 postion index to the onePointer
        currentPointer=zeroPointer+1;
        while(currentPointer<nums.length)
        {
            if(nums[currentPointer]==1)
            {
                onePointer++;
                swap(nums,onePointer,currentPointer);
            }
            currentPointer++;
        }

        //rest are all sorted

        
    }
}
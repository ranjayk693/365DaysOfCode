public class Solution {
    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] ans=new int[n];
        for(int i=1;i<=x;i++)
        {
            int temp=0;
            for(int j=0;j<n;j++)
            {
                //count for i
                if(nums[j]==i)
                    temp++;
            }
            if(i>n)
                break;
            ans[i-1]=temp;
        }
        return ans;
    }
}
public class Solution {
        // public static void swap(int[] arr, int pos1, int pos2)
        // {
        //     int temp=arr[pos1];
        //     arr[pos1]=arr[pos2];
        //     arr[pos2]=temp;
        // }
        public static int[] moveZeros(int n, int []a) {
        // Write your code here.
        //logic 1
        // for(int i=0;i<n;i++)
        // {
        //     if(a[i]==0)
        //     {
        //         int tempIndex=i+1;
        //         while(tempIndex<n)
        //         {
        //             if(a[tempIndex]!=0){
        //                 swap(a,tempIndex,i);
        //                 break;
        //             }
        //             tempIndex++;

        //         }
                
        //     }
        // }
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     //code
        //     arr[i]=a[i];
        // }
        // return arr;

        //logic2  with extra space
        // int[] ans=new int[n];
        // int count=0;    //for a array pointer
        // int nonzero=0;  //for ans array pointer
        // while(count<n)
        // {
        //     if(a[count]!=0)
        //         ans[nonzero++]=a[count];
        //     count++;
        // }
        // return ans;

        
    }
}
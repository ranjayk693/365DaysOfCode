public class Solution {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.
        int max=a[0];
        int min=a[0];
        int secmin=Integer.MAX_VALUE;
        int secmax=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i] > max){
                secmax = max;
                max = a[i];
            }else if(a[i] > secmax && a[i] < max){
                secmax = a[i];
            }

            if(a[i] < min){
                secmin = min;
                min = a[i];
            }else if(a[i] < secmin && a[i] > min){
                secmin = a[i];
            }
        }
        

        return new int[] {secmax,secmin};
    }
}
// program of maximum sum subarray using kadane's algo
import java.util.*;
import java.lang.*;
class max_subarray {
    static int maxSumSub(int a[]){
        int maxSum=0,curSum=0;
        for(int i=0;i<a.length;i++){
            curSum=curSum+a[i];
            if(curSum>maxSum){
                maxSum=curSum;
            }
            if(curSum<0){
                curSum=0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println( maxSumSub(a));
    }
}

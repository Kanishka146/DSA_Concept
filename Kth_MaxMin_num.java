// Kth max and min element in an array using sorting
import java.util.Arrays;
import java.util.Scanner;

public class Kth_MaxMin_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("enter the array's elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            System.out.print(a[i] + "\t");
        }
        System.out.print("\nNumber(which) smallest element you want :");
        int e=sc.nextInt();
        System.out.println(a[e-1]);

      System.out.print("number(for which) largest element you want :");
        int l=sc.nextInt();
        System.out.println((n-l)+1);
    }
}






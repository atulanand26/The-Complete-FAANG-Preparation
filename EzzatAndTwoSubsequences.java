package Divivsion_A;

import java.util.Scanner;

public class EzzatAndTwoSubsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0){
            int n = sc.nextInt();
            int[] arr = new int[n];

            long max = Long.MIN_VALUE;
            double s = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                s+= arr[i];
                max = Math.max(max, arr[i]);
            }


            s-=max;
            double ans =  s/(n-1)+ max;
            System.out.println(ans);





        }
    }
}

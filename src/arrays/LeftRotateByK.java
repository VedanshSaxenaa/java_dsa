package arrays;
import java.util.Scanner;

public class LeftRotateByK {
    public static int[] rotate (int nums [] ,int k){
        int n = nums.length;
        k = k%n;
        int[] temp = new int [k] ;
        for (int i=0;i<k;i++){
             temp[i] = nums[i];
        }
        for (int i=k; i<n; i++){
            nums[i-k] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[n - k + i] = temp[i];
        }
        return (nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of elements in array");
        int n =sc.nextInt();
        System.out.println("number of elements to rotate");
        int k = sc.nextInt();
        int nums [] = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        rotate(nums, k);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

package arrays;
import java.util.Scanner;

public class LeftRotate {
    public static void rotate(int [] nums){
        int temp = nums[0];
        int n = nums.length;
        for (int i=0; i<n-1; i++){
            nums[i] = nums[i+1];
        }
        nums[n-1] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for (int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        rotate( nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }

}

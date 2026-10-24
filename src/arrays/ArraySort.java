package arrays;
import java.util.Scanner;

public class ArraySort {
    public static boolean arrayCheck(int [] nums){
        int n = nums.length;
        for(int i=1; i<n; i++){
            if (nums[i-1]>nums[i]){
                return false;
            }

        }
         return true ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elements in array");
        int n = sc.nextInt();
        System.out.println("enter the elements of array");
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.print(arrayCheck(nums));
    }
}

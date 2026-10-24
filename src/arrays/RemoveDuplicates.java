package arrays;
import java.util.Scanner;

public class RemoveDuplicates{
    public static int remove(int [] nums){
        //Optimal Approach
        int i=0;
        int n= nums.length;
        for (int j=1; j<n; j++){
            if (nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] nums = {1,1,2,2,3,3,3};
        System.out.println(remove(nums));
    }
}

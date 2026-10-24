package arrays;
import java.util.Scanner;

public class SecondLargest {

    //brute force appraoch
    //second largest
    public static int print(int [] nums){
        int largest = nums[0];
        int n = nums.length;
        for (int i=0; i<n; i++){
            if (nums[i]>largest){
                largest = nums[i];
            }
        }
        int slargest = -1;
        for (int j=0; j<n; j++){
            if (nums[j]>slargest && nums[j]<largest){
               slargest = nums[j];
            }

        }

         return slargest;

    }
// if the element has non negative numbers taking slargest as -1 would work


    //optimal approach
    public static int sLargest(int [] nums){
        int largest = nums[0];
        int slargest = -1;
        int n = nums.length;
        for (int i=0; i<n; i++){
            if (nums[i]>largest ){
                slargest = largest;
                largest = nums[i];
            }else if(nums[i]<largest && nums[i]>slargest){
                slargest = nums[i];
            }
        }
            return slargest;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the elements in array" );
        int n =sc.nextInt();
        System.out.println("enter the elements of array");
        int [] nums = new int[n];
        for (int i=0 ; i<n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(sLargest(nums));
    }

}

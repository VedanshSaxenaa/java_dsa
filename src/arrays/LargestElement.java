package arrays;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = {1,2,8,4,5,6};
        int largest = arr[0];
        int n = arr.length;
        for (int i=1; i<n; i++){
            if (arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element is " + largest );


    }
}

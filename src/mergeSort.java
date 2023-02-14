
import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int arr[]={35,51,1,6,3,2};
        arr= mergeSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int nums[]) {
        if(nums.length == 1) {
            return nums;
        }
        int mid= nums.length/2;

        int [] left =mergeSort(Arrays.copyOfRange(nums,0,mid));
        int [] right=mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right) {
        int i=0,j=0,k=0;  // i points left array | j points right array and k points the main combined array
        int []arr= new int[left.length+right.length];

        while(i<left.length && j<right.length) {
            if(left[i]<= right[j]) {
                arr[k]= left[i];
                i++;
            }
            else {                             // depending on which element is smaller in both the arrays element is placed
                arr[k]= right[j];
                j++;
            }
            k++;
        }

        while(i<left.length) {                    // there may be an array either left or right which may be remaining with elements and other one completed in that
                                                  // case remaining elements are added in the answer array
            arr[k]= left[i];
            i++;k++;
        }                                         // out of 2 any 1 will only be executed

        while(j<right.length) {
            arr[k]= right[j];
            j++;k++;
        }
        return arr;

    }


}

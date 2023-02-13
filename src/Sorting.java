import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int nums[]={7,5,1,62,2};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void  bubble(int nums[]) {
        boolean swapped = false;
        for(int i=0;i<nums.length;i++) {
            for(int j=1;j< nums.length-i;j++) {
                if(nums[j] < nums[j-1]) {
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                }
            }
            if(!swapped) {
                break;           // if no swap is done in the 1st pass then no need check for further passes so break from this loop
            }
        }
    }

    static void selection(int nums[]) {
        for(int i=0;i< nums.length;i++ ){
            int last = nums.length -i-1;
            int max = getMax(nums,0,last);
            swap(nums,max,last);
        }
    }

    static void swap(int nums[],int first,int end) {
        int temp = nums[first];
        nums[first] = nums[end];
        nums[end] = temp;
    }

    private static int getMax(int[] nums, int start, int end) {
        int max = start;
        for(int i=start;i<= end ;i++) {
            if(nums[max] <= nums[i]) {
                max = i;
            }
        }
        return max;
    }
}

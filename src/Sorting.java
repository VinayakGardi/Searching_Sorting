import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5};
        bubble(nums);
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
}

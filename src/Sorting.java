import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int nums[]={4,525,1,553,66,32};
        bubble(nums);

    }

    static void  bubble(int nums[]) {
        for(int i=0;i< nums.length;i++){
            for(int j=0;j< nums.length-1;j++) {
                if(nums[j]>nums[j+1]){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

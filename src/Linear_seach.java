public class Linear_seach {
    public static void main(String[] args) {
        int nums[]= {24,255,6622,62,135};
        int target = 8584;
        System.out.println(linear(nums,target));
    }

    static int linear(int nums[],int target) {
         for(int i=0;i< nums.length;i++) {
             if(nums[i] == target) {
                 return i;
             }
         }
         return -1;

    }
}

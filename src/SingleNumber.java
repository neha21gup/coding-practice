//Given a non-empty array of integers, every element appears twice except for one. Find that single one.

public class SingleNumber {
    public static void main(String[] args){
        //int[] nums = new int[5];
        int[] nums = {4,2,1,2,1};
        System.out.println(findSingleNumber(nums));
    }

    public static int findSingleNumber(int[] nums){
        int res = 0;
        for(int i : nums){
            res = res ^ i;
        }
        return res;
    }
}

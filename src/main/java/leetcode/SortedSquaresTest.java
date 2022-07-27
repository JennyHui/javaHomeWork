package leetcode;

public class SortedSquaresTest {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] resp = new int[n];

        int i = 0;
        int j = n - 1;

        int p = n - 1;
        while (i <= j){
            int iSquares = Math.abs(nums[i]);
            int jSquares = Math.abs(nums[j]);
            if(iSquares > jSquares){
                resp[p] = nums[i] * nums[i];
                i++;
            }else{
                resp[p] = nums[j] * nums[j];
                j--;
            }
            p--;
        }

        return resp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1,-2,3,1,4};
        sortedSquares(nums);
    }


}

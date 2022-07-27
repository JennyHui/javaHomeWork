package leetcode;

/**
 * 输入：nums = [-1,-100,3,99], k = 2
 * 输出：[3,99,-1,-100]
 * 解释:
 * 向右轮转 1 步: [99,-1,-100,3]
 * 向右轮转 2 步: [3,99,-1,-100]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/rotate-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class RotateTest {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;

        // 1,2,3,4
        reverse(nums, 0, nums.length - 1);
        // 4,3,2,1
        reverse(nums, 0, k - 1);
        // 3,4,1,2
        reverse(nums, k, nums.length - 1);
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6};
        rotate(nums, 2);

    }
}

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int res = 0;
        int cnt = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                cnt++;
            else {
                res = Math.max(res, cnt);
                cnt = 0;
            }
        }
        res = Math.max(res, cnt);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(MaxConsecutiveOnes.findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}));
    }

}

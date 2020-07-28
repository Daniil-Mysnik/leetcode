public class MakeTwoArraysEqualByReversingSubArrays {
    public static boolean canBeEqual(int[] target, int[] arr) {
        int[] test = new int[1001];
        for(int i : target) {
            test[i]++;
        }
        for(int i : arr) {
            test[i]--;
            if(test[i] < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
    }
}

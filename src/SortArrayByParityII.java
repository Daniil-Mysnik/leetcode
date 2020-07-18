import java.util.Arrays;

public class SortArrayByParityII {
    public static int[] sortArrayByParityII(int[] A) {
        int odd = 1;
        int even = 0;
        int[] sorted = new int[A.length];
        for(int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0) {
                sorted[even] = A[i];
                even += 2;
            } else {
                sorted[odd] = A[i];
                odd += 2;
            }
        }
        return sorted;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortArrayByParityII.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }

}

import java.util.Arrays;

public class CanMakeArithmeticProgressionFromSequence {
    public static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int raz = arr[1] - arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] != raz)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(canMakeArithmeticProgression(new int[] {3,5,1}));
    }
}

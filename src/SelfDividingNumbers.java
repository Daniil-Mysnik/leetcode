import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++) {
            int num = i;
            boolean res = true;
            while (num != 0) {
                int ostatok = num % 10;
                if(ostatok == 0) {
                    res = false;
                    break;
                }
                num = num / 10;
                if (i % ostatok != 0) {
                    res = false;
                    break;
                }
            }
            if (res)
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1, 22));
    }
}

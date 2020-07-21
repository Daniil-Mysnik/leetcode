import java.util.HashMap;

public class NumberOfGoodPairs {
    public static int numIdenticalPairs(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Integer key: map.keySet()) {
            res += map.get(key) * (map.get(key) - 1) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(NumberOfGoodPairs.numIdenticalPairs(new int[] {1,2,3,1,1,3}));
    }

}

import java.util.HashMap;
public class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++)
            map.put(numbers[i],i);
 
        for (int i = 0; i < numbers.length; i++) {
            int v = target - numbers[i];
            if (map.containsKey(v) && i != map.get(v)){
                result[0] = i;
                result[1] = map.get(v);
                return result;
            }
        }
        return result;
    }
}

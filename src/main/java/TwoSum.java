import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> counterPartyPosition = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentVal = nums[i];
            int rest = target - nums[i];
            boolean counterPartyExist = counterPartyPosition.containsKey(currentVal);
            if (counterPartyExist) return new int[]{counterPartyPosition.get(currentVal), i};
            else counterPartyPosition.put(rest, i);
        }
        return new int[]{};
    }
}

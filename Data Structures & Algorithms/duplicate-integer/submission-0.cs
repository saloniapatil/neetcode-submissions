public class Solution {
    public bool hasDuplicate(int[] nums) {
        HashSet<int> hMap = new HashSet<int>();
        foreach(int i in nums) {
            if(hMap.Contains(i)){
                return true;
            }
            hMap.Add(i);
        }
        return false;
    }
}

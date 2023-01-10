class Solution {
    public int missingNumber(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        for(var i = 0; i < nums.length + 1; i++) {
            if(!list.contains(i)) {
                return i;
            }
        }
        return 0;
    }
}

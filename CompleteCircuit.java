class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int current = 0;
       int total = 0;
       int start = 0;
       for(var i = 0; i < gas.length; i++) {
           int remaining = gas[i] - cost[i];
           if(current < 0) {
               start = i;
               current = remaining;
           } else {
               current += remaining;
           }
           total += remaining;
       }
       if(total < 0) {
           return -1;
       }
       else {
           return start;
       }
    }
}

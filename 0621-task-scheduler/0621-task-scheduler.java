class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] taskFreq = new int[26];
        for (char task : tasks) {
            taskFreq[task - 'A']++;
        }
        
        Arrays.sort(taskFreq);
        
        int maxFreq = taskFreq[25] - 1;
        int idleSlots = maxFreq * n;
        
        for (int i = 24; i >= 0; i--) {
            idleSlots -= Math.min(taskFreq[i], maxFreq);
        }
        
        idleSlots = Math.max(0, idleSlots);
        
        return tasks.length + idleSlots;
    }
}
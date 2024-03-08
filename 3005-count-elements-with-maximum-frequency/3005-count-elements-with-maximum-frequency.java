class Solution {
    public int maxFrequencyElements(int[] nums) {
    HashMap<Integer, Integer> freqMap = new HashMap<>(); 
            int maxFreq = 0; 
        
            for (int num : nums) {
                freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
                maxFreq = Math.max(maxFreq, freqMap.get(num)); 
            }

            int totalCount = 0; 
        
            for (int freq : freqMap.values()) {
                if (freq == maxFreq) {
                    totalCount += maxFreq; 
                }
            }
            return totalCount;
    }
}
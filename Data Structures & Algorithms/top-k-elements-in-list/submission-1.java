class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> fMap = new HashMap<>();
        for(int num: nums) {
            fMap.merge(num, 1, Integer::sum);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap =
                new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));

        for (Map.Entry<Integer, Integer> entry : fMap.entrySet()) {
            minHeap.offer(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        
        int[] result = new int[minHeap.size()];
        int i = 0;
        while (!minHeap.isEmpty()) {
            result[i] = (minHeap.poll().getKey());
            i++;
        }
        return result;
    }
}

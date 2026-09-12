class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> sMap = new HashMap<>();
        for(String s: strs) {
            char[] cArray = s.toCharArray();
            Arrays.sort(cArray);
            String currString = new String(cArray);
            List<String> anagrams = sMap.getOrDefault(currString, 
                                                      new ArrayList<>());
            anagrams.add(s);
            sMap.put(currString, anagrams);
        }

        List<List<String>> answer = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: sMap.entrySet()) {
            answer.add(entry.getValue());
        }
        return answer;
    }
}

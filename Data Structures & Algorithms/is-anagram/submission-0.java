class Solution {

    public boolean isAnagram(String s, String t) {
        // s and t both contains smaller alphabets
        int m = s.length();
        int n = t.length();
        if(m != n) return false;
        int [] sCharArray = new int[26];
        
        for(int i = 0; i < m; i++) {
            char sChar = s.charAt(i);
            sCharArray[sChar - 'a']++;
            char tChar = t.charAt(i);
            sCharArray[tChar - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(sCharArray[i] != 0) return false;
        }

        return true;
    }
}

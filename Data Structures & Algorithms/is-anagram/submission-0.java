class Solution {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];


        for(char ch : s.toCharArray()){
            freq1[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            freq2[ch - 'a']++;
        }

        if(freq1.length != freq2.length) return false;

        int i = 0;


        while(i < freq1.length && i < freq2.length){
            if(freq1[i] != freq2[i]) return false;
            i++;
        }

        return true;


       

    }
}

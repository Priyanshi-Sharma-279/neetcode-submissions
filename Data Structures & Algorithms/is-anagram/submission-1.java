class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false; 
        char[] s0 = s.toCharArray();
        char[] s1 = t.toCharArray();

        Arrays.sort(s0);
        Arrays.sort(s1);

        return Arrays.equals(s0,s1);


       
      

    }
}

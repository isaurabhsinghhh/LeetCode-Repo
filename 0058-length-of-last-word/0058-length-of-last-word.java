class Solution {
    public int lengthOfLastWord(String s) {

        String[] ans= s.split(" ");
        int l = ans.length;

        String word= ans[l-1];

        int answer = word.length();

        return answer;
    }

    
}
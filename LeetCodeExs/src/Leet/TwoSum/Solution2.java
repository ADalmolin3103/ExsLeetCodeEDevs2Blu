package Leet.TwoSum;

public class Solution2 {
    public void reverseString(char[] s) {
        char t;
        int l = s.length;
        int metade = l/2;
        for(int i = 0; i < metade; i++){
            t = s[i];
            s[i] = s[l-i-1];
            s[l-i-1] = t;
        }
    }
}

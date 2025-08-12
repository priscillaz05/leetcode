// Last updated: 8/12/2025, 2:23:34 PM
class Solution {
    public int romanToInt(String s) {
        int[] map = new int[256];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;

        char[] roman = s.toCharArray();

        int ans = map[roman[roman.length - 1]];
        for (int i = roman.length - 2; i >= 0; i--) {
            if(map[roman[i]] < map[roman[i+1]]){
                ans -= map[roman[i]];
            }else{
                ans += map[roman[i]];
            }
        }
        return ans;
    }
}
// Last updated: 7/11/2025, 9:31:28 PM
class Solution {
    public String sortString(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);

        return new String(c);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<String> sorted = new ArrayList<>();
        HashMap<String, List<String>> dict = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortString(str);

            if (dict.containsKey(sortedStr)) {
                List<String> tmp = dict.get(sortedStr);
                tmp.add(str);
            } else {
                List<String> tmp = new ArrayList<>();
                tmp.add(str);
                dict.put(sortedStr, tmp);
            }
        }

        return new ArrayList<>(dict.values());
    }
}
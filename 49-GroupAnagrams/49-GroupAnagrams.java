// Last updated: 7/11/2025, 9:40:39 PM
class Solution {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> dict = new HashMap<>();

        for (String str : strs) {
            String sortedStr = sortString(str);

            if (dict.containsKey(sortedStr)) {
                dict.get(sortedStr).add(str);
            } else {
                dict.put(sortedStr, new ArrayList<>(List.of(str)));
            }
        }

        return new ArrayList<>(dict.values());
    }
}
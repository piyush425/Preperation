import java.util.*;

class groupOfAnagram {



    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26]; // for 'a' to 'z'
            for (char c : str.toCharArray()) {
                count[c - 'a']++;
            }

            // Build key like: a2b1c0...z0
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append('#'); // delimiter to avoid ambiguity
                sb.append(count[i]);
            }
            String key = sb.toString();

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }


    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        groupOfAnagram solution=new groupOfAnagram();

        List<List<String>> result=solution.groupAnagrams(strs);

        result.forEach(arr->System.out.println(Arrays.asList(arr)));
    }
}
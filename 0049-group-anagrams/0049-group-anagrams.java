
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Step 1: Create a map to group anagrams
        Map<String, List<String>> map = new HashMap<>();

        // Step 2: Go through each word in the array
        for (String word : strs) {
            // Convert word to char array and sort it
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String key = new String(letters); // sorted word is the key

            // If the key is not in the map, add it with an empty list
            map.computeIfAbsent(key, k -> new ArrayList<>());

            // Add the original word to the list for this key
            map.get(key).add(word);
        }

        // Step 3: Return all grouped anagram lists
        return new ArrayList<>(map.values());
    }
}

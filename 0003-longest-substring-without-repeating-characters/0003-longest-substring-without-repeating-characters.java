// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         int start = 0;
//         int end  = 0;
//         int maxlen =0;
//         int len = s.length();
//         List<Character> li = new  List<>;
//         while(end<len){
//             if(!li.contains(charAt(end)))
//             li.add(charAt(end))
//         }

//     }
// }
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (charSet.contains(s.charAt(right))) {
                charSet.remove(s.charAt(left));
                left++;
            }

            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;       
    }
}
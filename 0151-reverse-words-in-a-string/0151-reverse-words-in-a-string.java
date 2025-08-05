class Solution {
    public String reverseWords(String s) {

        String [] san = s.trim().split("\\s+");

        StringBuilder rev = new StringBuilder();

        for(int i = san.length-1;i>=0;i--){
            rev.append(san[i]);

            if(i!=0)rev.append(" ");
        }

        return rev.toString();
    }
}

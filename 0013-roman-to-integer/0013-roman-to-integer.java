class Solution {
    public int romanToInt(String s) {
        // int res = 0;
        // Map<Character, Integer> roman = new HashMap<>();
        // roman.put('I', 1);
        // roman.put('V', 5);
        // roman.put('X', 10);
        // roman.put('L', 50);
        // roman.put('C', 100);
        // roman.put('D', 500);
        // roman.put('M', 1000);

        // for (int i = 0; i < s.length() - 1; i++) {
        //     if (roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))) {
        //         res -= roman.get(s.charAt(i));
        //     } else {
        //         res += roman.get(s.charAt(i));
        //     }
        // }

        // return res + roman.get(s.charAt(s.length() - 1));    

            int ans = 0;
            int n = 0;
            for(int i = s.length() - 1; i>=0; i--){
                switch(s.charAt(i)){
                    case 'I' : n=1;break;
                    case 'V' : n=5;break;
                    case 'X' : n=10;break;
                    case 'L' : n=50;break;
                    case 'C' : n=100;break;
                    case 'D' : n=500;break;
                    case 'M' : n=1000;break;
                }
                if(4*n<ans){
                    ans-=n;
                }else{
                    ans+=n;
                }
            }
            return ans;
    }
}
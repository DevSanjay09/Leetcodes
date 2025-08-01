

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t = new ListNode(0);
        ListNode d = t;
        int ca = 0;

        while(l1!=null || l2!=null ||ca!=0){
            int s = ca;
            if(l1!=null)
            {
                s=s+l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s=s+l2.val;
                l2=l2.next;
            }
            d.next = new ListNode(s%10);
            ca=s/10;
            d=d.next;
        }
        return t.next;
    }
}

// [2,4,3] [5,6,4]  storing list = [7,0,8]

// s=0+2+5=7   7%10=7
// s=0+4+6=10  10%10=0 ca-> 10/10=1
// s=1+3+4=8   8%10=8

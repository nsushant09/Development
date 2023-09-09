package DSA.all;

class TwoNumbers {

    public static void main(String[] args) {

        ListNode l1 = add(new int[] {2,4,3});
        ListNode l2 = add(new int[] {5,6,4});
        print(l1);
        print(l2);

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode response = null;

        ListNode nextValue1 = l1.next;
        ListNode nextValue2 = l2.next;

        int remainder = 0;
        while(nextValue1 != null && nextValue2 != null){
            int sum = ((nextValue1.val + nextValue2.val) % 10) + remainder;
            remainder = nextValue1.val / nextValue2.val;

            if(response == null){
                response = new ListNode(sum);
            }else{
                response.next = new ListNode(sum);
                response = response.next;
            }

            nextValue1 = l1.next;
            nextValue2 = l2.next;
        }

        return response;
    }

    static void print(ListNode listNode){
        ListNode next = listNode.next;
        while(next != null){
            System.out.println(listNode.val);
            next = listNode.next;
        }
    }

    static ListNode add(int[] nums){
        ListNode result = new ListNode(nums[0]);

        ListNode backup = null;
        for(int i = 1 ; i < nums.length; i++){
            for(int j = nums.length; j > 1; j--){
                backup = result.next;
            }
        }
        return result;
    }
}

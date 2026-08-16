package LinkedList;

public class happy {

    public static void main(String[] args) {

        happy obj = new happy();

        int n = 19;

        boolean result = obj.isHappy(n);

        System.out.println(result);
    }

    // Happy Number
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));

        } while (slow != fast);

        return slow == 1;
    }

    private int findSquare(int number) {

        int ans = 0;

        while (number > 0) {
            int rem = number % 10;
            ans += rem * rem;
            number /= 10;
        }

        return ans;
    }

    // Middle of the Linked List
    public ListNode middleNode(ListNode head) {

        ListNode s = head;
        ListNode f = head;

        while (f != null && f.next != null) {
            s = s.next;
            f = f.next.next;
        }

        return s;
    }
}
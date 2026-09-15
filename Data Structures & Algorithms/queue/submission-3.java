class ListNode {
    int val = 0;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class Deque {
    private ListNode head;
    private ListNode tail;

    public Deque() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public void append(int val) {
        ListNode node = new ListNode(val);
        if (isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
    }

    public void appendleft(int val) {
        ListNode node = new ListNode(val);
        if (isEmpty()) {
            this.head = this.tail = node;
        } else {
            node.next = this.head;
            this.head.prev = node;
            this.head = node;
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        }

        int val = this.tail.val;

        if (this.head == this.tail) {
            this.head = this.tail = null;
        } else {
            this.tail = this.tail.prev;
            this.tail.next = null;
        }

        return val;
    }

    public int popleft() {
        if (isEmpty()) {
            return -1;
        }

        int val = this.head.val;

        if (this.head == this.tail) {
            this.head = this.tail = null;
        } else {
            this.head = this.head.next;
            this.head.prev = null;
        }
        return val;
    }
}
